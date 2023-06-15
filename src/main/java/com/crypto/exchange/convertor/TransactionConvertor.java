package com.crypto.exchange.convertor;

import com.crypto.exchange.models.dto.TransactionDto;
import com.crypto.exchange.models.entities.Transaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionConvertor extends AbstractConvertor<Transaction, TransactionDto> {
}
