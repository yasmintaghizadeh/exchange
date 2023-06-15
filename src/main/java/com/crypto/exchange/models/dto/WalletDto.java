package com.crypto.exchange.models.dto;

import com.crypto.exchange.models.entities.CoinEntity;
import com.crypto.exchange.models.entities.Transaction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WalletDto extends AbstractDto{
    private String walletId;
    private Long balance;
    private List<CoinEntity> coin;
    private List<Transaction> transactions;

}
