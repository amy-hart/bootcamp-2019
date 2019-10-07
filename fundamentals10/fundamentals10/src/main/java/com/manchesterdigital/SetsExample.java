package com.manchesterdigital;

import java.util.*;

public class SetsExample {

    public static void main(String[] args) {

        // Only adding one value per element, not adding key value pair, more like an array
        // Like an immutable array?
        Set<String> names = new HashSet<>();

        names.add("John");
        names.add("April");
        names.add("Jack");
        names.add("Jack");
        names.add("Jack");
        names.add("Emalin");

        // If you put in multiple elements with the same value, they'll be replaced, duplicates won't be added
        for (String name : names) {
            System.out.println("name = " + name);
        }

        Set<Integer> ages = new TreeSet<>();
        ages.add(22);
        ages.add(22);
        ages.add(22);
        ages.add(50);
        ages.add(7);
        ages.add(64);

        System.out.println("ages = " + ages);

        List<String> footballers =
                Arrays.asList("Ronaldo", "Messi", "Nevmar", "Rooney", "Ronaldo");

        // Converting footballers array into a set so that we can return it without dupes
        Set<String> uniqueFootballers = new TreeSet<>(footballers);
        System.out.println("uniqueFootballers = " + uniqueFootballers);


        // Union (what's in both)
        Set<String> cats = new HashSet<>();
        cats.add("Lion");
        cats.add("Cheetah");

        Set<String> reptiles = new HashSet<>();
        cats.add("Snake");
        cats.add("Crocodile");

        Set<String> zoo = new HashSet<>(cats);
        zoo.addAll(reptiles);

        System.out.println("zoo = " + zoo);

        // Intersections:
        Set<String> otherNames = new HashSet<>();
        otherNames.add("John");
        otherNames.add("Joanne");
        otherNames.add("Jill");
        otherNames.add("Susan");

        Set<String> intersectionOfBoth = new HashSet<>(names);
        intersectionOfBoth.retainAll(otherNames);

        System.out.println("intersectionOfBoth = " + intersectionOfBoth);

        // Differences:
        // Will print all the names from names that are different to the names in otherNames
        // The only name that exists in names that also exists in otherNames is John
        // So John doesn't get printed but Emailin, Jack, and April do

        Set<String> nameDifferences = new HashSet<>(names);
        nameDifferences.removeAll(otherNames);

        System.out.println("nameDifferences = " + nameDifferences);


    }
}
