/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri12LoopQuiz;

import java.util.*;

public class Mandiri12LoopQuiz {
    protected static Scanner inputUser = new Scanner (System.in);
    public static void main(String[] MbahPutih) {
        final int JUMLAH_PERTANYAAN = 3;
        int hitung,hitungBenar,angka1,angka2,temp,jawab;
        long waktuMulai,waktuUji,waktuAkhir;
        hitung = 0;
        hitungBenar = 0;
        waktuMulai = System.currentTimeMillis();

        while (hitung < JUMLAH_PERTANYAAN) {
            angka1 = (int) (Math.random() * 10);
            angka2 = (int) (Math.random() * 10);

            System.out.printf("Berapakah %d + %d ? ", angka1, angka2);
            jawab = inputUser.nextInt();
            inputUser.nextLine();

            if (angka1 + angka2 == jawab) {
                System.out.println("Kamu benar!");
                hitungBenar++;
            } else {
                System.out.printf("Jawaban kamu salah, seharusnya %d + %d = %d \n", angka1, angka2, (angka1 + angka2));
            }

            angka1 = (int) (Math.random() * 10);
            angka2 = (int) (Math.random() * 10);
            if (angka1 < angka2) {
                temp = angka1;
                angka1 = angka2;
                angka2 = temp;
            }

            System.out.printf("Berapakah %d - %d ? ", angka1, angka2);
            jawab = inputUser.nextInt();
            inputUser.nextLine();
            if (angka1 - angka2 == jawab) {
                System.out.println("Kamu benar!");
                hitungBenar++;
            } else {
                System.out.printf("Jawaban kamu salah, seharusnya %d - %d = %d \n", angka1, angka2, (angka1 - angka2));
            }

            hitung++;
        }

        waktuAkhir = System.currentTimeMillis();
        waktuUji = waktuAkhir - waktuMulai;

        System.out.printf("Jumlah yang benar adalah %d \n",hitungBenar);
        System.out.printf("Waktu uji adalah %d detik \n",(waktuUji / 1000));
    }
}