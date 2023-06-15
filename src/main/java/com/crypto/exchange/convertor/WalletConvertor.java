package com.crypto.exchange.convertor;

import com.crypto.exchange.models.dto.WalletDto;
import com.crypto.exchange.models.entities.Wallet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WalletConvertor extends AbstractConvertor<Wallet, WalletDto> {
}
