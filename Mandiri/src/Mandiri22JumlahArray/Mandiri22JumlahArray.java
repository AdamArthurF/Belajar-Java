/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri22JumlahArray;

import java.util.*;

public class Mandiri22JumlahArray {

    public static void main(String[] MbahPutih) {
        int[] Angka = {2, 1, 3, 5, 4, 4, 4, 2};
        System.out.println(Arrays.toString(Angka));

        Arrays.sort(Angka);
        System.out.println(Arrays.toString(Angka));

        System.out.print("\n");
        int indeks_i = 0, indeks_j, jumlah;
        for (int elemen1 : Angka) {
            System.out.println("Perulangan ke " + indeks_i);
            jumlah = 0;
            indeks_j = 0;
            if (elemen1 == Angka[indeks_i + 1]) {
                continue;
            } else if (elemen1 == (Angka.length - 1)) {
                break;
            }
            for (int elemen2: Angka) {
                if (elemen2 == Angka.length - 1) {
                    break;
                } else if (elemen1 == Angka[indeks_j + 1]) {
                    jumlah++;
                }
                indeks_j++;
            }
            indeks_i++;
            System.out.printf("Angka %d jumlahnya ada %d \n",elemen1,jumlah);
        }
    }
}