/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri04MenggambarSegitiga;

import java.util.*;

public class Mandiri04MenggambarSegitiga {

    public static void main(String[] MbahPutih) {
        Scanner inputUser = new Scanner(System.in);
        int i,j;

        System.out.println("====== PERSEGI ======");
        for (i = 0;i < 9;i++){
            for (j = 0;j < 9;j++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        System.out.println("====== SEGITIGA SIKU - SIKU (KIRI ATAS-BAWAH)=====");
        for (i = 0;i < 9;i++){
            for (j = 0;j < 9;j++){
                System.out.print("*  ");
                if (i + j == 8){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        for (i = 0;i < 9;i++){
            for (j = 0;j < 9;j++){
                System.out.print("*  ");
                if (i == j){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        System.out.println("====== SEGITIGA SIKU-SIKU (KANAN ATAS-BAWAH)");
        for (i = 0;i < 9;i++){
            for (j = 0;j < 9;j++){
                if (i + j < 8){
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        for (i = 0;i < 9;i++){
            for (j = 0;j < 9;j++){
                if (i - j > 0){
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        System.out.println("====== SEGITIGA ======");

//        String kalimatTanpaSpasi = kalimat.replaceAll("\\s+","");
        String kalimat = "SAYA SEDANG BELAJAR KEAMANAN KOMPUTER";
        String kalimatTanpaSpasi = kalimat.replaceAll("\\s+", "");
        String[] kata = kalimatTanpaSpasi.split("");
        System.out.println(Arrays.toString(kata));
        int indeks = 0;

//        char[][] kalimat = new char[][];
        for (i = 0;i < 7 ;i++) {
            for (j = 7;j > i;j--) {
                System.out.print(" ");
            }
            for (int k = 1;k <= (2 * i - 1);k++) {
                if (indeks == kata.length) {
                    System.out.print("X");
                    continue;
                }
                System.out.print(kata[indeks]);
                indeks++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        indeks = 0;
        for (i = 0;i < 6;i++){
            for (j = 0;j < 12;j++){
                if (i + j < 6 || j - i > 6){
                    System.out.print(" ");
                } else {
//                    System.out.print("*  ");
                    if (indeks == kata.length) {
                        System.out.print("X");
                        continue;
                    }
                    System.out.print(kata[indeks]);
                    indeks++;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (i = 0;i < 6;i++){
            for (j = 0;j < 12;j++){
                if (i + j < 6 || j - i > 6){
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}