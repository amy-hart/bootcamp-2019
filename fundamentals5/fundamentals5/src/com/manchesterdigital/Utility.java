package com.manchesterdigital;

public class Utility {

    public static Boolean isEven(int a) {
        /*
        if((a % 2) == 0) {
            return true;
        }
        return false;
         */

        // This is better...
        return ((a % 2) == 0);
    }

    public static boolean doNamesMatch(String firstName, String lastName) {
        // Highlight equalsIgnoreCase and press 'control + j' shows Java docs
        return firstName.equalsIgnoreCase(lastName);
    }

    public static Long convertStringToLong(String input) throws NumberFormatException {
        return new Long(input);
    }

}

