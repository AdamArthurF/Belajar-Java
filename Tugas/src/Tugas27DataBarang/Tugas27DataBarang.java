/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas27DataBarang;

import java.util.*;

public class Tugas27DataBarang {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int i,pilih;

        String[] kodeBarang = {"A001","A002","A003","A004","A005","A006"};
        String[] namaBarang = {"Monitor","Keyboard","Mouse","RAM","ROM","CPU"};
        int[] hargaBarang = {1000000,500000,250000,1000000,1000000,1000000};
        int[] stokBarang = {12,14,11,10,15,13};

        System.out.println("=========================");
        System.out.println("====== DATA BARANG ======");
        System.out.println("=========================");
        PrintArayString("Daftar Kode Barang = ",kodeBarang);
        PrintArayString("Daftar Nama Barang = ",namaBarang);
        PrintArrayInt("Daftar Harga Barang = ",hargaBarang);
        PrintArrayInt("Daftar Stok yang tersedia = ",stokBarang);

        System.out.println("\n|||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|| NO || KODE || NAMA ||   HARGA   ||  STOK  ||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
        for (i = 0;i <= 5;i++) {
            System.out.printf("   %s -> %s -> %s -> Rp%d, tersedia %d \n",(i+1),kodeBarang[i],namaBarang[i],hargaBarang[i],stokBarang[i]);
        }

        System.out.print("Masukkan pilihan barang kamu = ");
        pilih = inputUser.nextInt(); inputUser.nextLine();
        switch (pilih){
            case 1 :
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d, sedangkan stok yang tersedia adalah %d \n",namaBarang[0],kodeBarang[0],hargaBarang[0],stokBarang[0]);
                break;
            case 2 :
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d, sedangkan stok yang tersedia adalah %d \n",namaBarang[1],kodeBarang[1],hargaBarang[1],stokBarang[1]);
                break;
            case 3 :
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d, sedangkan stok yang tersedia adalah %d \n",namaBarang[2],kodeBarang[2],hargaBarang[2],stokBarang[2]);
                break;
            case 4 :
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d, sedangkan stok yang tersedia adalah %d \n",namaBarang[3],kodeBarang[3],hargaBarang[3],stokBarang[3]);
                break;
            case 5 :
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d, sedangkan stok yang tersedia adalah %d \n",namaBarang[4],kodeBarang[4],hargaBarang[4],stokBarang[4]);
                break;
            case 6 :
                System.out.printf("Barang yang kamu pilih adalah %s (%s) seharga Rp%d, sedangkan stok yang tersedia adalah %d \n",namaBarang[5],kodeBarang[5],hargaBarang[5],stokBarang[5]);
                break;
        }
    }

    private static void PrintArayString(String n,String[] ArrayString){
        System.out.println(n + Arrays.toString(ArrayString));
    }

    private static void PrintArrayInt(String n,int[] ArrayAngka){
        System.out.println(n + Arrays.toString(ArrayAngka));
    }
}