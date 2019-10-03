package com.manchesterdigital;

// Example of dependency inversion
public class Windows98Machine {
    private final Keyboard standardKeyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard standardKeyboard, Monitor monitor) {
        this.standardKeyboard = standardKeyboard;
        this.monitor = monitor;
    }
}
