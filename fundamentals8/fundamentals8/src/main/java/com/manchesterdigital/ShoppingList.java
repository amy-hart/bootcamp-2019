package com.manchesterdigital;

import java.util.ArrayList;
import java.util.Optional;

public class ShoppingList {
    private ArrayList<Item> shoppingListItems;

    public ShoppingList() {
        this.shoppingListItems = new ArrayList<>();
    }

    public boolean addItem(Item item) {

        return shoppingListItems.add(item);
    }

    public boolean removeItem(Item item) {

        return shoppingListItems.remove(item);
    }

    public Item updateItem(int index, Item item) {
        shoppingListItems.set(index, item);

        return shoppingListItems.get(index);
    }

    public Item retrieveItem(String name) {
        Optional<Item> maybeItemFound = shoppingListItems
                .stream()
                .filter(item -> item.getName().equalsIgnoreCase(name))
                .findAny();

        return maybeItemFound.get();
    }
}


/*

const names = [ "john", "jill" ];
const matchMe = "Amy";

const matches = names.filter(n => n === matchMe);

if (matches.length > 0) {
    matches[0]
    }

    names.filter(n => n === "Amy")
    .map(n => capitalise(n));

 */