package com.java.strategy.animais;

import com.java.strategy.habilidades.StrategySkills;

public class Gato {

    private StrategySkills habilidade;

    public void setHabilidade(StrategySkills habilidade) {
        this.habilidade = habilidade;
    }

    public void mover(){
        habilidade.andar();
        habilidade.nadar();
        habilidade.voar();
    }
}
