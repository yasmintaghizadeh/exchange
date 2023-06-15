package com.crypto.exchange.repository;

import com.crypto.exchange.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
