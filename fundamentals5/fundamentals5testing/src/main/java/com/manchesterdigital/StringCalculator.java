package com.manchesterdigital;

public class StringCalculator {

    public static boolean checkForEmptyString(String numbers) {
        boolean result = false;
        // Trim numbers string to remove any whites spaces
        numbers = numbers.trim();
        // If String is empty...
        if(numbers.equals("") ){
            result = true;
        }

        return result;
    }

    public static int[] convertToIntegerArray(String numbers, String delimiter) {
        // Trim numbers string to remove any whites spaces
        numbers = numbers.trim();

        // Create new array from split numbers string
        String [] numbersArray = numbers.split(delimiter);
        int [] integerArray = new int[numbers.length()];

        // Convert element into an integer and add it to sumOfArray
        for (int i = 0; i < numbersArray.length; i ++) {
            integerArray[i] = Integer.parseInt(numbersArray[i]);
        }

        return integerArray;

    }

    public static int add(String numbers) {
        // Is this an empty string?
        checkForEmptyString(numbers);

        // if not convert to int array.
        convertToIntegerArray(numbers, " ");



        // Create new array from split numbers string
        /*
        String [] numbersArray = numbers.split(delimiter);
        int [] integerArray = new int[numbers.length()];

        // Convert element into an integer and add it to sumOfArray
        for (int i = 0; i < numbersArray.length; i ++) {
            integerArray[i] = Integer.parseInt(numbersArray[i]);
        }*/

        //String delimiter = " ";
        //int sumOfArray;


        return 5;
    }

    public static void main(String[] args) {
        add(" ");
    }

}
