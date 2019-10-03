package com.manchesterdigital;

public class Address {
    private final String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private final String cityTown;
    private final String postcode;

    public Address(String addressLine1, String cityTown, String postcode) {
        this.addressLine1 = addressLine1;
        this.cityTown = cityTown;
        this.postcode = postcode;
    }

    // Ovveride to return address as string if address.toString() is called
    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", addressLine3='" + addressLine3 + '\'' +
                ", addressLine4='" + addressLine4 + '\'' +
                ", cityTown='" + cityTown + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }


}
