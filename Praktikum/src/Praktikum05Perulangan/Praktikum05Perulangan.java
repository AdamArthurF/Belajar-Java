/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum05Perulangan;

import java.util.*;

public class Praktikum05Perulangan {

    public static void main(String[] MbahPutih) {

        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int i,j,k,l,m,n,total;

        // Perulangan For loop
        for (i = 0;i <= 2;i++){
            System.out.println("Hello World"); //Hello World sebanyak 3 kali
        }
        System.out.println("\n");
        System.out.print("Berapa banyak perulangan yang dibutuhkan? ");
        n = inputUser.nextInt(); inputUser.nextLine();
        for (i = 1;i <= n;i++){
            System.out.println("Hello World ke-" + i);
        }
        System.out.println("\n");
        System.out.println("Sekarang ayo kita hitung mundur");
        for (i = n;i >= 1;i--){
            System.out.println("Hello World ke-" + i);
        }
        System.out.println("\n===== MENCETAK ANGKA GENAP 1-100 ======");
        for (i = 2;i <= 100;i+=2){
            System.out.println(i); // Mencetak angka genap dari 1-100
        }
        System.out.println("\n====== MENCETAK DERET GENAP 1-100 ======");
        for (i = 2;i <= 100;i+=2){
            System.out.print(i + ", "); // Mencetak deret genap dari 1-100
        }
        System.out.println("\n====== MENCETAK ANGKA GANJIL 1-100 ======");
        for (i = 1;i <= 100;i+=2){
            System.out.println(i); // Mencetak angka ganjil dari 1-100
        }
        System.out.println("\n====== MENCETAK DERET GANJIL 1-100 ======");
        for (i = 1;i <= 99;i+=2) {
            System.out.print(i + ", "); // Mencetak deret ganjil dari 1-100
        }

        System.out.println("\n====== CARA LAIN UNTUK MENCETAK DERET GENAP ======");
        for (i =1;i <= 100;i++){
            if (i % 2 == 0){
                System.out.print(i + ", "); // Cara lain untuk mencetak deret genap
            }
        }

        System.out.println("\n======= CARA LAIN UNTUK MENCETAK DERET GANJIL ======");
        for (i = 1;i <= 100;i++){
            if (i % 2 == 1){
                System.out.print(i + ", "); // Cara lain untuk mencetak deret ganjil
            }
        }

        total = 0;
        System.out.println("\n====== JUMLAH N BILANGAN ASLI GENAP PERTAMA ======= ");
        for (i = 0;i <= 100;i++){
            if (i % 2 == 0){
                System.out.print(i + ", ");
                total = total + i;
                System.out.println("Total angka genap = " + total);
            }
        }

        total = 0;
        System.out.println("\n====== JUMLAH N BILANGAN ASLI GANJIL PERTAMA ======= ");
        for (i = 0;i <= 100;i++){
            if (i % 2 == 1){
                System.out.print(i + ", ");
                total = total + i;
                System.out.println("Total angka ganjil = " + total);
            }
        }

        total = 0;
        System.out.println("\n====== MENGINPUT DAN MENCETAK N DATA ======= ");
        System.out.print("Berapa data yang ingin kamu cetak? ");
        m = inputUser.nextInt();
        for (i = 0;i <= m;i++){
            total = total + i;
                System.out.print(i + ", ");
                System.out.println("Total angka = " + total);
        }

        // Perulangan While loop
        System.out.println("\n");
        System.out.print("Berapa banyak perulangan yang dibutuhkan? ");
        j = inputUser.nextInt();
        i = 1;
        while (i <= j){
            System.out.println("Hello World ke-" + i);
            i++;
        }

        System.out.println("\n====== CETAK STRING ======"); // Mencetak String sampai konfirmasi berhenti cetak
        i = 1;
        char konfirmasi;
        konfirmasi = 'Y';
        while (konfirmasi == 'Y'){
            System.out.println("Hello World ke-" + i);
            i++;
            System.out.print("Cetak lagi? (Y/N) ");
            konfirmasi = inputUser.next().charAt(0);inputUser.nextLine();
        }

        System.out.println("\n===== CETAK STRING 2 ======");
        i = 1;
        do {
            System.out.println("Hello World ke-" + i);
            i++;
            System.out.print("Cetak lagi? (Y/N) ");
            konfirmasi = inputUser.next().charAt(0); inputUser.nextLine();
        } while (konfirmasi == 'Y');

        System.out.print("\nBerapa nilai yang akan diinputkan? ");
        k = inputUser.nextInt(); inputUser.nextLine();
        boolean kondisi = true;
        total = 1;
        l = 0;
        while (kondisi){
            total = total + l;
            l++;
            System.out.println("Ditambah " + l + " menjadi " + total);
            if (l == k){
                kondisi = false;
            }
        }


    }
}
