package com.manchesterdigital;

// Liskov Substitution
// Car becomes redundant as it's replaced by MoveVehicle and HasEngine
public interface Car {
    void startEngine();
    void accelerate();

}
