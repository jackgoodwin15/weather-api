package com.sparta.engineering50;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoordPOJOTest {
    static Mapper mapper;
    static CoordPOJO coordPOJO;
    static String cityName = "London";

    @BeforeAll
    static void init() {
        mapper = new Mapper();
        mapper.createObjectMapper();
        mapper.readJsonToObjectByCityName(cityName);
        coordPOJO = mapper.getMapPOJO().getCoord();
    }

    @Test
    public void longitudeShouldBeADouble() {
        double longitude = coordPOJO.getLon();
        boolean result = longitude >= 0 || longitude <= 0;
        assertTrue(result);
    }

    @Test
    public void latitudeShouldBeADouble() {
        double latitude = coordPOJO.getLat();
        boolean result = latitude >= 0 || latitude <= 0;
        assertTrue(result);
    }
}
