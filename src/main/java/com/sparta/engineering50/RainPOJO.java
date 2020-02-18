package com.sparta.engineering50;

import com.fasterxml.jackson.annotation.JsonSetter;

public class RainPOJO {
    double threeH;

    public RainPOJO(){}

    public RainPOJO(double threeH) {
        this.threeH = threeH;
    }

    public double getThreeH() {
        return threeH;
    }

    @JsonSetter("3h")
    public void setThreeH(double threeH) {
        this.threeH = threeH;
    }
}
