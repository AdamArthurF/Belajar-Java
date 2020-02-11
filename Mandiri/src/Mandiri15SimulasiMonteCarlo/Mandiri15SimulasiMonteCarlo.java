/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
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