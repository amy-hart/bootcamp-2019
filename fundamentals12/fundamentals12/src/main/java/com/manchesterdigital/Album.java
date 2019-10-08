package com.manchesterdigital;

public class Album {

    // variables
    private String name;

    // Constructor
    public Album(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                '}';
    }
}
