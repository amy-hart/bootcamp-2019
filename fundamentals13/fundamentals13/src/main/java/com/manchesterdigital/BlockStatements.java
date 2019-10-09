package com.manchesterdigital;

public class BlockStatements {
    public static void main(String[] args) {

        int number = 99;

        if (number == 99) {
            int anotherNumber = 66;
            boolean isHappy = false;

            if (isHappy) {
                int age = 88;
                anotherNumber++;
            } else if (anotherNumber == 66) {
                System.out.println("isHappy = " + isHappy);
            } else {
                int score = 77;
                System.out.println("Not Happy. But score is " + score);
            }

            System.out.println("anotherNumber = " + anotherNumber);
        }

        int coinInserted = 50;

        switch (coinInserted) {
            case 50:
                System.out.println("coinInserted = " + coinInserted);
                break;
            case 20:
                System.out.println("Not enough money inserted");
                break;
            default:
                System.out.println("Not working");

        }

        boolean isRaining = true;

        if (isRaining == false) {

        }

    } // end Main method
}

/*

JS Scope:


let number = 99;

function retrieveNames() {
    const names = "John";

    return `${names} ${number}`;
}

console.log(names); // Doesn't know what names is...

 */
