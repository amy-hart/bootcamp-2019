package com.manchesterdigital;

public class Operators {

    public static void main(String[] args) {

        // addition operator
        int result = 1 + 2;
        System.out.println("Result is " + result);

        // subtraction operator:
        result = 3 - 1;
        System.out.println("Result is " + result);

        // multiplication operator
        result = 5 * 9;
        System.out.println("Result is " + result);

        // division operator
        result = 10 / 5;
        System.out.println("Result is " + result);

        // modulus/ remainder - This says how many times can we remove 10 from 20. The remainder is then assigned to result
        result = 20 % 10;
        System.out.println("Result is " + result);

        // increment:
        result = result +1;
        result++;

        // post increment - Increment after last assignment, ++ comes after the variable
        result++;

        // pre-increment - Increment before next assignment, ++ comes before the variable
        ++result;

        // pre-decrement:
        result = result -1;
        result--;
        // post decrement:
        --result;

        result = result +3;
        result += 3; // abbreviation of the above

        result = result - 10;
        result -= 10;

        result = result * 20;
        result *= 20;

        result = result / 2;
        result /= 2;

        // && and
        // || or
        // ! is the not operator
        // != not equal too
        // == equal too
        // < less than
        // > greater than
        // <= less than or equal to
        // >= greater than or equal to
        // The default for a boolean is false
        boolean isRainingToday = false;

        int number1 = 100;
        int number2 = 200;

        if (number1 != number2) {
            System.out.println("Same!!!");
        }

        if (number1 < number2) {
            System.out.println("The first number is smaller!!!");
        }

        boolean isAnimal = false;

        if(!isAnimal){
            System.out.println("I am not an animal!");
        }

        String lastName = "Sousa";

        if (lastName.equals("SOUSA")) {
            System.out.println("Surname is Sousa!!");
        }

        if (lastName.equalsIgnoreCase("SOUSA")) {
            System.out.println("Surname is Sousa!!");
        }

        int degreeScore = 60;
        int overallScore = 100;

        if (degreeScore >= 60 && overallScore >= 100) {
            System.out.println("WooHoo!");
        }

        if (degreeScore >= 60 || overallScore >= 100) {
            System.out.println("WooHoo!");
        }

        // If this condition is false
        // ! is the not operator
        if (!isRainingToday) {
            System.out.println("You won't need a jacket today!");

        }

        int numberOfMealsToday = 1;
        // example of a ternary operator
        // If the expression on the left evaluates to true, assign the variable to true, else assign it to false
        boolean isHungry = numberOfMealsToday == 1 ? true : false;

    }
}
