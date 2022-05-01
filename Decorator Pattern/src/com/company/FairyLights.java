package com.company;

public class FairyLights extends HouseDecorator{
    public FairyLights(Home home) {
        super(home);
    }

    public String decorate() {
        return super.decorate() + decorateWithFairyLights();
    }

    private String decorateWithFairyLights() {
        return " with Fairy Lights";
    }
}
