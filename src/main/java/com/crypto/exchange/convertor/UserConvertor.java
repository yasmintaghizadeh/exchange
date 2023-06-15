package com.crypto.exchange.convertor;

import com.crypto.exchange.models.dto.UserDto;
import com.crypto.exchange.models.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserConvertor extends AbstractConvertor<User, UserDto> {
}
