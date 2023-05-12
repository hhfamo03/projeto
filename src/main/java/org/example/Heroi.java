package org.example;

import lombok.Data;

@Data
public abstract class Heroi {

    private boolean vivo = true;

    private int hpAtual;

    private int mpAtual;

    private double experiencia;

    private int level;

    private int hp;

    private int mp;

    private String nome;

    private int ataque;

    private int defesa;

    private int agilidade;

    private Elemento elemento;

    public Heroi() {
        this.level = 1;
        this.hp = 100;
        this.mp = 100;
        this.ataque = 10;
        this.defesa = 5;
        this.agilidade = 5;
        this.hpAtual = this.hp;
        this.mpAtual = this.mp;
    }

    public void adicionarExperiencia(int exp) {
        experiencia += exp;
        while (experiencia >= 100) {
            experiencia = experiencia - 100;
            aumentarAtributos();
        }
    }

    private void aumentarAtributos() {
        this.level++;
        this.hp+= 20*level;
        this.mp+= 10*level;
        this.ataque+= 5*level;
        this.defesa+= 3*level;
        this.agilidade+= 2*level;
        this.hpAtual = this.hp;
        this.mpAtual = this.mp;
    }

    public boolean isVivo() {
        this.vivo = getHpAtual() >= 0;
        return this.vivo;
    }


    abstract void bonusClasse();

}
