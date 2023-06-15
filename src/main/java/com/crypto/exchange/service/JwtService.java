package com.crypto.exchange.service;

import com.crypto.exchange.models.dto.UserDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
@Service
public class JwtService {
    @Autowired
    private ObjectMapper objectMapper;

    @PostConstruct
    public void init(){
        objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,false);

    }

    public UserDetails getAllClaimsFromToken(String token){
        if (token.startsWith("Bearer ")) {
            token = token.substring(8);
        }
        Base64.Decoder decoder = Base64.getUrlDecoder();

        String[] chunks = token.split("\\.");

        String header = new String(decoder.decode(chunks[0]));
        String payload = new String(decoder.decode(chunks[1]));
        try {
            UserDetails userDetails = objectMapper.readValue(payload, UserDetails.class);
            token = "Bearer " + token;
            userDetails.setToken(token);
            return userDetails;
        } catch (JsonProcessingException e) {
            throw new ServiceException("TOKEN_EXCEPTION");
        }
    }
}
