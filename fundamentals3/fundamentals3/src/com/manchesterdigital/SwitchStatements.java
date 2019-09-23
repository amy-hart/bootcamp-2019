package com.manchesterdigital;

// Condition use if statement
// No condition use switch statement

public class SwitchStatements {
    public static final int TEN_PENCE = 10;

    public static void main(String[] args) {
        int coinInserted = 50;

        switch (coinInserted) {
            case 10:
                System.out.println("Inserted 10p");
                break;
            case 20:
                System.out.println("Inserted 20p");
                break;
            case 50:
                System.out.println("Inserted 50p");
                break;
            default:
                System.out.println("No coin detected");
        }

        // The above is the same as the below

        switch (coinInserted) {
            case TEN_PENCE:
            case 20:
                warningMessage();
                break;
            case 50:
                System.out.println("Inserted 50p");
                break;
            default:
                System.out.println("No coin detected");
        }

        System.out.println("Change given???");
    }

    private static void warningMessage() {
        System.out.println("Not enough money!");
    }
}
