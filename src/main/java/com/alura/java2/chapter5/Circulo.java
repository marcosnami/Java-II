package com.alura.java2.chapter5;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class Circulo implements AreaCalculavel {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}
