/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum15ShellSort;

import org.jetbrains.annotations.NotNull;

public class ShellDemo {

    public static void shellSort(int @NotNull [] arr) {
        int n = arr.length;
        int C, M;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;
        while (jarak >= 1) {
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah) {
                Sudah = false;
                for (j = 0; j < n - jarak; j++) {
                    i = j + jarak;
                    C++;
                    if (arr[j] > arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }
    }

    public static void tampil(int @NotNull [] data) {
        for (int datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }
}

class ShellDemo2 {
    public static void shellSort(int @NotNull [] arr) {
        int n = arr.length;
        int C, M;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        int temp;
        C = 0;
        M = 0;
        jarak = n;
        while (jarak >= 1) {
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah) {
                Sudah = false;
                for (j = 0; j < n - jarak; j++) {
                    i = j + jarak;
                    C++;
                    if (arr[j] > arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }
    }

    public static void tampil(@NotNull int data[]) {
        for (int datum : data) System.out.print(datum + " ");
        System.out.println();
    }
}

class ShellDemo3 {
    public static void shellSort(double @NotNull [] arr) {
        int n = arr.length;
        int C, M;
        int jarak, i, j, kondisi;
        boolean Sudah = true;
        double temp;
        C = 0;
        M = 0;
        jarak = n;
        while (jarak >= 1) {
            jarak = jarak / 2;
            Sudah = true;
            while (Sudah) {
                Sudah = false;
                for (j = 0; j < n - jarak; j++) {
                    i = j + jarak;
                    C++;
                    if (arr[j] > arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }
    }

    public static void tampil(double @NotNull [] data) {
        for (double datum : data) System.out.print(datum + " ");
        System.out.println();
    }
}

class Main {

    public static void main(String[] args) {
        int[] A = new int[]{10,6,8,3,1};
        ShellDemo.tampil(A);
        ShellDemo.shellSort(A);
        ShellDemo.tampil(A);
        int[] B = new int[]{10,6,8,3,1};
        ShellDemo2.tampil(B);
        ShellDemo2.shellSort(B);
        ShellDemo2.tampil(B);
        double[] C = new double[]{10.3, 6.2, 8.4, 3.6, 1.1};
        ShellDemo3.tampil(C);
        ShellDemo3.shellSort(C);
        ShellDemo3.tampil(C);
    }
}