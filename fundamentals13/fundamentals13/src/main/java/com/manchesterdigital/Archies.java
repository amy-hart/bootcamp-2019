package com.manchesterdigital;

import java.util.List;

public class Archies {
    public static void main(String[] args) {
        /*
        Machine machine = new Machine("zanussi", "mega", Colours.BLUE);
        System.out.println("machine.toString() = " + machine.toString());
        */

        MilkshakeMachine milkshakeMachine = new MilkshakeMachine("sony", "smoothie", Colours.PINK);
        System.out.println("milkshakeMachine.toString() = " + milkshakeMachine.toString());

        milkshakeMachine.putInChiller();

        List<String> ingredients = List.of("carrots", "banana");

        FoodProcessor foodProcessor = new FoodProcessor("samsung", "blender", Colours.BLUE, ingredients);
        System.out.println("foodProcessor.toString() = " + foodProcessor.toString());

        foodProcessor.mixFoodContents();


        Machine machine = MachineFactory.getMachine(true);
        System.out.println("machine.toString() = " + machine.toString());

        Rotatable machineByRotation = MachineFactory.getMachineByRotation(false);
        machineByRotation.rotate(5);

    }

}
