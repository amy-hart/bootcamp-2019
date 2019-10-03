package com.manchesterdigital;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        /*
        Animal animal = new Animal(20, "female", 100);
        animal.eat();
        animal.sleep();*/

        // Bird bird = new Bird(23, "Male", 20, 15);
        // bird.sleep();

        Chicken kfc = new Chicken(23, "female", 15, 10);
        kfc.move();
        kfc.eat();
        kfc.sleep();

        Magpie maggie = new Magpie(34, "Male", 50, 50);

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(maggie);
        animals.add(kfc);

        for (Animal animal : animals) {
            animal.move();
        }

        // A way to create classes that support Flyable
        Flyable someAnimalThatFlies = new Magpie(5, "Male", 45, 30);

        List<Flyable> flyables = new ArrayList<>();
        flyables.add(maggie);
        // flyables.add(kfc); - Can't add kfc to the list because chickens aren't flyable

    }
}
