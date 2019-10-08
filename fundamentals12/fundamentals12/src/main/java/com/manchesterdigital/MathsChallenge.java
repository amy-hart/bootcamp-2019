package com.manchesterdigital;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MathsChallenge {
    public static void main(String[] args) {
        // Task 1
        List<Integer> numbers = List.of(1, 2 ,3);
        square(numbers);



        // Task 2
        List<Integer> nums = List.of(16, 8, 886);
        rightDigit(nums);

    }

    private static List<Integer> square(List<Integer> nums) {
        List<Integer> squareNumbers = nums.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("squareNumbers = " + squareNumbers);

        return squareNumbers;
    }

    private static List<Integer> rightDigit(List<Integer> nums) {

        List<Integer> newCollection = nums.stream()
                .map(num -> num % 10)
                .collect(Collectors.toList());

        System.out.println("newCollection = " + newCollection);

        return newCollection;
    }
}

