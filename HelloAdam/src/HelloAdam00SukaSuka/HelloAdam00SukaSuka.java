/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam00SukaSuka;

import java.util.*;

public class HelloAdam00SukaSuka {
    protected static Scanner inputUser = new Scanner(System.in);

    public static void main(String[] MbahPutih) {
        System.out.println("Hello Adam");
        System.out.println("\n");

        System.out.println("=====================================");
        System.out.println("====== MASUKKAN IDENTITAS ANDA ======");
        System.out.println("=====================================");

        String nama;
        String jenisKelamin;

        System.out.print("Nama : ");
        nama = inputUser.next();
        System.out.print("Umur : ");
        int umur = inputUser.nextInt();
        System.out.print("Jenis Kelamin : ");
        jenisKelamin = inputUser.next();
        System.out.print("Tinggi Badan : ");
        double tinggi = inputUser.nextDouble();

        System.out.println("Selamat datang " + nama);
        System.out.println("Umur kamu adalah " + umur + " tahun");
        System.out.println("Jenis kelamin " + jenisKelamin);
        System.out.println("Tinggi badan kamu " + tinggi + " centimeter");
    }
}