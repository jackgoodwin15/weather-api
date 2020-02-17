package com.sparta.engineering50;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class Mapper {
    ObjectMapper objectMapper;
    MapPOJO mapPOJO = null;

    public void createObjectMapper() {
        objectMapper = new ObjectMapper();
    }

    public void readJsonToObject() {
        String key = getApiKey();
        try {
            mapPOJO = objectMapper.readValue(new URL("http://api.openweathermap.org/data/2.5/weather?q=London&appid=" + key), MapPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MapPOJO getMapPOJO() {
        return mapPOJO;
    }

    public String getApiKey() {
        Properties prop = new Properties();

        try (InputStream input = Mapper.class.getClassLoader().getResourceAsStream("config.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return prop.getProperty("API_KEY");
    }
}
