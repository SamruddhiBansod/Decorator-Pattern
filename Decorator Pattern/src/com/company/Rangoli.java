package com.company;

public class Rangoli extends HouseDecorator{
    public Rangoli(Home home) {
        super(home);
    }

    public String decorate() {
        return super.decorate() + decorateWithRangoli();
    }

    private String decorateWithRangoli() {
        return " with Beautiful Rangoli";
    }
}
