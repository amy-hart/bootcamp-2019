package com.manchesterdigital;

public class TenGreenBottles {
    static final String [] NUMBERS_ARRAY =
            {"Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two", "One"};

    public static void main(String[] args) {

        for (int numOfBottles = 10; numOfBottles > 0 ; numOfBottles--) {
            printVerse(numOfBottles);
        }
    }

    public static void printVerse(Integer numOfBottles){
        int numOfBottlesLeft = numOfBottles - 1;

        System.out.printf("%d green bottles sitting on the wall,\n%d green bottles sitting on the wall," +
                "\nAnd if one green bottle should accidentally fall,\n" +
                        "There’ll be %d green bottles sitting on the wall.\n\n",
                NUMBERS_ARRAY[numOfBottles], NUMBERS_ARRAY[numOfBottles], NUMBERS_ARRAY[numOfBottlesLeft]);
    }
}
