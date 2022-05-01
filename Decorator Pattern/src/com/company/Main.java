package com.company;

public class Main {

    public static void main(String[] args) {

            Home home1 = new Garland(new HouseDecor());
            System.out.println("Home with Garland made of Marigold Flowers and Roses!");
            home1.decorate();
            System.out.println("");

            Home home2 = new FairyLights(
                        new Garland(new HouseDecor()));
            home2.decorate();
                        System.out.println("Home decorated with Bright Fairy Lights!");
            System.out.println("");

            Home home3 = new Rangoli(
                    new Rangoli(new HouseDecor()));
            home3.decorate();
            System.out.println("Home decorated with Colorful Rangoli!");

    }
}
