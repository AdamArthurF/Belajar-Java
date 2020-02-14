/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam09UserInputScanner;

import java.util.*;

public class HelloAdam09UserInputScanner {

    public static void main(String[] MbahPutih) {
        Scanner inputUser = new Scanner(System.in);
        int panjang, lebar, tinggi, luas, volume;
        // Membuat perhitungan luas bangun datar
        // Membuat perhitungan volume bangun ruang
        // Luas = panjang * lebar
        // Volume = panjang * lebar * tinggi

        System.out.println("====== MENGHITUNG LUAS BANGUN DATAR ======");
        System.out.print("Panjang = ");
        panjang = inputUser.nextInt();
        System.out.print("Lebar = ");
        lebar = inputUser.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("====== MENGHITUNG VOLUME BANGUN RUANG ======");
        System.out.print("Tinggi = ");
        tinggi = inputUser.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume = " + volume);
    }
}