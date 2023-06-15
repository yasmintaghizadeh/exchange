package com.crypto.exchange.service;

import com.crypto.exchange.clients.DepositClient;
import com.crypto.exchange.models.dto.UserDetails;
import com.crypto.exchange.models.entities.Transaction;
import com.crypto.exchange.models.requestresponse.TransactionRequest;
import com.crypto.exchange.models.requestresponse.TransactionResponse;
import com.crypto.exchange.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends AbstractService<Transaction, TransactionRepository> {
    @Autowired
    private JwtService jwtService;
    @Autowired
    private DepositClient depositClient;

    public void deposit(TransactionRequest request, UserDetails user){
     depositClient.withdraw(request);
    }



}
