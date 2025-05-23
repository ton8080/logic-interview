package com.logic;

public class BalanceCheckerBasic {

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 11, 7, 3, 1};

        Integer indiceMeio = indiceMeio(array);
        Integer somaDireta = somarDireta(array, indiceMeio);
        Integer somaEsquerda = somarEsquerda(array, indiceMeio);
        if (somaEsquerda == somaDireta) {
            System.out.println("Condição OK");
        } else {
            System.out.println("Condição não ok");
        }

    }

    private static Integer indiceMeio(int[] array) {
        return array.length / 2;

    }

    private static Integer somarEsquerda(int[] array, Integer indiceMeio) {
        Integer soma = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < indiceMeio) {
                soma += array[i];
            }
        }
        return soma;
    }

    private static Integer somarDireta(int[] array, Integer indiceMeio) {
        Integer soma = 0;

        for (int i = 0; i < array.length; i++) {
            if (i > indiceMeio) {
                soma += array[i];
            }
        }
        return soma;
    }
}
