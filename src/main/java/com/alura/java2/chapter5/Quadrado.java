package com.alura.java2.chapter5;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class Quadrado implements AreaCalculavel {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}
