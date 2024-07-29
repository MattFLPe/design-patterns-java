package com.learning.designpatterns.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstance();
        System.out.println(eager);

        LazyHolderSingleton lazyholder = LazyHolderSingleton.getInstance();
        System.out.println(lazyholder);
    }
}
