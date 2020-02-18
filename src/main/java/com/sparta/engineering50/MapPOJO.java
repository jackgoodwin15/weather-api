package com.sparta.engineering50;

public class MapPOJO {
    CoordPOJO coord;
    WeatherPOJO[] weather;
    String base;
    MainPOJO main;
    int visibility;
    WindPOJO wind;
    RainPOJO rain;
    CloudPOJO clouds;
    int dt;
    SysPOJO sys;
    int timezone;
    int id;
    String name;
    int cod;

    public MapPOJO() {}

    public MapPOJO(CoordPOJO coord, WeatherPOJO[] weather, String base, MainPOJO main, int visibility, WindPOJO wind, RainPOJO rain, CloudPOJO clouds, int dt, SysPOJO sys, int timezone, int id, String name, int cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.rain = rain;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public CoordPOJO getCoord() {
        return coord;
    }

    public void setCoord(CoordPOJO coord) {
        this.coord = coord;
    }

    public WeatherPOJO[] getWeather() {
        return weather;
    }

    public void setWeather(WeatherPOJO[] weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainPOJO getMain() {
        return main;
    }

    public void setMain(MainPOJO main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public WindPOJO getWind() {
        return wind;
    }

    public void setWind(WindPOJO wind) {
        this.wind = wind;
    }

    public RainPOJO getRain() {
        return rain;
    }

    public void setRain(RainPOJO rain) {
        this.rain = rain;
    }

    public CloudPOJO getClouds() {
        return clouds;
    }

    public void setClouds(CloudPOJO clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public SysPOJO getSys() {
        return sys;
    }

    public void setSys(SysPOJO sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}




