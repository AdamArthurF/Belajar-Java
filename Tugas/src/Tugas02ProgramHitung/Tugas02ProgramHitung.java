/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas02ProgramHitung;

import java.util.*;

public class Tugas02ProgramHitung {

    public static void main(String[] MbahPutih) {
        Scanner inputUser = new Scanner(System.in);
        double hargabarangA,hargabarangB,jumlahbarangA,jumlahbarangB,totalbayar;
        System.out.print("Jumlah Barang A = ");
        jumlahbarangA = inputUser.nextDouble();
        System.out.print("Jumlah Barang B = ");
        jumlahbarangB = inputUser.nextDouble();
        hargabarangA = 1000;
        hargabarangB = 2000;
        double diskonbarangA,diskonbarangB;
        diskonbarangA = jumlahbarangA * hargabarangA * 0.1;
        diskonbarangB = jumlahbarangB * hargabarangB * 0.05;
        double totalbayarA,totalbayarB;
        totalbayarA = jumlahbarangA * hargabarangA - diskonbarangA;
        totalbayarB = jumlahbarangB * hargabarangB - diskonbarangB;
        totalbayar = totalbayarA + totalbayarB;
        System.out.println("Total bayar = " + totalbayar);;
    }
}
