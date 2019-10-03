package com.manchesterdigital;

public class TenGreenBottles {
    static final String [] NUMBERS_ARRAY =
            {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

    public static void main(String[] args) {

        for (int numOfBottles = 10; numOfBottles > 0  ; numOfBottles--) {
            printVerse(numOfBottles);
        }
    }

    public static void printVerse(Integer numOfBottles){
        int numOfBottlesLeft = numOfBottles - 1;

        System.out.printf("%s green bottles sitting on the wall,\n%s green bottles sitting on the wall," +
                "\nAnd if one green bottle should accidentally fall,\n" +
                        "There’ll be %s green bottles sitting on the wall.\n\n",
                NUMBERS_ARRAY[numOfBottles], NUMBERS_ARRAY[numOfBottles], NUMBERS_ARRAY[numOfBottlesLeft]);
    }
}
