package com.hiddenfounders.recrutement.shop.spring.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.hiddenfounders.recrutement.shop.spring.repository")
public class MongoConfig {

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "shops");
    }

    private MongoClient mongo() throws Exception {
        return new MongoClient(new MongoClientURI("mongodb://localhost:9005"));
    }

}
