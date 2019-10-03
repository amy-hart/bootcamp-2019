package com.manchesterdigital;

public class SamsungSandBox {

    public static void main(String[] args) {
        Samsung1000TechSpecs samsung1000TechSpecs = new Samsung1000TechSpecs(7,64,4, true);
        samsung1000TechSpecs.setCameraPixels(20000);
        Samsung1000 samsung1000 = new Samsung1000("M8000HN", "Red", samsung1000TechSpecs);

        samsung1000.TakeAPhoto();
        samsung1000.SendTextMessage("Hello!");

        System.out.println(samsung1000.getTechSpecs());
    }
}
