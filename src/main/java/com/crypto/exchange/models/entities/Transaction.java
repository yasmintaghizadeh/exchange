package com.crypto.exchange.models.entities;

import com.crypto.exchange.models.enums.TransactionStatus;
import com.crypto.exchange.models.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction extends AbstractEntity{

    private Date date;
    private Long balance;
    @Enumerated
    private TransactionStatus status;
    private Long trackingId;
    @Enumerated
    private TransactionType type;
    @ManyToOne(fetch = FetchType.LAZY)
    private Wallet wallet;
}
