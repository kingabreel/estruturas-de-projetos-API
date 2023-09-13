package com.java.singleton;

public class SingletonSimples {
    private static SingletonSimples singleton;

    private SingletonSimples(){
        super(); //super opicional
    }

    public static SingletonSimples getInstance(){

        //verificação se o singleton não foi instanciado
        if (singleton == null) {
            singleton = new SingletonSimples();
        }
        return singleton;
    }
}
