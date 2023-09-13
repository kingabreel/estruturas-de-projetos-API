package com.java.strategy;

import com.java.strategy.animais.Gato;
import com.java.strategy.animais.Pato;
import com.java.strategy.habilidades.*;

public class Main {
    public static void main(String[] args) {
        StrategySkills andar = new AndarFrente();
        StrategySkills todasSkills = new AndarNadarVoar();

        Gato gato = new Gato();
        Pato pato = new Pato();

        gato.setHabilidade(andar);
        gato.mover();

        System.out.println("\n=============");

        pato.setHabilidade(todasSkills);
        pato.mover();
    }
}
