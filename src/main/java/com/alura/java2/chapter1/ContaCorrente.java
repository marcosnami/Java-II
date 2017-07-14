package com.alura.java2.chapter1;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class ContaCorrente extends Conta implements Tributavel {
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public double calculaTributos() {
        return getSaldo() * 0.01;
    }

}
