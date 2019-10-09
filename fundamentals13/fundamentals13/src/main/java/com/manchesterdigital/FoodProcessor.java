package com.manchesterdigital;

import java.util.List;

public class FoodProcessor extends Machine implements BlendsFood, Rotatable {
    private final List<String> ingredients;

    public FoodProcessor(String manufacturer, String name, Colours colour, List<String> ingredients) {
        super(manufacturer, name, colour);

        this.ingredients = ingredients;
    }

    @Override
    public void mixFoodContents() {
        ingredients.stream()
                .forEach(ingredient -> System.out.println("Mixing = " + ingredient));

    }


    @Override
    public void rotate(int num) {
        System.out.println("Rotated " + num + " times...");

    }
}
