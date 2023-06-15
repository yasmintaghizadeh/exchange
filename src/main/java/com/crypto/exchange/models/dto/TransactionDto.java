package com.crypto.exchange.models.dto;


import com.crypto.exchange.models.entities.Wallet;
import com.crypto.exchange.models.enums.TransactionStatus;
import com.crypto.exchange.models.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto extends AbstractDto{
    private Date date;
    private Long balance;
    private TransactionStatus status;
    private Long trackingId;
    private TransactionType type;
    private Wallet wallet;
}
