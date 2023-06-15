package com.crypto.exchange.controller;

import com.crypto.exchange.models.dto.UserDto;
import com.crypto.exchange.models.entities.User;
import com.crypto.exchange.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends AbstractController<User, UserDto, UserService> {

    @PostMapping("/creat-user")
    public void addUser(@RequestBody UserDto user){
        service.add(convertor.convertDto(user));
    }

}
