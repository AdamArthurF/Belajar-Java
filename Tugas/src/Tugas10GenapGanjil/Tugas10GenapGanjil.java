/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas10GenapGanjil;

import java.util.*;

public class Tugas10GenapGanjil {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int bilangan,hasil;
        String jenis;
        System.out.print("Masukkan bilangan kamu = ");
        bilangan = inputUser.nextInt();
        hasil = bilangan % 2;
        if (hasil == 0){
            jenis = "Bilangan genap";
        } else if (hasil == 1){
            jenis = "Bilangan ganjil";
        } else {
            jenis = "Ini adalah bilangan negatif";
        }
        System.out.println(jenis);
        System.out.println("Program selesai");
    }
}
