package com.crypto.exchange.models.requestresponse;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankTransactionRequest {
    private String cardNumber;
    private String accountNumber;
    private  Integer trackingId;
    private Long amount;
}
