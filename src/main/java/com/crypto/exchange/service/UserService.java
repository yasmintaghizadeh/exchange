package com.crypto.exchange.service;

import com.crypto.exchange.models.entities.User;
import com.crypto.exchange.models.entities.Wallet;
import com.crypto.exchange.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, UserRepository>{
    @Autowired
    private WalletService service;


    public void add(User user){
        user.setWallet(Wallet.builder().balance(0L).build());
        repository.save(user);
    }

}
