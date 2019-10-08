package com.manchesterdigital;

public class Artist {
    // Instance variables
    private final String name;
    private final Long numberOfFollowers;

    // Constructor
    public Artist(String name, Long numberOfFollowers) {
        this.name = name;
        this.numberOfFollowers = numberOfFollowers;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Long getNumberOfFollowers() {
        return numberOfFollowers;
    }

    // Auto generated toString
    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", numberOfFollowers=" + numberOfFollowers +
                '}';
    }
}
