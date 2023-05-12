package org.example;

import lombok.Getter;

@Getter
public class Mago extends Heroi implements Vilao {

    private int magia = 10;
    private int forca = 10;

    @Override
    void bonusClasse() {

    }


    @Override
    public int roubaXp() {
        return 2;
    }
}
