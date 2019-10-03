package com.manchesterdigital;

// Abstract at class level prevents me from making an Animal, I can only make a child
public abstract class Animal {
    protected Integer age;
    protected String gender;
    protected Integer weightInLbs;

    public Animal(Integer age, String gender, Integer weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public  void sleep() {
        System.out.println("Sleeping...");
    }

    // The move method is specified inside the lower classes in case they differ for each type of bird
    public abstract void move();

}
