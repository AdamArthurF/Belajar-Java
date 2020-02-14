/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas41DeretGeometriRekursif;

import java.util.*;

public class Tugas41DeretGeometriRekursif {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int a,r,n;

        System.out.print("Masukkan a (Suku pertama) = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan r (Rasio) = ");
        r = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();

        System.out.printf("Maka jumlah n suku pertama adalah %.1f \n",SnGeometri(a,r,n));
//        System.out.println("Maka jumlah n suku pertama adalah " + SnGeometri(a,r,n));
    }

    private static double UnGeometri(double a,double r,double n){
        double Un;
        Un = a * Math.pow(r,n - 1);
        return Un;
    }

    private static double SnGeometri(double a, double r, double n) {
        double Sn;
        if (n == 1) {
            Sn = a;
        } else {
            Sn = UnGeometri(a,r,n) + SnGeometri(a,r,n - 1);
        }

        return Sn;
    }
}
