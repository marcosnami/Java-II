package com.alura.java2.chapter5;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class Retangulo implements AreaCalculavel {

    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return largura * altura;
    }
}
