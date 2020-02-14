/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas40DeretAritmetikaRekursif;

import java.util.*;

public class Tugas40DeretAritmetikaRekursif {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int a,b,n;

        System.out.print("Masukkan a (Suku pertama) = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan b (Beda) = ");
        b = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();

        System.out.printf("Maka jumlah suku ke-n adalah %d \n",SnAritmetika(a,b,n));
    }

    private static int UnAritmetika(int a, int b, int n) {
        int Un;
        Un = a + (n - 1) * b;
        return Un;
    }

    private static int SnAritmetika(int a, int b, int n) {
        int Sn;
        if (n == 1){
            Sn = a;
        } else {
            Sn = UnAritmetika(a,b,n) + SnAritmetika(a,b,n - 1);
        }
        return Sn;
    }
}
