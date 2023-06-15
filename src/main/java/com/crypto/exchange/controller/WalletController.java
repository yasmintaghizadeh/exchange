package com.crypto.exchange.controller;

import com.crypto.exchange.exception.NotEnoughAmountException;
import com.crypto.exchange.models.dto.WalletDto;
import com.crypto.exchange.models.entities.Wallet;
import com.crypto.exchange.models.requestresponse.DepositRequest;
import com.crypto.exchange.service.WalletService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController extends AbstractController<Wallet, WalletDto, WalletService> {


   @PostMapping("/withdraw-deposit")
   public void transaction(@RequestBody DepositRequest request) throws NotEnoughAmountException {
       service.transaction(request);
   }



}
