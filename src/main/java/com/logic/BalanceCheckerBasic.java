package com.logic;

import java.util.ArrayList;

public class BasicWay {

    public static void main(String[] args) {
        java.util.List<Integer> array = new ArrayList<>(7);
        array.add(3);
        array.add(7);
        array.add(1);
        array.add(11);
        array.add(7);
        array.add(3);
        array.add(1);

        Integer indiceMeio = indicemeio(array);
        Integer somaDireta = somarDireta(array, indiceMeio);
        Integer somaEsquerda = somarEsquerda(array, indiceMeio);
        if (somaEsquerda == somaDireta) {
            System.out.println("Condição OK");
        } else {
            System.out.println("Condição não ok");
        }

    }

    private static Integer indicemeio(java.util.List<Integer> array) {
        return array.size() / 2;

    }

    private static Integer somarEsquerda(java.util.List<Integer> array, Integer indiceMeio) {
        Integer soma = 0;

        for (int i = 0; i < array.size(); i++) {
            if (i < indiceMeio) {
                soma += array.get(i);
            }
        }
        return soma;
    }

    private static Integer somarDireta(java.util.List<Integer> array, Integer indiceMeio) {
        Integer soma = 0;

        for (int i = 0; i < array.size(); i++) {
            if (i > indiceMeio) {
                soma += array.get(i);
            }
        }
        return soma;
    }
}
