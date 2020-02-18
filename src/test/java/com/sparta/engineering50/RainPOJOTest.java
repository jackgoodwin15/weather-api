package com.sparta.engineering50;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RainPOJOTest {
    static Mapper mapper;
    static RainPOJO rainPOJO;
    static String cityName = "London";

    @BeforeAll
    static void init() {
        mapper = new Mapper();
        mapper.createObjectMapper();
        mapper.readJsonToObjectByCityName(cityName);
        rainPOJO = mapper.getMapPOJO().getRain();
    }

    @Test
    public void rain3hShouldBeGreaterThanOrEqualToZero() {
        double threeH = rainPOJO.getThreeH();
        boolean result = threeH >= 0.0;
        System.out.println(rainPOJO.getThreeH());
        assertTrue(result);
    }
}
