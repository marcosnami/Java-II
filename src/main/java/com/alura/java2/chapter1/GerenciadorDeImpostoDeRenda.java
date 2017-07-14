package com.alura.java2.chapter1;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class GerenciadorDeImpostoDeRenda {

    private double total;

    public double getTotal() {
        return total;
    }

    public void adiciona(Tributavel t) {
        System.out.println("Adicionando Tributavel: " + t);

        total += t.calculaTributos();
    }
}
