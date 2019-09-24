package com.manchesterdigital;

public class MethodOverloading {

    public int multiply(int first, int second) {
        return first * second;
    }

    public int multiply(int first, int second, int third) {
        return first * second * third;
    }

    public int multiply(int first, int second, int third, int fourth) {
        return first * second * third * fourth;
    }

    public static void main(String[] args) {
        MethodOverloading me = new MethodOverloading();

        int result = me.multiply(3,3);
        System.out.println(result);

        result = me.multiply(3,3,9);
        System.out.println(result);

        result = me.multiply(1,9,2, 10 );
        System.out.println(result);
    }
}
