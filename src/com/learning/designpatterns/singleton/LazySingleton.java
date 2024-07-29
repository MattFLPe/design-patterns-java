package com.learning.designpatterns.singleton;

public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {
        super();
    }
    // Diferentemente do Eager Singleton, o Lazy Singleton faz uma verificação antes de instanciar;
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
