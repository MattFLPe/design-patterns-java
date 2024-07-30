package com.learning.designpatterns.strategy;

public class WalkSlowBehavior implements MovementBehavior {
    @Override
    public void walk() {
        System.out.println("Character walks slowly...");
    }
}
