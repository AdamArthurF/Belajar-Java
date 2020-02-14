/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum02Dasar;

public class Praktikum02Dasar{

    public static void main(String[] MbahPutih) {

        System.out.println("Hello World");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
        System.out.println("\n");

        String nama = "Adam Arthur Faizal";
        int umur,tahunlahir;
            tahunlahir = 2002;
            umur = 2019 - tahunlahir;
        double IPK = 4.00;
        char kelas = 'A';
        boolean aktif = true;

        System.out.println("Nama saya " + nama);
        System.out.println("Tahun lahir " + tahunlahir);
        System.out.println("Umur saya " + umur + " tahun");
        System.out.println("IPK = " + IPK);
        System.out.println("Kelas Ti " + kelas);
        System.out.println("Status keaktifan = " + aktif);
        System.out.println("2 tahun lagi umur saya " + (umur + 2) + "tahun");

        int tigaTahunLalu;
        tigaTahunLalu = umur - 3;
        System.out.println("3 tahun yang lalu umur saya " + tigaTahunLalu + " tahun");



    }
}
