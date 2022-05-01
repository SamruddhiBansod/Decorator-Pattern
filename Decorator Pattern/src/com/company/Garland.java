package com.company;

public class Garland extends HouseDecorator{
    public Garland(Home home) {
        super(home);
    }

    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland full of marigold flowers";
    }
}
