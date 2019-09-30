package com.manchesterdigital;

import java.io.FileInputStream;

public class Runner {


    public static void main(String[] args) {
        Boolean result = Utility.isEven(2);

        System.out.println("Result: " + result);

        boolean doNamesMatch = Utility.doNamesMatch("Emalin", "emalin");

        System.out.println("Result: " + doNamesMatch);

        // Creating an new instance of Dog, creating a new dog object
        Dog poodle = new Dog(20);
        System.out.println(poodle.bark());

        Dog rottweiler = new Dog(100);
        System.out.println(rottweiler.bark());

        // Because relieve method is static,
        // you can only access it at the 'Dog' class level
        // Can't access it as rottweiler.relieve()
        Dog.relieve();

        // Accessing constant variable
        //System.out.println(Dog.NUMBER_OF_TEETH);

        Long id;

        try {
            id = Utility.convertStringToLong("123456");
            System.out.println(id);
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
            System.err.println("Input provided was not a valid number" + e);

            id = Long.MAX_VALUE;
        }

        System.out.println("My IF is: " + id);

        //FileInputStream is = new FileInputStream();

        try {
            Long num2 = Utility.convertStringToLong("23");
        }
        catch {
            System.err.println(e);
            throw new IllegalArgumentException("Invalid input provided", e);
        }
        finally {
            //is.close();
        }
    }
}
