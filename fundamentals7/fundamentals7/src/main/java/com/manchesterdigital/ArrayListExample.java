package com.manchesterdigital;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // Generic way of creating an ArrayList, not best practise
        ArrayList names1 = new ArrayList();

        // Better way to create arrays
        /* Could do 'new ArrayList<String>()' on the right but it's not necessary, it will assume based on the type given
        on the left */
        // Have to use wrapper class names as types such as Integer
        ArrayList<String> names2 = new ArrayList<>();

        // Add strings to ArrayList
        names2.add("John");
        names2.add("Sue");
        names2.add(2, "Steve");

        int numOfElements = names2.size();
        System.out.println("Number of elements: " + numOfElements);

        String firstElement = names2.get(0);
        System.out.println("First element: " + firstElement);

        // Remove element and shift other elements backwards one space

        // Removed element can be assigned to a variable
        String removedElement = names2.remove(0);
        System.out.println("Removed =>" + removedElement);

        // When removing via value/ reference, true or false is returned (true if removed, false if not)
        boolean removedElementViaObject = names2.remove("Steve");
        System.out.println("Removed by object => " + removedElementViaObject);

        ArrayList<String> zooAnimals = new ArrayList<>();
        zooAnimals.add("Lion");
        zooAnimals.add("Hippo");
        zooAnimals.add("Leopard");

        // Check if element is in array, case sensitive, returns true or false
        System.out.println("Contains leopards?: " + zooAnimals.contains("Leopard"));

        // Sort the array
        Collections.sort(zooAnimals);
        System.out.println("After sort, animal at index 0: " + zooAnimals.get(0));

        // Randomize the arrayList
        Collections.shuffle(zooAnimals);

        // Overrides a value at a certain index
        zooAnimals.set(1, "Cheetah");
        System.out.println(zooAnimals.get(1));

        // Empty the entire array
        zooAnimals.clear();
        System.out.println(zooAnimals.size());

        int [] lotteryArr = new int[10];
        int [] LotteryArr2 = {1, 23, 45, 6, 88};
        // Predefined array list
        // List<Integer> lotteryNumbers = Arrays.asList(1, 23, 45, 6, 88);


    }
}

