package com.alura.java2.chapter1;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TestaGerenciadorDeImpostoDeRenda {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());
    }
}
