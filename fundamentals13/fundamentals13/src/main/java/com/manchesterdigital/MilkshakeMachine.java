package com.manchesterdigital;

public class MilkshakeMachine extends  Machine implements HasMilk, Rotatable{
    public MilkshakeMachine(String manufacturer, String name, Colours colour) {
        super(manufacturer, name, colour);
    }

    // implementing addMilk interface/ method
    @Override
    public void addMilk() {
        System.out.println("Adding milk to machine...");
    }


    @Override
    public void rotate(int num) {
        System.out.println("Rotating " + num + " times");
    }
}
