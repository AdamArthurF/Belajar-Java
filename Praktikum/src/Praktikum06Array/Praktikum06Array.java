/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Praktikum06Array;

import java.util.*;

public class Praktikum06Array {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        String[] nama = {"MbahPutih","Adam","Arthur","Faizal","TheKing"};
        int[] nilaiAlgo = new int[5]; // --> {0,1,2,3,4}; --> {input1,input2,...}
        int[] nilaiMath = new int[5]; // --> {0,1,2,3,4}; --> {input1,input2,...}
        double[] rataIndividu = new double[5];

        try {
            for (int i = 0; i < nilaiAlgo.length; i++) {
                System.out.print("Masukkan nilai Algoritma " + nama[i] + " = ");
                nilaiAlgo[i] = inputUser.nextInt();
                inputUser.nextLine();
            }
        } catch (Exception ex) {
            System.out.println("Error su");
        }

        System.out.println("\n");

        for (int i = 0;i < nilaiMath.length;i++){
            System.out.print("Masukkan nilai Matematika " + nama[i] + " = ");
            nilaiMath[i] = inputUser.nextInt(); inputUser.nextLine();
        }

        // Proses hitung
        double jumlahAlgo = 0,rataAlgo;
        for (int i = 0;i < nilaiAlgo.length;i++){
            jumlahAlgo = jumlahAlgo + nilaiAlgo[i];
        }
        rataAlgo = jumlahAlgo / 5;

        double jumlahMath = 0,rataMath;
        for (int i = 0;i < nilaiMath.length;i++){
            jumlahMath = jumlahMath + nilaiMath[i];
        }
        rataMath = jumlahMath / 5;

        for (int i = 0; i < nama.length;i++){
            rataIndividu[i] = (nilaiAlgo[i] + nilaiMath[i]) / 2;
        }
        // Cetak data
        System.out.println("\n");
        for (int i = 0;i < nama.length;i++){
            System.out.println("Nama siswa ke-" + (i + 1) + " = " + nama[i]);
        }
        System.out.println("\n");
        for (int i = 0;i < nilaiAlgo.length;i++){
            System.out.println("Nilai Algoritma " + nama[i] + " = " + nilaiAlgo[i]);
        }
        System.out.println("Rata-rata nilai Algoritma = " + rataAlgo);
        System.out.println("\n");
        for (int i = 0;i < nilaiMath.length;i++){
            System.out.println("Nilai Matematika " + nama[i] + " = " + nilaiMath[i]);
        }
        System.out.println("Rata-rata nilai Matematika = " + rataMath);

        System.out.print("\n");
        for (int i = 0;i < nama.length;i++){
            System.out.printf("Rata rata individu %s adalah %f \n",nama[i],rataIndividu[i]);
        }
        // Matrix 2 Dimensi
        System.out.println("\n");
        int max = 3,i,j;

        int[][] A = new int [max][max];
        int[][] B = new int [max][max];
        System.out.println("Masukkan Matrix A = ");

        for (i = 1;i < max;i++){
            for (j = 1;j < max;j++){
                System.out.print("A[" + i + "] [" + j + "] = ");
                A[i][j] = inputUser.nextInt(); inputUser.nextLine();
            }
        }

        System.out.println("\n");
        System.out.println("Matrix A = ");
        for (i = 1;i < max;i++){
            System.out.print("[");
            for (j = 1;j < max;j++){
                System.out.print(A[i][j]);
                if (j < (max - 1)){
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
    }
}
