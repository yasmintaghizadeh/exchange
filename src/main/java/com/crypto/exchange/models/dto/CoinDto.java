package com.crypto.exchange.models.dto;

import com.crypto.exchange.models.entities.Wallet;
import com.crypto.exchange.models.enums.Coin;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CoinDto extends AbstractDto{
    private Coin coin;
    private Long coinBalance;
    private Wallet wallet;

}
