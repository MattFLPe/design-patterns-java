package com.learning.designpatterns.strategy;

public class WalkFastBehavior implements MovementBehavior {
    @Override
    public void walk() {
        System.out.println("Character walks fast...");
    }
}
