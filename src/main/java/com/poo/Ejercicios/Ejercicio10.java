package com.poo.Ejercicios;

import java.util.Arrays;

public class Ejercicio10 {
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];

        for (int i = 0; i < A.length; i++) {
            A[i] = (Math.random() * 100);
        }

        Arrays.sort(A);

        B = Arrays.copyOfRange(A, 0, 20);
        Arrays.fill(B, 10, 20, 0.5);

        System.out.println("Arreglo A: " + Arrays.toString(A));
        System.out.println("Arreglo B: " + Arrays.toString(B));
    }
}
