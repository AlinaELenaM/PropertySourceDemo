package com.propertysource.demo.shop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Service;

@Service
public class ShopTaxService {
    
    private AnnotationConfigApplicationContext context = null;

    public ConfigurableEnvironment properties() {
        if (context == null){

        context = new AnnotationConfigApplicationContext();
        context.register(ShopFoodProperties.class);
        context.register(ShopUtilitiesProperties.class);
        context.refresh();
        }
        return context.getEnvironment();
    }
}
