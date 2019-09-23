package com.manchesterdigital;

public class Scratch {
    public static void main(String[] args) {
        // assignment statement:
        int numberOfTeams = 4;

        // declarative statement
        double interestRate;

        // method invocation statement:
        System.out.println("Hello World");

        // object creation statement:
        // Creating an instance of the Car class
        Car ferrari = new Car();

        boolean isMorning = true;

        // can do this but not best practise
        if (isMorning)
            System.out.println("It's morning");

        if (isMorning) {
            System.out.println("It's morning");
            putTheKettleOn();
        }

    } // end main

    private static void putTheKettleOn() {
        System.out.println("Putting the kettle on...");
    }

}
