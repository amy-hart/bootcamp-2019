package com.manchesterdigital;

import java.util.Objects;

public class Item {

    private final String name;
    private final Integer quantity;

    public Item(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
}
