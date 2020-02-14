/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri25NilaiUjian;

import java.util.*;

public class Mandiri25NilaiUjian {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        char masukkan;
        int baris = 5,kolom = 5;
        char[][] jawaban = new char [baris][kolom];
        char[] kunci = {'A','B','C','D','E'};

        for (int i = 0;i < jawaban.length;i++){
            for (int j = 0; j < jawaban[0].length; j++) {
                System.out.printf("Masukkan jawaban siswa ke %d, nomor %d = ",(i + 1),(j + 1));
                jawaban[i][j] = inputUser.next().charAt(0); inputUser.nextLine();
            }
        }

        printArray(jawaban);

        for (int i = 0;i < jawaban.length;i++) {
            int jumlahBenar = 0;
            for (int j = 0;j < jawaban[i].length;j++) {
                if (jawaban[i][j] == kunci[j]){
                    jumlahBenar++;
                }
            }
            System.out.printf("Jawaban siswa %d memiliki jawaban benar sebanyak %d \n",(i + 1),jumlahBenar);
        }
    }

    private static void printArray(char[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        System.out.print("\n");
        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);

                if (j < (kolom - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}