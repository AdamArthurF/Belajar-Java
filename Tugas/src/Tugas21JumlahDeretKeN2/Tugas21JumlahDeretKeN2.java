/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas21JumlahDeretKeN2;

import java.util.*;

public class Tugas21JumlahDeretKeN2 {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int n,total,nilaiAwal,rataRata;
        boolean kondisi;
        char pilih;
        kondisi = true;
        total = 0;
        nilaiAwal = 0;
        while (kondisi){
            System.out.print("Masukkan nilai n = ");
            n = inputUser.nextInt(); inputUser.nextLine();
            total = total + n;
            System.out.println("Total = " + total);
            nilaiAwal++;
            rataRata = total / nilaiAwal;
            System.out.println("Rata-rata " + rataRata);
            System.out.print("Mau input lagi? (Y/N) ");
            pilih = inputUser.next().charAt(0); inputUser.nextLine();
            if (pilih == 'N' || pilih == 'n'){
                kondisi = false;
                System.out.println("Program selesai");
            }
        }
    }
}
