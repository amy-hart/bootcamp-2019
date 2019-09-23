package com.manchesterdigital;

public class Challenge {
    public static void main(String[] args) {
        double firstNumber = 20d;
        double top = 80d;

        double calculatedNumber = (firstNumber + top) * 25;

        System.out.println("Calculated number: " + calculatedNumber);

        calculatedNumber %= 40;

        System.out.println("Remainder of 40: " + calculatedNumber);

        if (calculatedNumber <= 20) {
            System.out.println("Total was over the limit");
        }
    }
}
