package com.alura.java2.chapter6;

/**
 * Created by MarcosNami on 6/25/2017.
 */
public class TesteErro {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        try {
            metodo2();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e);
        }
        System.out.println("fim do metodo1");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        System.out.println("fim do metodo2");

        for (int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(i);
        }

    }
}
