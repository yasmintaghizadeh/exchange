package com.crypto.exchange.clients;

import com.crypto.exchange.models.requestresponse.TransactionRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "deposit",url = "http://localhost:8083/")
public interface DepositClient {
    @PostMapping("/withdraw")
    void withdraw(@RequestBody TransactionRequest request);
}
