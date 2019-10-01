package com.manchesterdigital;

// Could have used method overloading for creating second method that copes with vans
public class ParkingCalculator {

    public static int calculator (int startTime, int endTime, boolean isVan) {
        int price = 0;
        int discontAmount;
        if(startTime >= 0 && endTime < 5) {
            price = 300;
        } else if (startTime >= 5 && endTime < 10) {
            price = 350;
        } else if (startTime >= 10 && endTime < 15) {
            price = 500;
        } else if (startTime >= 15 && endTime < 20) {
            price = 700;
        } else if (startTime >= 20 && endTime <= 24) {
            price = 400;
        }

        if(isVan) {
            price *= 2;
        }

        if(endTime < 15) {
             discontAmount = (price / 100) * 25;
             price -= discontAmount;
        }

        return price;
    }


}
