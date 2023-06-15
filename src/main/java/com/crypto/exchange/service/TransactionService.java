package com.crypto.exchange.service;

import com.crypto.exchange.models.entities.Transaction;
import com.crypto.exchange.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends AbstractService<Transaction, TransactionRepository> {


}
