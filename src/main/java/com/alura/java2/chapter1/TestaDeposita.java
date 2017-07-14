package com.alura.java2.chapter1;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TestaDeposita {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        try {
            cc.deposita(-1000);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }

    }
}
