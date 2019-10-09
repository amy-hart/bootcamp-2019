package com.manchesterdigital;

import java.util.List;
import java.util.Map;

public enum Dishes {
    // Calls to create enums/ definitions
    MEXICAN("tacos", 90),
    INDIAN("daal", 70),
    FRENCH("snails", 0),
    GERMAN("bratwerst", 100);

    private static Map<Dishes, String> dishesToDishNameMap;

    static {
        dishesToDishNameMap = Map.of(
                MEXICAN, "tacos",
                INDIAN, "daal",
                FRENCH, "snails",
                GERMAN, "bratwerst"
        );
    }

    // Variables
    private final String dishName;
    private final Integer heatLevel;

    // Constructor
    Dishes(String dishName, Integer heatLevel) {
        this.dishName = dishName;
        this.heatLevel = heatLevel;
    }

    // Getters
    public String getDishName() {
        return dishName;
    }

    public Integer getHeatLevel() {
        return heatLevel;
    }

    public static Dishes retrieveByDishName(String requiredDishName) {

        /*
        if (dishesToDishNameMap.containsValue(requiredDishName)) {
            dishesToDishNameMap.entrySet()
                    .stream()
                    .filter(dishesStringEntry -> dishesStringEntry.getValue().equalsIgnoreCase(requiredDishName))
                    .findFirst()
                    .get()
                    .getKey();
        }*/

        return dishesToDishNameMap.entrySet()
                .stream()
                .filter(dishesStringEntry -> dishesStringEntry.getValue().equalsIgnoreCase(requiredDishName))
                .findFirst().orElseThrow(IllegalStateException::new)
                .getKey();

    }
}
