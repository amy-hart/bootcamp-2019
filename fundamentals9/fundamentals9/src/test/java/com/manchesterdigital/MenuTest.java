package com.manchesterdigital;


import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MenuTest {

    private Menu menu;

    @Before
    public void setup() {
        menu = new Menu();
    }

    @Test
    public void requestingMexicanDishes() {
        // Act
        String result = menu.searchMenu("Mexican");

        // Assertions
        Assertions.assertThat(result).isEqualTo("Taco, Burrito");
    }
    @Test
    public void requestingIndianDishes() {
        // Act
        String result = menu.searchMenu("Indian");

        // Assertions
        Assertions.assertThat(result).isEqualTo("Tandoori Chicken, Bhuna Ghosht");
    }
    @Test
    public void requestingPanAsianDishes() {
        // Act
        String result = menu.searchMenu("Pan Asian");

        // Assertions
        Assertions.assertThat(result).isEqualTo("Stir Fry Noodles, Dimsum");
    }
    @Test
    public void requestingEnglishDishes() {
        // Act
        String result = menu.searchMenu("English");

        // Assertions
        Assertions.assertThat(result).isEqualTo("Beef Wellington, Fish and Chips");
    }

    @Test(expected = IllegalArgumentException.class)
    public void dishesNotFound() {
        // Act
        menu.searchMenu("Irish");
    }

    /*
    @Test
    public void niceMessageWhenCategoryNotValid() {
        String errorMessage;
        // Act
        try {
            menu.searchMenu("Irish");
        }
        catch (IllegalArgumentException exception ) {
            errorMessage = exception.getMessage();
        }

        Assertions.assertThat(errorMessage).isEqualTo("We don't serve this type of food on the menu: Irish");
    }*/
}
