package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ShoppingListTest {
    @Test
    public void addItemToShoppingList() {
        // Arrange
        Item coke = new Item("CocaCola", 6);
        ShoppingList shoppingList = new ShoppingList();

        // Act
        boolean result = shoppingList.addItem(coke);

        // Assert
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    public void shouldRemoveItemFromShoppingList() {
        // Arrange
        Item pizza = new Item("Pizza", 1);
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addItem(pizza);

        // Act

        boolean result = shoppingList.removeItem(pizza);

        // Assert
        Assertions.assertThat(result).isTrue(); //.isEqualTo(true);
    }

    @Test
    public void shouldUpdateItem() {
        // Arrange
        Item coke = new Item("CocaCola", 1);
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addItem(coke);

        int index = 0;
        Item pizza = new Item("Pizza", 2);

        // Act

        Item result = shoppingList.updateItem(index, pizza);

        // Assert
        Assertions.assertThat(result.getName()).isEqualTo(pizza.getName());
    }

    @Test
    public void shouldRetrieveItem() {
        // Arrange
        Item coke = new Item("CocaCola", 1);
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addItem(coke);

        // Act

        Item result = shoppingList.retrieveItem(coke.getName().toUpperCase());

        // Assert
        Assertions.assertThat(result.getName()).isEqualTo(coke.getName());
    }
}
