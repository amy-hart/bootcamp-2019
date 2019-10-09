package com.manchesterdigital;

public abstract class Machine {
    private final String manufacturer;
    private final String name;
    private final Colours colour;
    private Integer weight;

    public Machine(String manufacturer, String name, Colours colour) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.colour = colour;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public Colours getColour() {
        return colour;
    }

    public Integer getWeight() {
        return weight;
    }
}
