package com.alura.java2.chapter1;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class ContaPoupanca extends Conta {

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}
