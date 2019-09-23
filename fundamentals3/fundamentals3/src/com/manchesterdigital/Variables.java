package com.manchesterdigital;

public class Variables {
    // static keyword makes this a static Class level variable
    // the static keyword ensures that the variable only belongs to this class
    // if multiple objects are created from the class Variables, the static variable will still only be called once
    // always there, doesn't get deleted/ removed by the garbage collector, don't do this in loops, only use it as a reference
    static boolean isHungry = false;
    static int counter = 0;

    public static void main(String[] args) {
        greetWhenAdult(12);
    }

    /**
     * Greets based on age.
     *
     * @param age this is the age required
     */
    private static void greetWhenAdult(int age) {
        // Local variable, declared within the local scope of the method
        boolean isHappy = true;

        if (!isHungry) {
            if (isHappy && age >= 18) {
                System.out.println("Hello");
            }
        }
    }
} // end of class
