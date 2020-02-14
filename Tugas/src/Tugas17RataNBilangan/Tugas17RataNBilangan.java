/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas17RataNBilangan;

import java.util.*;

public class Tugas17RataNBilangan {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int n;

        System.out.print("Masukkan bilangan n = ");
        n = inputUser.nextInt(); inputUser.nextLine();

        PerulanganWhile(n);
    }

    private static void PerulanganWhile(int x){
        int total,nilaiAwal,ratarata;
        nilaiAwal = 1;
        total = 0;
        while (nilaiAwal <= x){
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
        ratarata = total/x;
        System.out.println("Maka rata-rata = " + ratarata);
    }
}
