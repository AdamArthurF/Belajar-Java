/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas07MenentukanBilangan;

import java.util.*;

public class Tugas07MenentukanBilangan {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int nilai;
        String hasil;
        System.out.print("Masukkan nilai = ");
        nilai = inputUser.nextInt();
        if (nilai == 0){
            hasil = "Ini adalah bilangan Nol";
            System.out.println(hasil);
        } else if (nilai > 0){
            hasil = "Ini adalah bilangan positif";
            System.out.println(hasil);
        } else{
            hasil = "Ini adalah bilangan negatif";
            System.out.println(hasil);
        }
    }
}