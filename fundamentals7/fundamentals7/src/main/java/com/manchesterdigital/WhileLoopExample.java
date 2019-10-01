package com.manchesterdigital;

public class WhileLoopExample {

    public static void main(String[] args) {
        /**
         * while (booleen expression) {
         *     // body
         * }
         */

        double growthRate = 0.04; // 4%
        int population = 800; // initial population of puffins
        int year = 0; // 0 is the present time

        while (population <= 1200) {
            Double tempPopulation = population * (1 + growthRate);
            population = tempPopulation.intValue();
            year++;
        }

        System.out.println("Year = " + year);
        System.out.println("population = " + population);
    }
}
