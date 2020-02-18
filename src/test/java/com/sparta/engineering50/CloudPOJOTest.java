package com.sparta.engineering50;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CloudPOJOTest {
    static Mapper mapper;
    static CloudPOJO cloudPOJO;
    static String cityName = "London";

    @BeforeAll
    static void init() {
        mapper = new Mapper();
        mapper.createObjectMapper();
        mapper.readJsonToObjectByCityName(cityName);
        cloudPOJO = mapper.getMapPOJO().getClouds();
    }

    @Test
    public void cloudAllShouldBeGreaterThanOrEqualToZero() {
        double all = cloudPOJO.getAll();
        boolean result = all >= 0;
        assertTrue(result);
    }
}
