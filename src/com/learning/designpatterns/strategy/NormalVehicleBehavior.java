package com.learning.designpatterns.strategy;

public abstract class NormalVehicleBehavior implements VehicleBehavior {
    @Override
    public void accelerate() {
        System.out.println("Accelerating vehicle...");
    }


}
