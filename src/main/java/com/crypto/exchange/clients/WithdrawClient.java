package com.crypto.exchange.clients;

import com.crypto.exchange.models.requestresponse.BankTransactionRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "withdraw",url = "http://localhost:8083/")
public interface WithdrawClient {
    @PostMapping("/deposit")
    void deposit(@RequestBody BankTransactionRequest request);
}
