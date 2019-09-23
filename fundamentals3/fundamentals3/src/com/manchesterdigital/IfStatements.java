package com.manchesterdigital;

public class IfStatements {
    public static void main(String[] args) {

        /* if (condition) {
            // block/ body of the IF

        }*/

        int age = 50;

        if (age <= 29) {
            System.out.println("Age is over 20");
        } else if (age > 30) {
            // second to last outcome
            System.out.println("Age is over 30");

        } else {
            // the else has it's own body
            // last outcome
            System.out.println("No outcome");
        }
    }


}
