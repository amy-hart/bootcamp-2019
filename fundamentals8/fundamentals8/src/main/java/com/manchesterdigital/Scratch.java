package com.manchesterdigital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scratch {
    // Creating a constant
    // Constants have to be at top of the class, not inside a method
    public static final String RED_COLOUR = "RED";

    public static void main(String[] args) {
        /*System.out.println("Colour " + RED_COLOUR);
        // Calling enum
        System.out.println(RainbowColours.BLUE.toString());

        OrderProcessor orderProcessor = new OrderProcessor(OrderStatus.AWAITING_PAYMENT);

        orderProcessor.printOrderMessage();
        orderProcessor.obtainCurrentOrderStatus();

        // Dog example - Create new Dog
        Dog poodle = new Dog(DogSize.SMALL);
        poodle.setHungerLevel(100);
        poodle.hungry();

        Dog labrador = new Dog(DogSize.LARGE);
        labrador.bark();

        Address address = new Address("18 Norreys Avenue", "Urmston", "M418TJ");
        Person person = new Person("Jill", "Jones", 34, address);

        Address address = new Address("18 Norreys Avenue", "Urmston", "M418TJ");
        Person person = new Person("Jill", "Jones", 34, address);
        System.out.println(person.toString());*/

        Lights lights = new Lights();
        Fan pelonisFan = new Fan();

        // List<Controls> controlList = Arrays.asList(lights, pelonisFan);

        List<Controls> controls = new ArrayList<>();
        controls.add(lights);
        controls.add(pelonisFan);

        for (Controls controllableItem : controls) {
            controllableItem.switchOn();
            controllableItem.switchOff();
        }

    }
}
