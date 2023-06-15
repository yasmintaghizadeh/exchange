package com.crypto.exchange.repository;

import com.crypto.exchange.models.entities.User;
import com.crypto.exchange.models.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,String> {

    Wallet findByWalletID(String walletId);
}
