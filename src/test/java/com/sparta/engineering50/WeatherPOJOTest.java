package com.sparta.engineering50;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeatherPOJOTest {
    static Mapper mapper;
    static WeatherPOJO weatherPOJO;
    static String cityName = "London";

    @BeforeAll
    static void init() {
        mapper = new Mapper();
        mapper.createObjectMapper();
        mapper.readJsonToObjectByCityName(cityName);
        weatherPOJO = mapper.getMapPOJO().getWeather()[0];
    }

    @Test
    public void weatherIdShouldBeGreaterThanZero() {
        boolean result = weatherPOJO.getId() > 0;
        assertTrue(result);
    }

    @Test
    public void weatherMainShouldBeAString() {
        String main = weatherPOJO.getMain();
        boolean result = main.matches("[a-zA-Z]*");
        assertTrue(result);
    }

    @Test
    public void weatherDescriptionShouldBeAString() {
        String description = weatherPOJO.getDescription();
        boolean result = description.matches("[a-zA-Z ]*");
        assertTrue(result);
    }

    @Test
    public void weatherIconShouldBeAString() {
        String icon = weatherPOJO.getIcon();
        boolean result = icon.matches("[a-zA-Z0-9]*");
        assertTrue(result);
    }

    @Test
    public void weatherIconShouldBeInFormatOfTwoNumbersAndOneLetter() {
        String icon = weatherPOJO.getIcon();
        boolean result = icon.matches("[0-9][0-9][a-z]");
        assertTrue(result);
    }
}
