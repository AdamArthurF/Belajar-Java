/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri08BangunDatar;

import java.util.*;

public class Mandiri08BangunDatar {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int pilih1;
        char pilih2;
        boolean kondisi;
        kondisi = true;

        System.out.println("====== PROGRAM BANGUN DATAR ======");
        System.out.println("1. Segitiga Sama Sisi");
        System.out.println("2. Segitiga Sama Kaki");
        System.out.println("3. Segitiga Siku-siku");
        System.out.println("4. Segitiga Sembarang");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Jajar Genjang");
        System.out.println("8. Trapesium Sama Kaki");
        System.out.println("9. Trapesium Siku Siku");
        System.out.println("10. Layang-layang");
        System.out.println("11. Lingkaran\n");

        while (kondisi) {
            System.out.print("Masukkan pilihan bangun datar kamu = ");
            pilih1 = inputUser.nextInt(); inputUser.nextLine();

            if (pilih1 == 1) {
                SegitigaSamaSisi();
            } else if (pilih1 == 2) {
                SegitigaSamaKaki();
            } else if (pilih1 == 3) {
                SegitigaSikuSiku();
            } else if (pilih1 == 4) {
                SegitigaSembarang();
            } else if (pilih1 == 5) {
                Persegi();
            } else if (pilih1 == 6) {
                PersegiPanjang();
            } else if (pilih1 == 7) {
                Jajargenjang();
            } else if (pilih1 == 8) {
                TrapesiumSamaKaki();
            } else if (pilih1 == 9) {
                TrapesiumSikuSiku();
            } else if (pilih1 == 10){
                LayangLayang();
            } else if (pilih1 == 11){
                Lingkaran();
            } else {
                System.out.println("Kamu salah input");
            }

            System.out.print("Mau input lagi engga? (Y/N) ");
            pilih2 = inputUser.next().charAt(0); inputUser.nextLine();

            if (pilih2 == 'N' || pilih2 == 'n'){
                kondisi = false;
            }
        }

        System.out.println("\nProgram utama selesai");
    }

    private static void SegitigaSamaSisi(){
        double sisi,tinggi,Luas,Keliling;

        System.out.println("------ 1. SEGITIGA SAMA SISI ------");
        System.out.print("Masukkan sisi = ");
        sisi = inputUser.nextDouble(); inputUser.nextLine();

        tinggi = Math.sqrt(Math.pow(sisi,2) - Math.pow(sisi * 0.5,2));
        Keliling = 3 * sisi;
        Luas = 0.5 * sisi * tinggi;

        System.out.printf("Keliling = %.1f \n",Keliling);
        System.out.printf("Luas = %.1f \n",Luas);
        System.out.println("Program segitiga sama sisi selesai \n");
    }

    private static void SegitigaSamaKaki(){
        double alas,tinggi,sisimiring,Keliling,Luas;

        System.out.println("------ 2. SEGITIGA SAMA KAKI ------");
        System.out.print("Masukkan alas = ");
        alas = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan tinggi = ");
        tinggi = inputUser.nextDouble(); inputUser.nextLine();

        sisimiring = Math.sqrt(Math.pow(alas * 0.5,2) + Math.pow(tinggi,2));
        Keliling = alas + (2 * sisimiring);
        Luas = 0.5 * alas * tinggi;

        System.out.printf("Keliling = %.1f \n",Keliling);
        System.out.printf("Luas = %.1f \n",Luas);
        System.out.println("Program segitiga sama kaki selesai \n");
    }

    private static void SegitigaSikuSiku(){

    }

    private static void SegitigaSembarang(){
        double a,b,c,total,Keliling,Luas;

        System.out.println("------ 4. SEGITIGA SEMBARANG ------");
        System.out.print("Masukkan sisi a = ");
        a = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan sisi b = ");
        b = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan sisi c = ");
        c = inputUser.nextDouble(); inputUser.nextLine();

        total = (a + b + c) / 2;
        Keliling = a + b + c;
        Luas = Math.sqrt((total - a) * (total - b) * (total - c));

        System.out.printf("Keliling = %.1f \n",Keliling);
        System.out.printf("Luas = %.1f \n",Luas);
        System.out.println("Program segitiga sembarang selesai \n");
    }

    private static void Persegi(){
        double sisi,Luas,Keliling;

        System.out.println("------ 5. PERSEGI ------");
        System.out.print("Masukkan sisi = ");
        sisi = inputUser.nextDouble(); inputUser.nextLine();

        Keliling = 4 * sisi;
        Luas = Math.pow(sisi,2);

        System.out.printf("Keliling = %.1f \n",Keliling);
        System.out.printf("Luas = %.1f \n",Luas);
        System.out.println("Program persegi selesai \n");
    }

    private static void PersegiPanjang(){
        double panjang,lebar,Keliling,Luas;

        System.out.println("------ 6. PERSEGI PANJANG ------");
        System.out.print("Masukkan panjang = ");
        panjang = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan lebar = ");
        lebar = inputUser.nextDouble(); inputUser.nextLine();

        Keliling = 2 * (panjang + lebar);
        Luas = panjang * lebar;

        System.out.printf("Keliling = %.1f \n",Keliling);
        System.out.printf("Luas = %.1f \n",Luas);
        System.out.println("Program persegi panjang selesai \n");

    }

    private static void Jajargenjang(){
        double sisimiring,pendek,panjang,atasbawah,tinggi,Keliling,Luas;

        System.out.println("------ 7. JAJAR GENJANG ------");
        System.out.print("Masukkan sisi pendek = ");
        pendek = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan sisi panjang = ");
        panjang = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan tinggi = ");
        tinggi = inputUser.nextDouble(); inputUser.nextLine();

        atasbawah = pendek + panjang;
        sisimiring = Math.sqrt(Math.pow(pendek,2) + Math.pow(tinggi,2));
        Keliling = 2 * (atasbawah + sisimiring);
        Luas = atasbawah * tinggi;

        System.out.printf("Keliling = %.1f \n",Keliling);
        System.out.printf("Luas = %.1f \n",Luas);
        System.out.println("Program jajar genjang selesai \n");
    }

    private static void TrapesiumSamaKaki(){
        double panjang,pendek,atas,bawah,tinggi,sisimiring,Keliling,Luas;

        System.out.println("------ 8. TRAPESIUM SAMA KAKI ------");
        System.out.print("Masukkan sisi panjang = ");
        panjang = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan sisi pendek = ");
        pendek = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan sisi atas = ");
        atas = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan tinggi = ");
        tinggi = inputUser.nextDouble(); inputUser.nextLine();

        bawah = panjang + (2 * pendek);
        sisimiring = Math.sqrt(Math.pow(pendek,2) + Math.pow(tinggi,2));
        Keliling = atas + bawah + (2 * sisimiring);
        Luas = 0.5 * (atas + bawah) * tinggi;

        System.out.printf("Keliling = %.1f \n",Keliling);
        System.out.printf("Luas = %.1f \n",Luas);
        System.out.println("Program trapesium sama kaki selesai \n");
    }

    private static void TrapesiumSikuSiku(){
        double panjang,pendek,atas,bawah,tinggi,sisimiring,Keliling,Luas;

        System.out.println("------ 9. TRAPESIUM SIKU SIKU ------");
        System.out.print("Masukkan sisi panjang = ");
        panjang = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan sisi pendek = ");
        pendek = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan sisi atas = ");
        atas = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan tinggi = ");
        tinggi = inputUser.nextDouble(); inputUser.nextLine();

        bawah = panjang + pendek;
        sisimiring = Math.sqrt(Math.pow(pendek,2) + Math.pow(tinggi,2));
        Keliling = atas + bawah + sisimiring;
        Luas = 0.5 * (atas + bawah) * tinggi;

        System.out.printf("Keliling = %.1f \n",Keliling);
        System.out.printf("Luas = %.1f \n",Luas);
        System.out.println("Program trapesium siku siku selesai \n");
    }

    private static void LayangLayang(){

    }

    private static void Lingkaran(){
        double jarijari,Keliling,Luas;

        System.out.println("------ 11. LINGKARAN ------");
        System.out.print("Masukkan jari-jari = ");
        jarijari = inputUser.nextDouble(); inputUser.nextLine();

        Keliling = 2 * Math.PI * jarijari;
        Luas = Math.PI * Math.pow(jarijari,2);

        System.out.printf("Keliling = %.1f \n",Keliling);
        System.out.printf("Luas = %.1f \n",Luas);
        System.out.println("Program lingkaran selesai \n");
    }
}