package com.crypto.exchange.service;

import com.crypto.exchange.models.entities.CoinEntity;
import com.crypto.exchange.repository.CoinRepository;
import org.springframework.stereotype.Service;

@Service
public class CoinService extends AbstractService<CoinEntity, CoinRepository> {
}
