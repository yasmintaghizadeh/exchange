package com.crypto.exchange.service;

import com.crypto.exchange.clients.DepositClient;
import com.crypto.exchange.clients.WithdrawClient;
import com.crypto.exchange.exception.NotEnoughAmountException;

import com.crypto.exchange.models.entities.Wallet;
import com.crypto.exchange.models.requestresponse.BankTransactionRequest;
import com.crypto.exchange.models.requestresponse.DepositRequest;
import com.crypto.exchange.repository.WalletRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService extends AbstractService<Wallet, WalletRepository> {

    @Autowired
    private DepositClient depositClient;

    @Autowired
    private WithdrawClient withdrawClient;

    @Transactional(rollbackOn = Exception.class)
    private void bankDeposit(DepositRequest request){
        Wallet wallet = repository.findByWalletID(request.getWalletId());
        depositClient.withdraw(BankTransactionRequest.builder()
                .cardNumber(wallet.getUser().getCreditCardNumber())
                .trackingId(TrackingIdGenerator.idGenerator())
                .amount(request.getAmount()).build());
        wallet.setBalance(wallet.getBalance() + request.getAmount());
        repository.save(wallet);

    }
    @Transactional(rollbackOn = Exception.class)
    private void bankWithdraw(DepositRequest request){
        Wallet wallet = repository.findByWalletID(request.getWalletId());
        withdrawClient.deposit(BankTransactionRequest.builder()
                .accountNumber(wallet.getUser().getAccountNumber())
                .trackingId(TrackingIdGenerator.idGenerator())
                .amount(request.getAmount()).build());
        wallet.setBalance(wallet.getBalance() - request.getAmount());
        repository.save(wallet);
    }
    @Transactional(rollbackOn = NotEnoughAmountException.class)
    private void walletToWallet(DepositRequest request) throws NotEnoughAmountException {
       walletToWalletWithdraw(request);
       walletToWalletDeposit(request);
    }

    private void walletToWalletDeposit(DepositRequest request){
        Wallet wallet=repository.findByWalletID(request.getReceiverWalletId());
        wallet.setBalance(wallet.getBalance()+ request.getAmount());
    }

    private void walletToWalletWithdraw(DepositRequest request) throws NotEnoughAmountException {
        Wallet wallet=repository.findByWalletID(request.getWalletId());
        if (wallet.getBalance()< request.getAmount()){
            throw new NotEnoughAmountException("not-enough-amount");
        }else
            wallet.setBalance(wallet.getBalance() - request.getAmount());
    }

    public void transaction(DepositRequest request) throws NotEnoughAmountException {
        switch (request.getType()){
            case BANK_DEPOSIT ->  bankDeposit(request);
            case WALLET_TO_WALLET -> walletToWallet(request);
            case BANK_WITHDRAW -> bankWithdraw(request);
        }
    }




}
