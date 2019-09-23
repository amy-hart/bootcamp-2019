package com.manchesterdigital;

// 1 - Monday
// 2 - Tuesday
// 3 - Wednesday
// 4 - Thursday
// 5 - Friday
// 6 - Saturday
// 7 - Sunday

// 1 - 5 are weekdays
// 6 - 7 are weekends

public class Challenge3 {
    public static void main(String[] args) {
        weekdayToNumber(1);
    }

    public static void weekdayToNumber(int number) {

        if ( number == 2 || number == 4) {
            System.out.println("I go to the gym today.");
        } else if (number == 7) {
            System.out.println("I do gardening today.");
        } else {
            System.out.println("I don't do anything today.");
        }

        if ((number >= 1) && (number <= 5)) {
            System.out.println("This day is a weekday.");
        } else {
            System.out.println("This day falls on the weekend.");
        }

    }


}
