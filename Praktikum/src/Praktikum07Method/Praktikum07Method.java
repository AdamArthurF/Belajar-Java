/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum07Method;

import java.util.*;

public class Praktikum07Method {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int a,b,c,d,e,umur;
        String nama;

        garis();     // Memanggil method

        System.out.print("Nama = ");
        nama = inputUser.nextLine();
        System.out.print("Umur = ");
        umur = inputUser.nextInt();
        cetakNama(nama,umur);


        garis();
        System.out.print("Masukkan nilai a = ");
            a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai b = ");
            b = inputUser.nextInt(); inputUser.nextLine();
        jumlah2AngkaA(a,b);

        garis();
        System.out.print("Masukkan nilai c = ");
            c = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai d = ");
            d = inputUser.nextInt(); inputUser.nextLine();
        System.out.println(c + " + " + d + " = " + jumlah2AngkaB(c,d));

        garis();
        System.out.print("Masukkan nilai e = ");
            e = inputUser.nextInt(); inputUser.nextLine();
        System.out.println("Nilai e = " + tambahSatu(e));

        garis();
        int[] f = new int[2];
        System.out.print("Masukkan nilai f[0] = ");
        f[0] = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai f[1] = ");
        f[1] = inputUser.nextInt(); inputUser.nextLine();
        tukar(f);
        System.out.println("Nilai f[0] = " + f[0]);
        System.out.println("Nilai f[1] = " + f[1]);

        garis();
        int n;
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("n! = " + faktorial(n));
    }

    // Method tanpa parameter dan tanpa return
    public static void garis(){
        System.out.println("=================================");
    }

    // Method dengan parameter dan tanpa return
    public static void cetakNama(String nama,int usia){
        System.out.println("Nama saya = " + nama);
        System.out.println("Usia saya = " + usia);
    }
    public static void jumlah2AngkaA(int x,int y){
        int z = x + y;
        System.out.println(x + " + " + y + " = " + z);
    }

    // Method dengan parameter dan dengan return
    public static int jumlah2AngkaB(int x,int y){
        int z = x + y;
        return z;
    }

    // Parameter by value (parameter primitif)
    public static int tambahSatu(int x){
        x++;
        return x;
    }

    // Parameter by reference (parameter non primitif)
    public static void tukar(int[] x){
        int temporary;
        temporary = x[0];
        x[0] = x[1];
        x[1] = temporary;
    }

    public static int pangkat(int a, int b) {
        int hasil = 1;
        for (int i = 1;i <= b;i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public static void pangkatArray(int[] a,int b) {
        for (int i = 0;i < a.length;i++) {
            a[i] = pangkat(a[i], b);
        }
    }

    // Method dengan rekursif
    public static int faktorial(int x){
        int hasil;
        if (x == 1){
            hasil = 1;
        } else {
            hasil = x * faktorial(x - 1);
        }
        return hasil;
    }
}
