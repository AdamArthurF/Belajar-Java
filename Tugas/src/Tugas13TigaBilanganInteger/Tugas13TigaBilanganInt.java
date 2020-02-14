/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas13TigaBilanganInteger;

import java.util.*;

public class Tugas13TigaBilanganInt {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int a,b,c;
        System.out.print("Masukkan nilai pertama = ");
        a = inputUser.nextInt();
        System.out.print("Masukkan nilai kedua = ");
        b = inputUser.nextInt();
        System.out.print("Masukkan nilai ketiga = ");
        c = inputUser.nextInt();
        if ((a >= b) && (a >= c)){
            System.out.println("\nMaka nilai terbesar adalah = " + a);
        } else if ((b >= a) && (b >= c)){
            System.out.println("\nMaka nilai terbesar adalah = " + b);
        } else {
            System.out.println("\nMaka nilai terbesar adalah = " + c);
        }
    }
}