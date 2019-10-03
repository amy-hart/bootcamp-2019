package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, String> menuMap;


    public Menu() {
        menuMap = new HashMap<>();
        menuMap.put("Mexican","Taco, Burrito");
        menuMap.put("Indian","Tandoori Chicken, Bhuna Ghosht");
        menuMap.put("Pan Asian", "Stir Fry Noodles, Dimsum");
        menuMap.put("English", "Beef Wellington, Fish and Chips");
    }

    public String searchMenu(String categoryOfFood) {
        if (menuMap.containsKey(categoryOfFood)) {
            return menuMap.get(categoryOfFood);
        }
        throw new IllegalArgumentException("We don't serve this type of food on the menu: " + categoryOfFood);
    }
}
