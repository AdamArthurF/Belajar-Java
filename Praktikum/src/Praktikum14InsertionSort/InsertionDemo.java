/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum14InsertionSort;

import org.jetbrains.annotations.NotNull;

public class InsertionDemo {
    public static void insertionSort(int @NotNull [] A) {
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > key)) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    public static void tampil(int @NotNull [] data) {
        for (int datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }
}

class InsertionDemo2 {
    public static void insertionSort(double @NotNull [] A) {
        for (int i = 1; i < A.length; i++) {
            double key = A[i];
            int j = i - 1;
            while ((j >= 0) && (A[j] > key)) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    public static void tampil(double @NotNull [] data) {
        for (double datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        int[] A = {10, 6, 8, 3, 1};
        InsertionDemo.tampil(A);
        InsertionDemo.insertionSort(A);
        InsertionDemo.tampil(A);
        double[] B = {10.3,6.2,8.4,3.6,1.1};
        InsertionDemo2.tampil(B);
        InsertionDemo2.insertionSort(B);
        InsertionDemo2.tampil(B);
    }
}