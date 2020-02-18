package com.sparta.engineering50;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WindPOJOTest {
    static Mapper mapper;
    static WindPOJO windPOJO;
    static String cityName = "London";

    @BeforeAll
    static void init() {
        mapper = new Mapper();
        mapper.createObjectMapper();
        mapper.readJsonToObjectByCityName(cityName);
        windPOJO = mapper.getMapPOJO().getWind();
    }

    @Test
    public void windSpeedShouldBeBetween1And10() {
        double speed = windPOJO.getSpeed();
        boolean result = speed >= 1 && speed <= 10;
        assertTrue(result);
    }

    @Test
    public void windDegShouldBeBetween0And360() {
        double deg = windPOJO.getDeg();
        boolean result = deg >= 0 && deg <= 360;
        assertTrue(result);
    }

    @Test
    public void windGustShouldBeGreaterThanOrEqualToZero() {
        double gust = windPOJO.getGust();
        boolean result = gust >= 0;
        assertTrue(result);
    }
}
