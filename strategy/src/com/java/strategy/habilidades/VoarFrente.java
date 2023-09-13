package com.java.strategy.habilidades;

public class VoarFrente implements StrategySkills{
    @Override
    public void andar() {
        System.out.println("Sem habilidade andar");
    }

    @Override
    public void voar() {
        System.out.println("Voando");
    }

    @Override
    public void nadar() {
        System.out.println("Sem habilidade nadar");
    }
}
