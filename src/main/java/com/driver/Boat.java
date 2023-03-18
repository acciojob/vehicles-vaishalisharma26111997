package com.driver;

public abstract class Boat implements WaterVehicle {
String name;
int capacity;

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }
}
