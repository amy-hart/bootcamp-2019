package com.manchesterdigital;

public class Samsung1000 extends SamsungPhone {
    public Samsung1000(String modelNumber, String colour, SamsungTechSpecs techSpecs) {
        super(modelNumber, colour, techSpecs);
    }

    public void TakeAPhoto() {
        System.out.println("Wide angled photo taken...");
    }
}
