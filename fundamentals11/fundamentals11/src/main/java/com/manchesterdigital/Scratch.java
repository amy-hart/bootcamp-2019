package com.manchesterdigital;

import java.util.*;

public class Scratch {
    public static void main(String[] args) {
        Artist adele = new Artist("Adele", 9000000L);
        Artist prince = new Artist("Prince", 20000000L);

        List<Artist> artists  = Arrays.asList(
                adele,
                prince
        );
        
        for (Artist artist : artists) {
            System.out.println("artist = " + artist);
        };

        Map<Long, Artist> artistMap = new HashMap<>();

        artistMap.put(1L, adele);
        artistMap.put(2L, prince);

        for (Map.Entry<Long, Artist> entry : artistMap.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        };

        // Iterate over keys:

        for (Long key : artistMap.keySet()) {
            System.out.println("key = " + key);

            if(artistMap.containsKey(key)) {
                System.out.println("key = " + key + " exists");
            };
        }

        // for values:

        for (Artist artist : artistMap.values()) {
            System.out.println("artist = " + artist);
        }

        // Sets:

        Set<Artist> artistSet = new HashSet<>(artistMap.values());

        // Iterate over unique values from artists:

        for (Artist artist : artistSet) {
            System.out.println("artist = " + artist);
        }

        // Immutability
        // Create immutable list, set, and map - This is like setting immutable sets in Python
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        // numbers.add(6); - Can't do this, will see an error at runtime

        for (Integer i : numbers) {
            System.out.println("i = " + i);
        }
        
        Set<Long> distances = Set.of(1L, 2L, 3L, 4l);
        
        for (Long distance : distances){
            System.out.println("distance = " + distance);
        }

        Map<Long, String> namesMap = Map.of(1L, "John", 2L, "April");

        for (Map.Entry<Long, String> nameEntry : namesMap.entrySet()) {
            System.out.println("nameEntry value = " + nameEntry.getValue());
        }

    }
}
