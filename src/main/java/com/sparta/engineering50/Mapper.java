package com.sparta.engineering50;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Mapper {
    ObjectMapper objectMapper;
    MapPOJO mapPOJO = null;

    public void createObjectMapper() {
        objectMapper = new ObjectMapper();
    }

    public void readJsonToObject() {
        try {
            mapPOJO = objectMapper.readValue(new URL("http://api.openweathermap.org/data/2.5/weather?q=London&appid=79b94cd487024d6faf17794f7e7cab25"), MapPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MapPOJO getMapPOJO() {
        return mapPOJO;
    }
}
