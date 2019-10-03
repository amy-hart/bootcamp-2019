package com.manchesterdigital;

public interface IsChargable {
    void superCbarge();

    default void describe() {
        System.out.println("I'm green!");
    }
}
