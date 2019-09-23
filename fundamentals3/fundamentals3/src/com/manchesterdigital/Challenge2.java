package com.manchesterdigital;

public class Challenge2 {
    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
    }

    public static boolean lastDigit(int number1, int number2) {

        return (number1 % 10) == (number2 % 10);

    }
}
