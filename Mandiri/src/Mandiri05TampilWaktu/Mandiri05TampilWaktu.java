/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri05TampilWaktu;

public class Mandiri05TampilWaktu {

    public static void main(String[] MbahPutih) {
        long totalMilliDetik,totalDetik,detikSekarang,totalMenit,menitSekarang,totalJam,jamsekarang,jamWIB;

        totalMilliDetik = System.currentTimeMillis();
        totalDetik = totalMilliDetik / 1000;
        detikSekarang = (int) (totalDetik % 60);
        totalMenit = totalDetik / 60;
        menitSekarang = totalMenit % 60;
        totalJam = totalMenit / 60;
        jamsekarang = totalJam % 24;
        jamWIB = (jamsekarang + 7) % 24;

        System.out.printf("Waktu sekarang adalah %d:%d:%d GMT \n",jamsekarang,menitSekarang,detikSekarang);
        System.out.printf("Waktu sekarang adalah %d:%d:%d WIB \n",jamWIB,menitSekarang,detikSekarang);
    }
}
