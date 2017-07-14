package com.alura.java2.chapter1;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double valor) {
        if (valor < 0) {
            //throw new IllegalArgumentException("O valor depositado e negativo R%" + valor);
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor;
        }
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public abstract void atualiza(double taxa);
}
