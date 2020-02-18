package com.sparta.engineering50;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SysPOJOTest {
    static Mapper mapper;
    static SysPOJO sysPOJO;
    static String cityName = "London";

    @BeforeAll
    static void init() {
        mapper = new Mapper();
        mapper.createObjectMapper();
        mapper.readJsonToObjectByCityName(cityName);
        sysPOJO = mapper.getMapPOJO().getSys();
    }

    @Test
    public void sysTypeShouldBeBetween1And3() {
        int type = sysPOJO.getType();
        boolean result = type > 0 && type < 4;
        assertTrue(result);
    }

    @Test
    public void sysIdShouldBeFourDigitsLong() {
        int id = sysPOJO.getId();
        boolean result = String.valueOf(id).length() == 4;
        assertTrue(result);
    }

    @Test
    public void sysCountryShouldBeTwoOrThreeDigitsLong() {
        String countryCode = sysPOJO.getCountry();
        boolean result = countryCode.length() == 2 || countryCode.length() == 3;
        assertTrue(result);
    }

    @Test
    public void sysCountryShouldBeUppercase() {
        String countryCode = sysPOJO.getCountry();
        boolean result = countryCode.matches("[A-Z]*");
        assertTrue(result);
    }

    @Test
    public void sunriseShouldBeTenDigitsLong() {
        int sunrise = sysPOJO.getSunrise();
        boolean result = String.valueOf(sunrise).length() == 10;
        assertTrue(result);
    }

    @Test
    public void sunsetShouldBeTenDigitsLong() {
        int sunset = sysPOJO.getSunset();
        boolean result = String.valueOf(sunset).length() == 10;
        assertTrue(result);
    }
}
