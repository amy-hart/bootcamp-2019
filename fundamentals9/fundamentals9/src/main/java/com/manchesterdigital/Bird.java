package com.manchesterdigital;

public class Bird extends Animal{
    private Integer wingSpan;

    public Bird(Integer age, String gender, Integer weightInLbs, Integer wingSpan) {
        super(age, gender, weightInLbs);
        this.wingSpan = wingSpan;
    }

    public void move() {
        System.out.println("I'm flapping....");
    }
}
