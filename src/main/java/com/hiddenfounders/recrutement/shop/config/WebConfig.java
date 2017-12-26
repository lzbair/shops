package com.hiddenfounders.recrutement.shop.config;

import com.hiddenfounders.recrutement.shop.repository.ShopRepository;
import com.hiddenfounders.recrutement.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Autowired
    ShopRepository shopRepository;

    @Bean
    ShopService shopService() {
        return new ShopService(shopRepository);
    }
}
