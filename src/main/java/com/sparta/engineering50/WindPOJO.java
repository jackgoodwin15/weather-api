package com.sparta.engineering50;

public class WindPOJO {
    double speed;
    double deg;

    public WindPOJO(){}

    public WindPOJO(double speed, double deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }
}
