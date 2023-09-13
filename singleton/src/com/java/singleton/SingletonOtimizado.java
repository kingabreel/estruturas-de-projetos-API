package com.java.singleton;

public class SingletonOtimizado {
    //Chamado de singleton lazy holder, é otimizado em questão de memoria e é thread safe.

    public static class Instancia {
        public static SingletonOtimizado singleton = new SingletonOtimizado();
    }

    private SingletonOtimizado(){}

    public static SingletonOtimizado getInstance(){
        return Instancia.singleton;
    }
}
