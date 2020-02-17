package com.sparta.engineering50;

public class App
{
    public static void main( String[] args )
    {
        Mapper mapper = new Mapper();
        mapper.createObjectMapper();
        mapper.readJsonToObject();

        MapPOJO mapPOJO = mapper.getMapPOJO();
    }
}
