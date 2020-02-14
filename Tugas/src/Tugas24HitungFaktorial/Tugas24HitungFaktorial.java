/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas24HitungFaktorial;

import java.util.*;

public class Tugas24HitungFaktorial {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int m,n;

        System.err.println("====== HITUNG FAKTORIAL MENGGUNAKAN FOR ======");
        System.out.print("Masukkan nilai m = ");
        m = inputUser.nextInt(); inputUser.nextLine();
        PerulanganFor(m);

        System.err.println("\n====== HITUNG FAKTORIAL MENGGUNAKAN WHILE ======");
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();
        PerulanganWhile(n);
    }

    private static void PerulanganFor(int x){
        int i,total;
        total = 1;
        if (x > 0) {
            for (i = 1; i <= x; i++) {
                System.out.println(i);
                total = total * i;
                if (i == x) {
                    System.out.printf("Hasil dari %d! = %d \n", x, total);
                }
            }
        } else if (x <= 0){
            total = total * x;
            System.out.printf("Hasil dari %d! = %d \n",x,total);
        }
    }

    private static void PerulanganWhile(int y){
        int nilaiAwal,total;
        boolean kondisi;
        total = 1;
        nilaiAwal = 1;
        kondisi = true;

        while (nilaiAwal <= y && kondisi){
            System.out.println(nilaiAwal);
            total = total * nilaiAwal;
            if (nilaiAwal == y){
                kondisi = false;
                System.out.printf("Hasil dari %d! = %d \n",y,total);
            }
            nilaiAwal++;
        }
    }
}
