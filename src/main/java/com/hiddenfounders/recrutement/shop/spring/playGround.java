package com.hiddenfounders.recrutement.shop.spring;

import com.hiddenfounders.recrutement.shop.spring.config.MongoConfig;
import com.hiddenfounders.recrutement.shop.spring.model.Shop;
import com.hiddenfounders.recrutement.shop.spring.repository.ShopRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class playGround {

    public static void main(String... args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
        ShopRepository repo = ctx.getBean(ShopRepository.class);
        List<Shop> shops = repo.findAll();
        shops.stream().forEach(System.out::println);
    }
}
