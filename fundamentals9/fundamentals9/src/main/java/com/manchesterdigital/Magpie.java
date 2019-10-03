package com.manchesterdigital;

public class Magpie extends Bird implements Flyable {
    public Magpie(Integer age, String gender, Integer weightInLbs, Integer wingSpan) {
        super(age, gender, weightInLbs, wingSpan);
    }

    public void fly() {
        System.out.println("Flying...");
    }

}
