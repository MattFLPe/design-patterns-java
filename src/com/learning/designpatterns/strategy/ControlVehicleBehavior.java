package com.learning.designpatterns.strategy;

public abstract class ControlVehicleBehavior implements VehicleBehavior  {
    @Override
    public void controlSteeringWheel() {
        System.out.println("Controlling the wheel...");
    }
}
