package com.java.strategy.habilidades;

public class NadarFrente implements StrategySkills{
    @Override
    public void andar() {
        System.out.println("Sem habilidade para andar");
    }

    @Override
    public void voar() {
        System.out.println("Sem habilidade para voar");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando");
    }
}
