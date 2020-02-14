/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas37Tukar2Data;

import java.util.*;

public class Tugas37Tukar2Data {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int a,b;

        System.out.print("Masukkan nilai a = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai b = ");
        b = inputUser.nextInt(); inputUser.nextLine();

        tukarData(a,b);
    }

    private static void tukarData(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Nilai a sekarang = " + a);
        System.out.println("Nilai b sekarang = " + b);
    }
}
