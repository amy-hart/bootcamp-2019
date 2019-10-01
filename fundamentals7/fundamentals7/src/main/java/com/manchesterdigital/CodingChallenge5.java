package com.manchesterdigital;

/*
Write a program that loops from 1 to 100 and works out the average of the
numbers as well as the total of the numbers when added together.

For example if I loop from 1 to 3, the sum would 6 and the average would
be 2.
 */

public class CodingChallenge5 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int average = 0;
        while (i <= 100) {

            sum += i;
            average = sum / i;

            System.out.println("i: " + i + "; sum: " + sum + "; average: " + average + ";");
        }


    }
}
