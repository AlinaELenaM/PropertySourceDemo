package com.propertysource.demo.shop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/utilities.properties")
public class ShopUtilitiesProperties {
    
}
