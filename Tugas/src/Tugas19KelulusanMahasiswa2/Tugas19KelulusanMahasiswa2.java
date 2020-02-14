/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas19KelulusanMahasiswa2;

import java.util.*;

public class Tugas19KelulusanMahasiswa2 {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan nilai kamu = ");
        nilai = inputUser.nextInt(); inputUser.nextLine();

        KonversiNilai(nilai);
    }

    private static void KonversiNilai(int x){
        String status;
        if ((x >= 80) && (x <= 100)){
            status = "Sangat Baik";
            System.out.println(status);
        } else if ((x >= 70) && (x <= 79)){
            status = "Baik";
            System.out.println(status);
        } else if ((x >= 60) && (x <= 69)){
            status = "Cukup";
            System.out.println(status);
        } else if ((x >= 50) && (x <= 59)){
            status = "Kurang";
            System.out.println(status);
        }
    }






}
