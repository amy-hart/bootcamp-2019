package com.manchesterdigital;

public class Tesla extends Vehicle implements Movement, IsChargable {

    public Tesla(String colour, Integer numberOfSeats, TransmissionType transmissionType, Double engineSize, String manufacturer) {
        super(colour, numberOfSeats, transmissionType, engineSize, manufacturer);
    }

    @Override
    public void moveForwards() {
        System.out.println("Moving Tesla forwards...");
    }

    @Override
    public void reverse() {
        System.out.println("Reversing Tesla");
    }

    @Override
    public void superCbarge() {
        System.out.println("Now charging...");
    }
}
