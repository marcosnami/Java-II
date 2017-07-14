package com.alura.java2.chapter1;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        System.out.println(cc.calculaTributos());

        // Testando Polimorfismo
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}
