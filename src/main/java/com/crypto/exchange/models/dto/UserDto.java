package com.crypto.exchange.models.dto;

import com.crypto.exchange.models.entities.AbstractEntity;
import com.crypto.exchange.models.entities.Wallet;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends AbstractDto {
    private String username;
    private String name;
    private String family;
    private String phoneNumber;
    private String email;
    private String creditCardNumber;
    private String accountNumber;
    private Wallet wallet;
}
