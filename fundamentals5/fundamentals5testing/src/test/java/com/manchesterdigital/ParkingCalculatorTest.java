package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

// Could have used method overloading for creating second method that copes with vans

public class ParkingCalculatorTest {
    @Test
    public void whenTimeIsEqualToZeroAndLessThanFive() {

        // Arrange
        int startTime = 0;
        int endTime = 4;
        boolean isVan = true;

        // Act
        int parkingCost = ParkingCalculator.calculator(startTime, endTime, isVan);

        // Assert
        //Assertions.assertThat(parkingCost).isEqualTo(300);
        Assertions.assertThat(parkingCost).isEqualTo(450);

    }

    @Test
    public void whenTimeIsEqualToFiveAndLessThanTen() {

        // Arrange
        int startTime = 5;
        int endTime = 9;
        boolean isVan = false;

        // Act
        int parkingCost = ParkingCalculator.calculator(startTime, endTime, isVan);

        // Assert
        Assertions.assertThat(parkingCost).isEqualTo(262.5);

    }

    @Test
    public void whenTimeIsEqualToTenAndLessThanFifteen() {

        // Arrange
        int startTime = 10;
        int endTime = 14;
        boolean isVan = false;

        // Act
        int parkingCost = ParkingCalculator.calculator(startTime, endTime, isVan);

        // Assert
        Assertions.assertThat(parkingCost).isEqualTo(500);
    }

    @Test
    public void whenTimeIsEqualToFifteenAndLessThanTwenty() {

        // Arrange
        int startTime = 15;
        int endTime = 19;
        boolean isVan = false;

        // Act
        int parkingCost = ParkingCalculator.calculator(startTime, endTime, isVan);

        // Assert
        Assertions.assertThat(parkingCost).isEqualTo(700);

    }

    @Test
    public void whenTimeIsEqualToTwentyAndLessThanTwentyFour() {

        // Arrange
        int startTime = 20;
        int endTime = 24;
        boolean isVan = false;

        // Act
        int parkingCost = ParkingCalculator.calculator(startTime, endTime, isVan);

        // Assert
        Assertions.assertThat(parkingCost).isEqualTo(400);

    }

    @Test
    public void whenEndTimeBeforeFifteen() {

        // Arrange
        int startTime = 0;
        int endTime = 4;
        boolean isVan = true;

        // Act
        int parkingCost = ParkingCalculator.calculator(startTime, endTime, isVan);

        // Assert
        Assertions.assertThat(parkingCost).isEqualTo(450);

    }

    /*
    @Test
    public void whenInputIsNotValid() {

        // Arrange
        int startTime = "20";
        int endTime = "24";
        boolean isVan = true;

        // Act
        int parkingCost = ParkingCalculator.calculator(startTime, endTime, isVan);

        // Assert
        Assertions.assertThat(parkingCost).isEqualTo(400);

    }*/
}
