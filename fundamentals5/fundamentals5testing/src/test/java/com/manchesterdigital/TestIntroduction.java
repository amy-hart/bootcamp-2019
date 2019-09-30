package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestIntroduction {

    // command + N to insert a Test method
    // junit is a test runner

    // Examples of different formats
    @Test
    public void testThatABankAccoubtTakesAnInputWhenDeposited() {

    }

    @Test
    public void shouldTakeInputWhenDeposited() {

    }

    // BDD STYLE - Behavioural driven development
    // Key words used in naming convention, given, when, then
    @Test
    public void givenBankAccountWhenInputThenDeposited() {

    }

    // shorter version
    @Test
    public void WhenInputThenDeposited() {

    }

    // Test example
    @Test
    public void shouldAddTwoNumbers() {

        // ARRANGE
        int first = 23;
        int second = 23;

        // ACT
        int result = first + second;

        // ASSERT
        assertThat(result).isEqualTo(46);

    }
}
