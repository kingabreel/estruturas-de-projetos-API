package com.java.strategy.habilidades;

public class AndarFrente implements StrategySkills{

    @Override
    public void andar() {
        System.out.println("Andando a frente");
    }

    @Override
    public void voar() {
        System.out.println("Sem habilidade de voo");
    }

    @Override
    public void nadar() {
        System.out.println("Sem habilidade para nadar");
    }
}
