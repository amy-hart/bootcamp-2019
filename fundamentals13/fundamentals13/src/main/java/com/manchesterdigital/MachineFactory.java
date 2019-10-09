package com.manchesterdigital;

import java.util.List;

public class MachineFactory {

    public static Machine getMachine(boolean usesMilk) {
        if (usesMilk) {
            return new MilkshakeMachine("milky", "milk", Colours.RED);
        }

        return new FoodProcessor("foody", "food", Colours.BLUE, List.of());
    }

    public static Rotatable getMachineByRotation(boolean usesMilk) {

        if (usesMilk) {
            return new MilkshakeMachine("milky", "milk", Colours.RED);
        }

        return new FoodProcessor("foody", "food", Colours.BLUE, List.of());
    }

}
