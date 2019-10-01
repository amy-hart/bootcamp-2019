package com.manchesterdigital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingChallenge4 {

    public static boolean only1or4(ArrayList<Integer> numbers) {
        boolean result = true;
        for (int number : numbers) {
            if(!(number == 1) || !(number == 4)) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);

        System.out.println("numbers result = " + only1or4(numbers));

    }
}
