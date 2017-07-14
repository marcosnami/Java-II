package com.alura.java2.chapter1;

/**
 * Created by MarcosNami on 6/24/2017.
 */
public class TestaContas {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        AtualizadorDeContas atualizadorDeContas = new AtualizadorDeContas(0.01);

        contaCorrente.deposita(1000);
        contaPoupanca.deposita(1000);

        atualizadorDeContas.roda(contaCorrente);
        atualizadorDeContas.roda(contaPoupanca);
        /*conta.atualiza(0.01);
        contaCorrente.atualiza(0.01);
        contaPoupanca.atualiza(0.01);*/

        /*System.out.println(conta.getSaldo());
        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaPoupanca.getSaldo());*/
        System.out.printf("Saldo Total: R$ %.2f\n", atualizadorDeContas.getSaldoTotal());

    }
}
