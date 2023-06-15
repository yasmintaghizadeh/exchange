package com.crypto.exchange.controller;

import com.crypto.exchange.convertor.AbstractConvertor;
import com.crypto.exchange.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/exchange")
public class AbstractController <E,D,S extends AbstractService<E,? extends JpaRepository<E,String>>> {
    @Autowired
    protected S service;
    @Autowired
    protected AbstractConvertor<E,D> convertor;

}
