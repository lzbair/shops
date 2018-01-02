package io.challenges.shop.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "io.challenges.shop.repository")
public class MongoConfig {

    @Autowired
    private Environment env;

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), env.getProperty("db.name"));
    }

    @Bean
    public MongoClient mongo() throws Exception {
        return new MongoClient(new MongoClientURI(env.getProperty("db.url")));
    }

}
