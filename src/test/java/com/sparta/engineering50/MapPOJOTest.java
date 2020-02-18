package com.sparta.engineering50;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapPOJOTest {
    static Mapper mapper;
    static MapPOJO mapPOJO;
    static String cityName = "London";

    @BeforeAll
    static void init() {
        mapper = new Mapper();
        mapper.createObjectMapper();
        mapper.readJsonToObjectByCityName(cityName);
        mapPOJO = mapper.getMapPOJO();
    }

    @Test
    public void baseShouldBeAString() {
        String base = mapPOJO.getBase();
        boolean result = base.matches("[a-zA-Z]*");
        assertTrue(result);
    }

    @Test
    public void visibilityShouldBeBetween0And10000() {
        double visibility = mapPOJO.getVisibility();
        boolean result = visibility >= 0 && visibility <= 10000;
        assertTrue(result);
    }

    @Test
    public void dtShouldBeTenDigitsLong() {
        int dt = mapPOJO.getDt();
        boolean result = String.valueOf(dt).length() == 10;
        assertTrue(result);
    }

    @Test
    public void timezoneShouldBeGreaterThanOrEqualToZero() {
        int timezone = mapPOJO.getTimezone();
        boolean result = timezone >= 0;
        assertTrue(result);
    }

    @Test
    public void idShouldBeSevenDigitsLong() {
        int id = mapPOJO.getId();
        boolean result = String.valueOf(id).length() == 7;
        assertTrue(result);
    }

    @Test
    public void checkNameIsCorrect() {
        String name = mapPOJO.getName();
        assertEquals(cityName, name);
    }

    @Test
    public void codShouldBe200() {
        int cod = mapPOJO.getCod();
        assertEquals(200, cod);
    }
}