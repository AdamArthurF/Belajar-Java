/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri13AngkaPrima;

import java.util.*;

public class Mandiri13AngkaPrima {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int angka,hitung;
        final int JUMLAH_PRIMA;
        final int JUMLAH_PRIMA_PER_BARIS = 10;
        boolean apaPrima;
        hitung = 0;
        angka = 2;

        System.out.print("Masukkan jumlah angka prima yang ingin ditampilkan : ");
        JUMLAH_PRIMA = inputUser.nextInt(); inputUser.nextLine();
        while (hitung < JUMLAH_PRIMA) {
            apaPrima = true;

//            for (int pembagi = 2; pembagi <= angka / 2; pembagi++) {
//                if (angka % pembagi == 0) {
//                    apaPrima = false;
//                    break;
//                }
//            }

            for (int pembagi = 2;pembagi <= angka / 2 && apaPrima;pembagi++) {
                if (angka % pembagi == 0) {
                    apaPrima = false;
                }
            }

            if (apaPrima) {
                hitung++;

                if (hitung % JUMLAH_PRIMA_PER_BARIS == 0) {
                    System.out.println(angka);
                }
            } else {
                System.out.print(angka + " ");
            }

            angka++;
        }
    }
}