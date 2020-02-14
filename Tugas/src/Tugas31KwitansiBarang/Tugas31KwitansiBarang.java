/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas31KwitansiBarang;

import java.util.*;

public class

Tugas31KwitansiBarang {
    protected static Scanner inputUser = new Scanner (System.in);
    public static void main(String[] MbahPutih) {
        boolean kondisi;
        int i, pilih, total, harga;
        char pilih2;
        kondisi = true;
        total = 0;

        String[] kodeBarang = {"A001", "A002", "A003", "A004", "A005", "A006"};
        String[] namaBarang = {"Monitor", "Keyboard", "Mouse", "RAM", "ROM", "CPU"};
        int[] hargaBarang = {1000000, 500000, 250000, 1000000, 1000000, 1000000};

        System.out.println("=========================");
        System.out.println("====== DATA BARANG ======");
        System.out.println("=========================");

        PrintArrayString("Daftar Kode Barang = ", kodeBarang);
        PrintArrayString("Daftar Nama Barang = ", namaBarang);
        PrintArrayInt("Daftar Harga Barang = ", hargaBarang);

        System.out.println("\n|||||||||||||||||||||||||||||||||||||");
        System.out.println("|| NO || KODE || NAMA ||   HARGA   ||");
        System.out.println("|||||||||||||||||||||||||||||||||||||");
        for (i = 0; i < namaBarang.length; i++) {
            System.out.printf("   %s || %s || %s || Rp%d \n", (i + 1), kodeBarang[i], namaBarang[i], hargaBarang[i]);
        }

        while (kondisi) {
            System.out.print("\nMasukkan pilihan barang kamu = ");
            pilih = inputUser.nextInt();
            inputUser.nextLine();
            if (pilih == 1) {
                harga = 1000000;
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d \n", namaBarang[0], kodeBarang[0], hargaBarang[0]);
            } else if (pilih == 2) {
                harga = 500000;
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d \n", namaBarang[1], kodeBarang[1], hargaBarang[1]);
            } else if (pilih == 3) {
                harga = 250000;
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d \n", namaBarang[2], kodeBarang[2], hargaBarang[2]);
            } else if (pilih == 4) {
                harga = 1000000;
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d \n", namaBarang[3], kodeBarang[3], hargaBarang[3]);
            } else if (pilih == 5) {
                harga = 1000000;
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d \n", namaBarang[4], kodeBarang[4], hargaBarang[4]);
            } else if (pilih == 6) {
                harga = 1000000;
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d \n", namaBarang[5], kodeBarang[5], hargaBarang[5]);
            } else {
                harga = 0;
            }
            total = total + harga;
            System.out.print("Mau beli lagi? (Y/N) ");
            pilih2 = inputUser.next().charAt(0);
            inputUser.nextLine();
            switch (pilih2) {
                case 'N':
                    kondisi = false;
                    System.out.printf("Total harga = Rp%d \n", total);
            }
        }
    }

    private static void PrintArrayString(String n,String[] ArrayString){
        System.out.println(Arrays.toString(ArrayString));
    }

    private static void PrintArrayInt(String n,int[] ArrayAngka){
        System.out.println(Arrays.toString(ArrayAngka));
    }
}