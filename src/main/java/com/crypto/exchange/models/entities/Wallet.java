package com.crypto.exchange.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "wallet")
public class Wallet extends AbstractEntity {
    private String walletPID;
    private Long balance;


    @OneToMany(mappedBy = "wallet",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<CoinEntity> coin;

    @OneToMany(mappedBy = "wallet",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Transaction> transactions;
}
