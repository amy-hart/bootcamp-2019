package com.manchesterdigital;
public class Restaurant {
    public static void main(String[] args) {
        letMeIn(7,4);
    }
    public static void letMeIn(int style, int bribe) {
        if ((style < 8) && (bribe < 5)) {
            System.out.println("Not allowed in");
        }
    }
}