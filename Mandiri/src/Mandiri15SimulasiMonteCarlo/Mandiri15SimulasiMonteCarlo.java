/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri15SimulasiMonteCarlo;

public class Mandiri15SimulasiMonteCarlo {

    public static void main(String[] MbahPutih) {
        int jumlahJatuh;
        double Pi,x,y;
        final int JUMLAH_PERCOBAAN = 10000000;
        jumlahJatuh = 0;

        for (int i = 0;i < JUMLAH_PERCOBAAN;i++) {
            x = Math.random() * 2.0 - 1;
            y = Math.random() * 2.0 - 1;
            if ((x * x) + (y * y) <= 1) {
                jumlahJatuh++;
            }
        }

        Pi = 4.0 * jumlahJatuh / JUMLAH_PERCOBAAN;
        System.out.printf("Nilai PI adalah %f \n",Pi);
    }
}