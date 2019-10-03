package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        // Map <Datatype of key, Datatype of value>
        // Better practice for creating a HashMap
        Map<String, String> countries = new HashMap<>();
        countries.put("enGB", "England");
        countries.put("esES", "Spain");
        countries.put("ptPT", "Portugal");

        // Worst practise because can't change map type on the right
        // HashMap<String, String> names = new HashMap<>();
        // names.put("John", "John");

        // Find item in HashMap
        String key = "ptPT";
        String portugal = countries.get(key);
        System.out.println(portugal);

        // Replace the value for "ptPT"
        countries.put(key, "DUNCAN");
        // Get value for item with key "ptPT"
        portugal = countries.get(key);
        System.out.println("Portugal is now: " + portugal);

        Map<Integer, String> names = new HashMap<>();
        names.put(1, "John");
        names.put(2, "Andrew");

        // Removes item by key
        String removedName = names.remove(2);
        System.out.println("removedName =" + removedName);

        names.remove(2);

        // Empties the map
        names.clear();

        System.out.println("numberOfItemsInMap = " + names.size());

        names.put(1, "April");
        names.put(2, "Sania");
        names.put(3, "Schmek");

        // entrySet = keys and values?
        for (Map.Entry<Integer, String> name : names.entrySet()) {

            System.out.println("Key - " + name.getKey() + " , value = " + name.getValue());
        }

        for (Integer namesKey : names.keySet()) {

            System.out.println("mapKey = " + namesKey);
        }

        for (String namesValue : names.values()) {
            System.out.println("val = " + namesValue);
        }

        // Check if map contains a key
        boolean namesContainsKey = names.containsKey(1);
        System.out.println("namesContainsKey: " + namesContainsKey);

        // Check if map contains a value
        boolean namesContainsValue = names.containsValue("2345678");
        System.out.println("namesContainsValue: " + namesContainsValue);
    }
}
