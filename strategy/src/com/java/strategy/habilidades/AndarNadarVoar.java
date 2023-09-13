package com.java.strategy.habilidades;

public class AndarNadarVoar implements StrategySkills{
    @Override
    public void andar() {
        System.out.println("Andando");
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando");
    }
}
