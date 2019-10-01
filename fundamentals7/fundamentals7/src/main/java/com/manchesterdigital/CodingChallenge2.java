package com.manchesterdigital;

public class CodingChallenge2 {

    public static String stringTimes(String STR, int N) {
        StringBuilder myStringBuilder = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            myStringBuilder.append(STR);
        }

        System.out.println(myStringBuilder);

        return myStringBuilder.toString();
    }

    public static void main(String[] args) {
        stringTimes("Hi", 2);
        stringTimes("Hi", 4);
    }
}
