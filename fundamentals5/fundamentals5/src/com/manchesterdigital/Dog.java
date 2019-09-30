package com.manchesterdigital;

public class Dog {
    // Constant member variable
   // public static final int NUMBER_OF_TEETH;

    // Member variable
    private int sizeOfDog;

    // Constructor - Should go after member variables
    public Dog(int sizeOfDog) {
        this.sizeOfDog = sizeOfDog;
    }

    // Non static methodod
    // Member meth
    public String bark() {
        if (sizeOfDog > 60) {
            return "WOOF!";
        } else if (sizeOfDog > 15) {
            return "RUFF!";
        }

        return "YIP!";
    }

    public static void relieve() {
        System.out.println("Gone for dump......");
    }
}
