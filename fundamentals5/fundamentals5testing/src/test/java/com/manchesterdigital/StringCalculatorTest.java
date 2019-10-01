package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class StringCalculatorTest {

    @Test
    public void returnZeroWhenStringEmpty() {
        // Arrange
        String numbers = "";

        // Act
        int result = StringCalculator.add(numbers);

        // Assert
        Assertions.assertThat(result).isEqualTo(0);
    }
    @Test
    public void returnZeroWhenStringContainsWhiteSpace() {
        // Arrange
        String numbers = " ";

        // Act
        int result = StringCalculator.add(numbers);

        // Assert
        Assertions.assertThat(result).isEqualTo(0);
    }
    /*
    @Test
    public void returnNumAsIntWhenStringLengthIsOne() {
        // Arrange
        String numbers = "9";

        // Act
        int result = StringCalculator.add(numbers);

        // Assert
        Assertions.assertThat(result).isEqualTo(9);
    }
    */

}
