package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TemperatureConverterTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void whenFahrenheitIsZeroThenCelciusIsMinus17() {
        // ARRANGE
        String unitToConvertTo = "C";
        int temperature = 0;

        // ACT
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(-17.0);

    }

    @Test
    public void whenFahrenheitIs100ThenCelciusIs37() {
        // ARRANGE
        String unitToConvertTo = "C";
        int temperature = 100;

        // ACT
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(37.0);

    }

    @Test
    public void whenFahrenheitIs50ThenCelciusIs10() {
        // ARRANGE
        String unitToConvertTo = TemperatureConverter.CELCIUS_UNIT;
        int temperature = 50;

        // ACT
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(10.0);
    }

    /// ------------------ CELCIUS TO FAHRENHEIT TESTS ------------------

    @Test
    public void whenCelciusIsZeroThenFahrenheitIs32() {
        // ARRANGE
        String unitToConvertTo = "F";
        int temperature = 0;

        // ACT
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(32.0);
    }

    @Test
    public void whenCelciusIs35ThenFahrenheitIs95() {
        // ARRANGE
        String unitToConvertTo = TemperatureConverter.FAHRENHEIT_UNIT;
        int temperature = 35;

        // ACT
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(95.0);
    }

    // One way of testing for Exceptions
    @Test(expected = InvalidConversionUnitException.class)
    public void whenConversionUnitIsNotValidThenExceptionThrown() {
        // ARRANGE

        // ACT
        TemperatureConverter.convert("dhjgdhjgd", 0);

        // ASSERT


    }

    // Best practise way of testing for exceptions, the first one can throw false positives due to being less specific
    @Test
    public void whenConversionUnitIsNotValidThenExceptionThrown2() {
        expectedException.expect(InvalidConversionUnitException.class);
        TemperatureConverter.convert("dhjgdhjgd", 0);

        Assertions.assertThat(expectedException).isInstanceOf(InvalidConversionUnitException.class);

    }
}
