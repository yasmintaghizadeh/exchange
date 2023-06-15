package com.crypto.exchange.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends AbstractEntity {
    private String username;
    private String name;
    private String family;
    private String phoneNumber;
    private String email;
    private String creditCardNumber;
    private String accountNumber;
    @OneToOne
    private Wallet wallet;
}
