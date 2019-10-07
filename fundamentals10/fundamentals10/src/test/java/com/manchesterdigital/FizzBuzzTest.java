package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void whenMultipleOfThreeIsPrintedReturnFizz() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String result = fizzBuzz.fizzBuzzBuilder();

        // Assertions
        Assertions.assertThat(result).isEqualToIgnoringCase("fizz");
    }

    @Test
    public void whenMultipleOfFiveIsPrintedReturnBuzz() {
        // Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();

        // Act
        String result = fizzBuzz.fizzBuzzBuilder();

        // Assertions
        Assertions.assertThat(result).isEqualToIgnoringCase("buzz");
    }
}
