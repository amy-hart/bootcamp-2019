package com.manchesterdigital;

public interface HasMilk {

    void addMilk() throws IllegalStateException;

    default void putInChiller() {
        System.out.println("Chill out...");
    }
}
