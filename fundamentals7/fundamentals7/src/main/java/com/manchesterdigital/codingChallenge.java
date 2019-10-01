package com.manchesterdigital;

public class codingChallenge {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("I is: " + i + " and is a multiple of 3 or 5");
                sum += i;
            }
        }
        System.out.println("Sum of these numbers is: " + sum);
    }
}
