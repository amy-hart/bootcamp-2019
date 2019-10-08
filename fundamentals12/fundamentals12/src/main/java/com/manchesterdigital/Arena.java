package com.manchesterdigital;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arena {
    public static void main(String[] args) {
        Artist arianaGrande = new Artist("Ariana Grande",
                List.of(new Members("Ariana Grande")), "California");
        Artist beatles = new Artist("Beatles",
                List.of(new Members("John Lennon"),
                        new Members("Paul McCartney"),
                        new Members("Ringo Starr"),
                        new Members("George Harrison")), "Liverpool");
        Artist coldplay = new Artist("Coldplay",
                List.of(new Members("Chris Martin"),
                        new Members("Guy Berryman"),
                        new Members("Will Champion"),
                        new Members("Phil Harvey")), "London");

        List<Artist> artists = List.of(arianaGrande, beatles, coldplay);
        long countFromLiverpool = 0;

        for(Artist artist : artists) {
            if (artist.isFrom("Liverpool")) {
                countFromLiverpool++;

            }
        }

        System.out.println("countFromLiverpool = " + countFromLiverpool);

        Long numOfArtistsFromLiverpool = artists.stream()
                .filter(artist -> artist.isFrom("Liverpool"))
                .filter(artist -> artist.getMembersList().size() > 2)
                .count();

        System.out.println("numOfArtistsFromLiverpool = " + numOfArtistsFromLiverpool);

        String result = Stream.of("a", "b", "c")
                .filter(s -> s.equalsIgnoreCase("a"))
                .findFirst()
                .orElse(null);

        System.out.println("result = " + result);

        // gathering matched criteria to use elsewhere
        List<Artist> london = artists.stream()
                .filter(artist -> artist.isFrom("London"))
                .collect(Collectors.toList());

        // Extract all artist names and print them
        london.stream()
                .map(Artist::getName)
                .forEach(System.out::println);




    } // End main


}
