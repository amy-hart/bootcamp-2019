package com.manchesterdigital;

import java.util.List;

public class Artist {
    // Variables
    private final String name;
    private final String location;
    private final List<Members> membersList;
    private String song;
    private String album;

    // Constructor
    public Artist(String name, List<Members> membersList, String location) {
        this.name = name;
        this.location = location;
        this.membersList = membersList;
    }

    // Getters and setters


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Members> getMembersList() {
        return membersList;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public boolean isFrom(String locationRequired) {
        return location.equalsIgnoreCase(locationRequired);
    }



}
