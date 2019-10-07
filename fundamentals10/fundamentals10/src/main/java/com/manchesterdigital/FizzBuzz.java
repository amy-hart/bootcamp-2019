package com.manchesterdigital;

import java.lang.reflect.Array;

public class FizzBuzz {
    public int [] numbers = new int[100];

    public void fizzBuzzBuilder() {
        for (int i = 1; i <= numbers.length ; i++) {
            numbers[i-1] = i;
        }
    }

    public String fizzBuzzChecker() {
        for (Integer number : numbers) {
            if (number % 3 == 0) {
                return "fizz";
            } else if (number % 5 == 0) {
                //
            }

    }

        return null;
    }


/*
        for (int i = 1; i < 101; i++) {
            System.out.println("i = " + i);

            if( i % 3 == 0) {
                return "fizz";
            } else if (i % 5 == 0){
                return "buzz";
            }


        }


        for (int i = 1; i <= numbers.length ; i++) {
            numbers[i-1] = i;
        }
*/

