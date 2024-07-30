package com.learning.designpatterns.strategy;

public class Character {
    private MovementBehavior behavior;
    public void setBehavior(MovementBehavior behavior) {
        this.behavior = behavior;
    }

    public void walk() {
        behavior.walk();
    }
}
