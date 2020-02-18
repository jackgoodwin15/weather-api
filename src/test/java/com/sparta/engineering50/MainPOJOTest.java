package com.sparta.engineering50;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPOJOTest {
    static Mapper mapper;
    static MainPOJO mainPOJO;
    static String cityName = "London";

    @BeforeAll
    static void init() {
        mapper = new Mapper();
        mapper.createObjectMapper();
        mapper.readJsonToObjectByCityName(cityName);
        mainPOJO = mapper.getMapPOJO().getMain();
    }

    @Test
    public void mainTempShouldBeBetween200And400() {
        double temp = mainPOJO.getTemp();
        boolean result = temp >= 200 && temp <= 400;
        assertTrue(result);
    }

    @Test
    public void mainFeelsLikeShouldBeBetween200And400() {
        double feelsLike = mainPOJO.getFeels_like();
        boolean result = feelsLike >= 200 && feelsLike <= 400;
        assertTrue(result);
    }

    @Test
    public void mainTempMinShouldBeBetween200And400() {
        double tempMin = mainPOJO.getTemp_min();
        boolean result = tempMin >= 200 && tempMin <= 400;
        assertTrue(result);
    }

    @Test
    public void mainTempMaxShouldBeBetween200And400() {
        double tempMax = mainPOJO.getTemp_max();
        boolean result = tempMax >= 200 && tempMax <= 400;
        assertTrue(result);
    }

    @Test
    public void mainPressureShouldBeBetween1010And1040() {
        double pressure = mainPOJO.getPressure();
        boolean result = pressure >= 1010 && pressure <= 1040;
        assertTrue(result);
    }

    @Test
    public void mainHumidityShouldBeBetween1And150() {
        double humidity = mainPOJO.getHumidity();
        boolean result = humidity >= 1 && humidity <= 150;
        assertTrue(result);
    }
}
