package com.manchesterdigital;

public class Dog {

    // Variables
    private String name;
    private String breed;
    private String sex;
    private Integer age;
    private Integer aggressionLevel;
    private DogSize dogSize;
    private Integer hungerLevel;

    public Dog(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    public void bark() {
        System.out.println(dogSize.getNoise());
    }

    public void hungry() {
        if (hungerLevel > 10) {
            for (int i = 0; i < 10; i++) {
                // Bark 10 times if hungry
                bark();
            }
            System.out.println("Gimmee foood!! " + dogSize.getNoise());
        } else {
            System.out.println("I'm stuffed");
        }
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAggressionLevel(Integer aggressionLevel) {
        this.aggressionLevel = aggressionLevel;
    }

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
}
