package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {
    public static void main(String[] args) {

        // Can't be certain that a HashMap will put items in the array in order depending to their key
        // Maybe this is like JS where sometimes things don't run in order
        Map<Integer, String> names = new HashMap<>();

        names.put(2, "Jill");
        names.put(3, "Susan");
        names.put(4, "Andrew");
        names.put(1, "John");

        for (Map.Entry<Integer, String> entry : names.entrySet()) {

            System.out.println("entry = " + entry.getKey());
            System.out.println("entry = " + entry.getValue());

        }

        // Tree will order the items added to it via their key
        Map<Integer, String> countries = new TreeMap<>();

        countries.put(23, "England");
        countries.put(2, "Spain");
        countries.put(99, "France");
        countries.put(77, "Germany");

        for (Map.Entry<Integer, String> entry : countries.entrySet()) {

            System.out.println("entry = " + entry.getKey());
            System.out.println("entry = " + entry.getValue());

        }



    }
}
