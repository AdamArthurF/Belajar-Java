/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Tugas32Matrix;

import java.util.*;

public class Tugas32Matrix {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int[][] matriks0 = new int[3][3];
        PrintArray("Matriks 0 = ",matriks0);

        int[][] MatriksA = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}
        };
        PrintArray("Matriks A = ", MatriksA);

        int[][] MatriksB = {
                {1, 0, 0},
                {0, 1, 0},
                {0,0, 1}
        };
        PrintArray("Matriks B = ", MatriksB);

        int[][] MatriksC = {
                {1, 2},
                {3, 4}
        };
        PrintArray("Matriks C = ", MatriksC);

        int[][] MatriksD = {
                {5, 6},
                {7, 8}
        };
        PrintArray("Matriks D = ", MatriksD);

        // Penjumlahan Matriks
        int[][] HasilTambah = Penjumlahan(MatriksA, MatriksB);
        PrintArray("Hasil Penjumlahan = ", HasilTambah);

        // Perkalian Matriks
        int[][] HasilKali = Perkalian(MatriksA, MatriksB);
        PrintArray("Hasil Perkalian = ", HasilKali);

    }

    private static int[][] Penjumlahan(int[][] Matriks1, int[][] Matriks2) { // Penjumlahan Matriks
        int baris1 = Matriks1.length;
        int kolom1 = Matriks1[0].length;

        int baris2 = Matriks2.length;
        int kolom2 = Matriks2[0].length;

        int[][] hasil = new int[baris1][kolom1];

        if ((baris1 == baris2) && (kolom1 == kolom2)) {
            for (int i = 0; i < baris1; i++) {
                for (int j = 0; j < kolom1; j++) {
                    hasil[i][j] = Matriks1[i][j] + Matriks2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah baris atau kolom tidak sama");
        }
        return hasil;
    }

    private static int[][] Perkalian(int[][] Matriks1, int[][] Matriks2) {
        int baris1 = Matriks1.length;
        int kolom1 = Matriks1[0].length;

        int baris2 = Matriks2.length;
        int kolom2 = Matriks2[0].length;

        // Jika a * b maka jumlah baris akan mengikuti matriks a, dan jumlah kolom akan mengikuti kolom b

        int[][] hasil = new int[baris1][kolom2];
        int buffer;

        for (int i = 0; i < baris1; i++) {
            for (int j = 0; j < kolom2; j++) {
                buffer = 0;
                for (int k = 0; k < kolom1; k++) {
                    buffer += Matriks1[i][k] * Matriks2[k][j];
                }
                hasil[i][j] = buffer;
            }
        }
        return hasil;
    }

    private static void PrintArray(String n, int[][] dataArray) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        System.out.println(n);
        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);

                if (j < (kolom - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}