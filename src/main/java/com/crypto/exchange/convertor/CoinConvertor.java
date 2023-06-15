package com.crypto.exchange.convertor;

import com.crypto.exchange.convertor.AbstractConvertor;
import com.crypto.exchange.models.dto.CoinDto;
import com.crypto.exchange.models.entities.CoinEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoinConvertor extends AbstractConvertor<CoinEntity, CoinDto> {
}
