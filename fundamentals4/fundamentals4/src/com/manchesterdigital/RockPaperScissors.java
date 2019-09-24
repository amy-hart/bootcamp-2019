package com.manchesterdigital;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    /*
    public void rockPaperScissors(String userChoice, double computerChoice ){







    }*/

    public static void main(String[] args) {

        System.out.println("Rock, Paper, or Scissors?");
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();

        Random random = new Random();
        double computerChoice = random.nextDouble();

        computerChoice *= 10;
        double dividedByThree = computerChoice % 3;

        long roundedNumber = Math.round(computerChoice);



        System.out.println(roundedNumber);


    }
}
