package com.logic;

import java.util.Arrays;

public class BalanceCheckerPro {

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 11, 7, 3, 1};
        System.out.println(checkBalance(array) ? "Condição OK" : "Condição não OK");
    }

    public static boolean checkBalance(int[] array) {
        int middle = array.length / 2;
        int sumLeft = Arrays.stream(array, 0, middle).sum();
        int sumRight = Arrays.stream(array, middle + 1, array.length).sum();
        return sumLeft == sumRight;
    }
}

