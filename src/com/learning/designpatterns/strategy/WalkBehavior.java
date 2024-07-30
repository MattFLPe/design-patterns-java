package com.learning.designpatterns.strategy;

public class WalkBehavior implements MovementBehavior {
    @Override
    public void walk() {
        System.out.println("Character walks normally...");
    }
}
