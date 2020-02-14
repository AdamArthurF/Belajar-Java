/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas08DiskonBelanja;

import java.util.*;

public class Tugas08DiskonBelanja {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        double diskon,belanja,bayar;
        System.out.print("Belanja nya habis berapa? ");
        belanja = inputUser.nextDouble();
        if (belanja >= 100000){
            diskon = 0.10;
            System.out.println("Wah kamu dapet diskon 10%");
            bayar = (belanja) - (belanja * diskon);
            System.out.println("Jadi total pembayaran = " + bayar + " rupiah" );
        } else if ((belanja >= 50000) && (belanja < 100000)){
            diskon = 0.05;
            System.out.println("Wah kamu dapet diskon 5%");
            bayar = (belanja) - (belanja * diskon);
            System.out.println("Jadi total pembayaran = " + bayar + " rupiah");
        } else {
            System.out.println("Wah kamu engga dapet diskon");
        }
    }
}