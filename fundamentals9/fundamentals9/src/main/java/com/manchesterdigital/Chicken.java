package com.manchesterdigital;

public class Chicken extends Bird {

    public Chicken(Integer age, String gender, Integer weightInLbs, Integer wingSpan) {
        super(age, gender, weightInLbs, wingSpan);
    }

    public void move() {
        System.out.println("I'm waddling....");
    }

}
