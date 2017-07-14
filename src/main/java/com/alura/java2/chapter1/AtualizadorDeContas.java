package com.alura.java2.chapter1;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void roda(Conta conta) {
        System.out.println("===============================");
        //System.out.println("Saldo Anterior: R$" + conta.getSaldo());
        System.out.printf("Saldo Anterior: R$ %.2f \n", conta.getSaldo());
        conta.atualiza(selic);
        System.out.printf("Saldo Atual: R$ %.2f \n", conta.getSaldo());
        saldoTotal += conta.getSaldo();
    }
}
