package com.learning.designpatterns.singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() {
        super();
    }
    // Sem necessidade de instanciar
    public static EagerSingleton getInstance() {
        return instance;
    }
}
