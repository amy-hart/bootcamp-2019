package com.manchesterdigital;

import static com.manchesterdigital.Dishes.MEXICAN;

public class EnumsExample {
    public static void main(String[] args) {
        for (Colours colour : Colours.values()) {
            System.out.println("colour = " + colour);
        }

        System.out.println("Dishes.MEXICAN.getDishName() = " + MEXICAN.getDishName());
        System.out.println("MEXICAN.getHeatLevel() = " + MEXICAN.getHeatLevel());

        String dishName = "tacos";

        Dishes retrievedDish = Dishes.retrieveByDishName(dishName);
        System.out.println("retrievedDish = " + retrievedDish);
    }
}
