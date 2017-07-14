package com.alura.java2.chapter1;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class ValorInvalidoException extends RuntimeException {

    //private final double valor;

    public ValorInvalidoException(double valor) {
        super("O valor a ser depositado e invalido: " + valor);
        //this.valor = valor;
    }

    //public double getValor() {
        //return valor;
    //}
}
