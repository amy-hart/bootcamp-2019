package com.manchesterdigital;

public class SamsungPhone {
    private final String modelNumber;
    private String colour;
    private final SamsungTechSpecs techSpecs;

    public SamsungPhone(String modelNumber, String colour, SamsungTechSpecs techSpecs) {
        this.modelNumber = modelNumber;
        this.colour = colour;
        this.techSpecs = techSpecs;
    }

    // Getters
    public String getColour() {
        return colour;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public SamsungTechSpecs getTechSpecs() {
        return techSpecs;
    }

    public void SendTextMessage (String messageContents) {
        System.out.println("Text message has been sent: " + messageContents);
    }

    public void TakeAPhoto () {
        System.out.println("Photo has been taken...");
    }

}
