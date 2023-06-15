package com.crypto.exchange.models.entities;

import com.crypto.exchange.models.enums.Coin;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CoinEntity extends AbstractEntity{
    @Enumerated
    private Coin coin;
    private Long coinBalance;
    @ManyToOne(fetch = FetchType.LAZY)
    private Wallet wallet;

}
