package org.example;

import lombok.Data;

@Data
public class Padre extends Heroi {

    private int cura = 10;

    @Override
    void bonusClasse() {
        setDefesa(this.getDefesa() + 2);
        setHp(this.getHp() + 20);
        setCura(this.getCura() + 20);
        setMp(this.getMp() + 10);
    }

    public void curar() {
        this.setHpAtual(cura + this.getHpAtual());
    }


}
