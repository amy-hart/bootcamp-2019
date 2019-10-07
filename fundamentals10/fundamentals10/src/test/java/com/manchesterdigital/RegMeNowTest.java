package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.SplittableRandom;

public class RegMeNowTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /* @Test
    public void WhenStringContainsSReturn5() {
        // Arrange
        String subject = "S";
        RegMeNow regMeNow = new RegMeNow();

        // Act
        String result = regMeNow.regConvertor(subject);

        // Assert
        Assertions.assertThat(result).isEqualTo("5");
    }
    @Test
    public void whenStringContainsAReturn4() {
        //A
        String subject = "A";
        RegMeNow regMeNow = new RegMeNow();
        //A
        String result = regMeNow.regConvertor(subject);

        //A
        Assertions.assertThat(result).isEqualTo("4");
    }
    @Test
    public void whenStringContainsGReturn9() {
        //A
        String subject = "G";
        RegMeNow regMeNow = new RegMeNow();
        //A
        String result = regMeNow.regConvertor(subject);

        //A
        Assertions.assertThat(result).isEqualTo("9");
    }
    @Test
    public void whenStringContainsBReturn8() {
        //A
        String subject = "B";
        RegMeNow regMeNow = new RegMeNow();
        //A
        String result = regMeNow.regConvertor(subject);

        //A
        Assertions.assertThat(result).isEqualTo("8");
    }
    @Test
    public void whenStringContainsIReturn1() {
        //A
        String subject = "I";
        RegMeNow regMeNow = new RegMeNow();
        //A
        String result = regMeNow.regConvertor(subject);

        //A
        Assertions.assertThat(result).isEqualTo("1");
    }*/

    @Test
    public void whenStringSAGBISAPassedReturn5498154() {
        //A
        String subject = "SAGBISA";
        String expected = "5498154";
        RegMeNow regMeNow = new RegMeNow();

        //A
        String result = regMeNow.regConvertor(subject);

        //A
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenStringSAGBISASPassedReturnInvalidRegistrationLengthException() {
        //A
        String subject = "SAGBISAS";
        expectedException.expect(InvalidRegistrationLengthException.class);
        RegMeNow regMeNow = new RegMeNow();

        //A
        regMeNow.regConvertor(subject);

        //A
        Assertions.assertThat(expectedException).isInstanceOf(InvalidRegistrationLengthException.class);
    }

    @Test
    public void whenStringSSSDDDReturn555DDD() {
        //A
        String subject = "SSSDDD";
        String expected = "555DDD";
        RegMeNow regMeNow = new RegMeNow();

        //A
        String result = regMeNow.regConvertor(subject);

        //A
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void lowercaseStringConvertedToUppercase() {
        String subject = "saGbddd";
        String expected = "5498DDD";
        RegMeNow regMeNow = new RegMeNow();

        String result = regMeNow.regConvertor(subject);

        Assertions.assertThat(result).isEqualTo(expected);
    }
}
