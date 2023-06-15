package com.crypto.exchange;

import com.crypto.exchange.models.requestresponse.TransactionResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableFeignClients
public class ExchangefinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExchangefinalApplication.class, args);

    }

}
