package com.company;

 public abstract class HouseDecorator implements Home {
     protected Home home;

     public HouseDecorator(Home home)
     {
         this.home = home;
     }
        @Override
        public String decorate() {
            return home.decorate();
        }
    }

