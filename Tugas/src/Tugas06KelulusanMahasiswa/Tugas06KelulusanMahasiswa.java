/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas06KelulusanMahasiswa;

import java.util.*;

public class Tugas06KelulusanMahasiswa {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        String nama,keterangan;
        int nilai;
        System.out.print("Nama : ");
        nama = inputUser.nextLine();
        System.out.print("Nilai : ");
        nilai = inputUser.nextInt();
        if (nilai >= 60){
            keterangan = "Kamu lulus";
            System.out.println(keterangan);
        } else{
            keterangan = "Kamu tidak lulus";
            System.out.println(keterangan);
        }
    }
}