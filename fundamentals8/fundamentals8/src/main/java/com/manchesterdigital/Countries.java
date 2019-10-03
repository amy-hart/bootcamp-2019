package com.manchesterdigital;

public enum Countries {

    // Creating Enum
    // Use commas to separate lists of enums, you'll get an error if you use semicolons
    // Use a semicolon to end the list
    GERMANY("Germany", "de"),
    SPAIN("Spain", "es");

    // Variables which belong to the enum
    private String name;
    private String isoCode;

    // Constructor for building the enum
    Countries(String name, String isoCode) {
        this.name = name;
        this.isoCode = isoCode;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getIsoCode() {
        return isoCode;
    }
}
