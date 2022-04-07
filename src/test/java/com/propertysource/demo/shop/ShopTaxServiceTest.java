package com.propertysource.demo.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootTest
public class ShopTaxServiceTest {

    @Autowired
    ShopTaxService shopTaxService;

    @Test
    void testPropertiesFruit() {
        assertEquals("0.2", shopTaxService.properties().getProperty("apple"));
        assertEquals("0.1", shopTaxService.properties().getProperty("banana"));
        assertEquals("0.3", shopTaxService.properties().getProperty("strawberry"));

        log.info(String.format("apple %s", shopTaxService.properties().getProperty("apple")));
    }

    @Test
    void testPropertiesMeat() {
        assertEquals("0.5", shopTaxService.properties().getProperty("chicken"));
        assertEquals("0.7", shopTaxService.properties().getProperty("beef"));
        assertEquals("0.6", shopTaxService.properties().getProperty("pork"));

        log.info(String.format("beef %s", shopTaxService.properties().getProperty("beef")));
    }

    @Test
    void testPropertiesUtilities() {
        assertEquals("0.6", shopTaxService.properties().getProperty("cleaner"));
        assertEquals("0.2", shopTaxService.properties().getProperty("bagger"));
        assertEquals("0.9", shopTaxService.properties().getProperty("shop_bills"));

        log.info(String.format("shop_bills %s", shopTaxService.properties().getProperty("shop_bills")));
    }
}
