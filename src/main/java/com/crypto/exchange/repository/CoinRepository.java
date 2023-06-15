package com.crypto.exchange.repository;

import com.crypto.exchange.models.entities.CoinEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<CoinEntity,String> {
}
