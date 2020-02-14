/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri24Matriks;

import java.util.*;

public class Mandiri24Matriks {

    public static void main(String[] args) {
        int i,j,m,n;

        // Matriks A
        int[][] MatriksA = {        // Matriks 3 x 3
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        PrintArray1("Matriks A = ",MatriksA);
//        PrintArray2("Matriks A = ",MatriksA);

        int barisA = MatriksA.length;
        int kolomA = MatriksA[0].length;

        for (i = 0;i < barisA;i++){
            System.out.print("[");
            for (j = 0;j < kolomA;j++) {
                if (i != barisA / 2 || j != kolomA / 2) {
                    System.out.print((MatriksA[i][j]));

                    if (j < (kolomA - 1)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("]");
                    }

                } else {
                    MatriksA[i][j] = 0;
                    for (m = 0;m < barisA;m++ ){
                        for (n = 0;n < kolomA;n++) {
                            if (m != barisA / 2 || n != kolomA / 2) {
                                MatriksA[i][j] += MatriksA[m][n];
                            }
                        }
                    }
//                  MatriksA[i][j] /= ((kolomA * barisA) - 1);

                    System.err.print(MatriksA[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        // Matriks B
        int[][] MatriksB = {
                {1,2,3,4},
                {5,6,7,8},
                {9,1,2,3},
                {4,5,6,7}
        };
        PrintArray1("Matriks B = ",MatriksB);
        int barisB = MatriksB.length;
        int kolomB = MatriksB[0].length;

        for (i = 0;i < barisB;i++){         /* Bagian 1 */
            System.out.print("[");
            for (j = 0;j < kolomB;j++){
                if (i != 1 || j != 1) {
                    System.out.print((MatriksB[i][j]));

                    if (j < (kolomB - 1)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("]");
                    }

                } else {
                    MatriksB[i][j] = 0;
                    for (m = 0;m < (barisB - 1);m++ ){
                        for (n = 0;n < (kolomB - 1);n++) {
                            if (m != 1 || n != 1) {
                                MatriksB[i][j] += MatriksB[m][n];
                            }
                        }
                    }
//                  MatriksA[i][j] /= ((kolomA * barisA) - 1);

                    System.err.print(MatriksB[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (i = 0;i < barisB;i++){         /* Bagian 2*/
            System.out.print("[");
            for (j = 0;j < kolomB;j++){
                if (i != 1 || j != 2){
                    System.out.print(MatriksB[i][j]);

                    if (j < (kolomB - 1)){
                        System.out.print(" ");
                    } else {
                        System.out.print("]");
                    }
                } else {
                    MatriksB[i][j] = 0;
                    for (m = 0;m < (barisB - 1);m++){
                        for (n = 1;n < kolomB;n++) {
                            if (m != 1|| n != 2) {
                                MatriksB[i][j] += MatriksB[m][n];
                            }
                        }
                    }

                    System.err.print(MatriksB[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (i = 0;i < barisB;i++) {        /* Bagian 3*/
            System.out.print("[");
            for (j = 0;j < kolomB;j++) {
                if  (i != 2 || j != 1){
                    System.out.print(MatriksB[i][j]);

                    if (j < (kolomB - 1)){
                        System.out.print(" ");
                    } else {
                        System.out.print("]");
                    }
                } else {
                    MatriksB[i][j] = 0;
                    for (m = 1;m < barisB;m++) {
                        for (n = 0;n < (kolomB - 1);n++){
                           if (m != 2 || n != 1) {
                               MatriksB[i][j] += MatriksB[m][n];
                           }
                        }
                    }

                    System.err.print(MatriksB[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (i = 0;i < barisB;i++) {
            System.out.print("[");
            for (j = 0;j < kolomB;j++) {
                if (i != 2 || j != 2){
                    System.out.print(MatriksB[i][j]);

                    if (j < (kolomB - 1)){
                        System.out.print(" ");
                    } else {
                        System.out.print("]");
                    }
                } else {
                    MatriksB[i][j] = 0;
                    for (m = 1;m < barisB;m++){
                        for (n = 1;n < kolomB;n++) {
                            if (m != 2 || n != 2){
                                MatriksB[i][j] += MatriksB[m][n];
                            }
                        }
                    }

                    System.err.print(MatriksB[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
    }

    private static void PrintArray1(String n,int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        System.out.println(n);
        for (int i = 0;i < baris;i++){
            System.out.print("[");
            for (int j = 0;j < kolom;j++){
                System.out.print(dataArray[i][j]);

                if (j < (kolom - 1)){
                    System.out.print(" ");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    private static void PrintArray2(String n,int[][] dataArray){
        System.out.println(n);
        for (int i = 0;i < dataArray.length;i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }
        System.out.print("\n");
    }
}