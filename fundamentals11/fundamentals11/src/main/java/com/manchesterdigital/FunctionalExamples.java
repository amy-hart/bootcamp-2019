package com.manchesterdigital;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalExamples {
    public static void main(String[] args) {
        // 1st calculate total price of all items
        // 2nd multiply sales by tax
        // 3rd add sales to total
        // 4th return total

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers.get(i) = " + numbers.get(i));
        }

        // moved on 2000s.....

        for (Integer i : numbers) {
            System.out.println("numbers = " + i);
        }

        String name = "John";

       //  LAMBDA

        /**
         * LAMBDA expression:
         * ( A list of parameters separated by commas ) -> { expression body, one or more statements }
         */

        // LAMBDA expression:
        NumericTest isEven = (n) -> (n % 2 == 0);

        System.out.println(
                "is 4 an even number? " + isEven.computeTest(4)
        );

        System.out.println(
                "is 4 an even number? " + isEven.computeTest(5)
        );

        NumericTest isNegative = (n) -> (n < 0);

        System.out.println(
                "-1 is negative? " + isNegative.computeTest(-1)
        );

        // anonymous class of type NumericTest
        NumericTest isOdd = (n) -> false;
        System.out.println("isOdd = " + isOdd.computeTest(5));

        Greeting frenchGreeting = () -> System.out.println("Bonjour");

        frenchGreeting.message();

        Greeting greetInSpanish = () -> System.out.println("Hola");

        greetInSpanish.message();

        // Don't do things this way
        // Takes in a string, returns an integer
        Function<String, Integer> getWordLength = new Function<String, Integer>() {

            @Override
            public Integer apply(String word) {
                return word.length();
            }
        };

        Integer helloLength = getWordLength.apply("Hello");
        System.out.println("helloLength = " + helloLength);

        Function<String, Integer> getWordLengthModernised =  String::length;
        Integer len = getWordLengthModernised.apply("Amy");

        System.out.println("len = " + len);

        Function<Artist, String> extractArtistName = Artist::getName;
        Function<String, String>  convertToUppercase = String::toUpperCase;

        Artist skepta = new Artist("Skepta", 2000000L);
        String artistName = extractArtistName.apply(skepta);

        String uppercasedName = convertToUppercase.apply(artistName);
        System.out.println("uppercasedName = " + uppercasedName);

        String allFunctions = extractArtistName.andThen(convertToUppercase).apply(skepta);
        System.out.println("allFunctions = " + allFunctions);

        Function<Integer, Double> half = a -> a/ 2.0d;

        // Compose runs that lambda expression you give it first, then the original that's assigned to it
        half = half.compose(a -> a * 3);
        System.out.println("half = " + half.apply(5));

        // Calculate half of 10 and then run the following lambda from and then
        half = half.andThen(a -> a * 3);
        System.out.println("half.apply(10) = " + half.apply(10));

        multiplyANumber exampleSum2 = (n1, n2) -> (n1 * n2);
        System.out.println(exampleSum2.multiply(10, 2));

        Numbers exampleNumbers = new Numbers(5, 2);

        Function<Numbers, Integer> multiplyTwoNumbers =  n -> n.getA() * n.getB();
        System.out.println("multiplyTwoNumbers = " + multiplyTwoNumbers.apply(exampleNumbers));

        // Divide a number by another number
        Divider divider = (a, b) -> a / b;

        Double doubleResult = divider.divideIt(6d, 3d);
        System.out.println(doubleResult);

        // This will fail with a not divisible by zero error
        Double doubleResult2 = divider.divideIt(6d, 0d); // Not mathematically possible

        Divider safeDivider = (a, b) -> {
            if (b == 0) {
                return 0d;
            }

            return a / b;
        };

        Divider safeDivider2 = (a, b) -> (b == 0) ? b : a / b;

        Function<DivideNumbers, Double> dividerFunc = (n) ->
                (n.getB() == 0) ? n.getB() : n.getA() / n.getB();

        System.out.println("dividerFunc = " + dividerFunc.apply(new DivideNumbers(2d, 0d)));
    }

}
