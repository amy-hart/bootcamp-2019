package com.manchesterdigital;

public class InterestCalculator {

    public static void main(String[] args) {
        double amount = 100.0d;

        for (int i = 10; i <= 50; i+= 10) {
            System.out.println("Year " + i + " " + calculateInterest(amount, i));
        }
    }

    private static double calculateInterest(double amount, int i) {
        return (amount * i) / 100;
    }
}
