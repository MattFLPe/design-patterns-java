package com.learning.designpatterns.singleton;

public class LazyHolderSingleton {
    // Encapsula a instância dentro de uma classe;
    private static class InstanceHolder {
        public static LazyHolderSingleton instance = new LazyHolderSingleton();
    }
    private LazyHolderSingleton() {
        super();
    }
    public static LazyHolderSingleton getInstance() {
        return InstanceHolder.instance;
    }
}
