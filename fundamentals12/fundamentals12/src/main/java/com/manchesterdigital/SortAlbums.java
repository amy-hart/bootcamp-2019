package com.manchesterdigital;

import java.util.List;

public class SortAlbums {
    public static void main(String[] args) {

        Album  twelveStopsAndHome = new Album("Twelve stops and home");
        Album  laPetiteMort = new Album("La petite mort");
        Album  americanIdiot = new Album("American Idiot");
        Album  absolution = new Album("Absolution");

        List<Album> albums = List.of(twelveStopsAndHome, laPetiteMort, americanIdiot, absolution);

        albums.stream()
                .filter((album) -> album.getName().startsWith("A"))
                .forEach(album -> System.out.println("album = " + album));


    }
}
