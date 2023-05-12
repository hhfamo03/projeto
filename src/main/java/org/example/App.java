package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Mago mago = new Mago();
        Padre padre = new Padre();

        mago.getMagia();

        testaMetodo(mago);
    }

    public static void testaMetodo(Vilao personagem) {

        int[] lista = new int[3];

        lista[0] = 1;
        lista[1] = 2;
        lista[2] = 3;

        for (int i = 0; i < 4; i++) {
            System.out.println(lista[i]);
        }

        personagem.roubaXp();
        System.out.println("é um vilão");
    }

}
