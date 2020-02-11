/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri18GeserArray;

import java.util.*;

public class Mandiri18GeserArray {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int temp;
        int[] Angka = {2,1,3,5,4};
        System.out.println(Arrays.toString(Angka) + "\n");

//        Arrays.sort(Angka);
//        System.out.println(Arrays.toString(Angka) + "\n");

        for (int i = (Angka.length - 1); i >= 0; i--) {
            System.out.println(Arrays.toString(Angka));
            temp = Angka[Angka.length - 1];
            for (int j = Angka.length - 2;j >= 0; j--) {
                Angka[j + 1] = Angka[j];
            }
            Angka[0] = temp;
        }

        System.out.print("\n");
        for (int i = 0;i < Angka.length;i++) {
            System.out.println(Arrays.toString(Angka));
            temp = Angka[0];
            for (int j = 1; j < Angka.length; j++) {
                Angka[j - 1] = Angka[j];
            }
            Angka[Angka.length - 1] = temp;
        }
    }
}
