package io.challenges.shop.config;

import io.challenges.shop.repository.ShopRepository;
import io.challenges.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig {

    @Autowired
    ShopRepository shopRepository;

    @Autowired
    private Environment env;


    @Bean
    ShopService shopService() {
        return new ShopService(shopRepository);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**");
            }

            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                if (!registry.hasMappingForPattern("/ui/**")) {
                    registry.addResourceHandler("/ui/**").addResourceLocations(env.getProperty("ui.dir"));
                }
            }
        };


    }


}
