/*
 * Copyright (c) 2020. Adam Arthur Faizal
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