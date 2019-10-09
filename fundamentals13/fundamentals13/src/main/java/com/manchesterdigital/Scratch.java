package com.manchesterdigital;

import java.util.Map;

public class Scratch {
    public static final int MIN_NUMBER_OF_ITEMS = 10;

    // Belongs to the Scratch class itself
    private static Map<Long, String> countries;

    static {
        countries = Map.of(
                1L, "England",
                2L, "France"
        );
    }

    // belongs just to the instance of the Scratch class
    private String author;

    // Constructor
    public Scratch(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {

        int numberOfEmployees = 12; // statement example, declaration and initialization
        int numberOfStudents; // declaration

        String firstName = "Amy"; // a non-primitive
        String lastName = null;

        Scratch newScratch = new Scratch(firstName);
        System.out.println("newScratch = " + newScratch.getAuthor());

    } // end Main method

    private static String generateFullNameForOver16s(int age, String firstName, String lastName) {
        String name = null;

        if (age > 16) {
            name = String.format("%s %s", firstName, lastName);
        }

        return name;
    }
}
