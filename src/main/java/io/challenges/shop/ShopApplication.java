package io.challenges.shop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "io.challenges.shop.config")
public class ShopApplication {

    public static void main(String... args){
        new SpringApplicationBuilder(ShopApplication.class)
                .properties("server.port=9000")
                .run(args);
    }
}
