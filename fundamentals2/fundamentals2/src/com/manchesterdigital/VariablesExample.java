package com.manchesterdigital;

import java.util.Arrays;
import java.util.Date;

/**
 * Describes usage of variables and data types.
 *
 * @author Amy Hart.
 */
public class VariablesExample {

    public static void main(String[] args) {

        // primitive data types

        int Number; // BAD PRACTICE - This counts as declaring a variable
        int numberOfAnimals = 10; // GOOD PRACTICE - This counts as initialising a variable

        System.out.println("Number of animals is: " + numberOfAnimals);

        // Integer wrapper can take any type of number - autoboxing
        Integer numberOfStudents = 10;
        // Can use Integer class to 'unbox', retrieve value back as any type
        System.out.println(numberOfStudents.longValue());

        int i1, i2, i3; // Allows you to declare three variables of the same data type

        /* Declares three variables of type int, but only d3 is assigned the value of 3, the other two will not be
        * initialised */
        int d1, d2, d3 = 3;

        // In certain versions of Java you can use underscores to separate numbers to make them more readable
        int miles = 1000000;
        int miles2 = 1_000_000;

        // The L makes sure the compiler treats the variable as a long and doesn't convert it back into an int later
        long diameterOfSunInMiles = 12L;

        // By default this is both declared and initialised as false
        boolean itsRaining;
        boolean itsRaining2 = false;

        // One of these is more precise in terms of the number of decimal places they go to
        float pi = 3.14f;
        double percentage = 49.5d;

        // Can only define chars using single quotes not double quotes
        // Chars can only contain one letter
        char initial = 'A';

        // Casting is implicitly converting the data type of one variable into another

        // Non primitive data types

        // Primitives came out of the box with Java, Non primitives are created as classes, like Strings, Dates, Arrays

        String firstName = "John";
        String lastName = "Doe";

        /* Bad practice to concatenate with pluses, anonymous variable created with the space string
        This creates 4 strings:
        FirstName
        anonymous
        lastName
        whole string 'John Doe'
         */
        System.out.println(firstName + " " + lastName); // Prints value of variable firstName
        System.out.printf("Name: %s %s", firstName, lastName);

        System.out.println(String.format("Name: %s %s", firstName, lastName));

        StringBuilder output = new StringBuilder();

        output.append(firstName).append(" ").append(lastName);

        System.out.println(output.toString());

        // Declare an array that can only accept integers, array length is 10
        int [] numbers = new int[10]; // Not best practise, inefficient

        // Set the first item in the array to 99
        numbers[0] = 99;
        // This will print 99
        System.out.println(numbers[0]);
        System.out.println(Arrays.toString(numbers));

        // Create an array, populate it with elements, and set the length implicitly while doing so
        int [] lotteryNumbers = { 23, 45, 66 };

        String [] names = { "john", "doe", "mike" };

        Date today = new Date();
        System.out.println(today.toString());


    }

}
