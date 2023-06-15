package com.crypto.exchange.models.requestresponse;

import com.crypto.exchange.models.enums.TransactionBetween;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepositRequest {
    private String walletId;
    private Long amount;
    private TransactionBetween type;
    private String receiverWalletId;
}
