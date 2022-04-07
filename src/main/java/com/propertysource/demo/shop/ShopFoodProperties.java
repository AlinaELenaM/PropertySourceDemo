package com.propertysource.demo.shop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
@PropertySource("classpath:/fruits.properties"),
@PropertySource("classpath:/meat.properties")
})

public class ShopFoodProperties {
    
}
