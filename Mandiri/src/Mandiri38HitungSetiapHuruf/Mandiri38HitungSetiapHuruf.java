/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri38HitungSetiapHuruf;

import java.util.*;

public class Mandiri38HitungSetiapHuruf {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        String s;

        System.out.print("Masukkan suatu string = ");
        s = inputUser.nextLine();

        int[] hitung = hitungHuruf(s.toLowerCase());

        for (int i = 0; i < hitung.length; i++) {
            if (hitung[i] != 0) {
                System.out.println((char)('a' + i) + " muncul " + hitung[i] + " kali");
            }
        }
    }

    private static int[] hitungHuruf(String s){
        int[] hitung = new int[26];

        for (int i = 0;i < s.length();i++) {
            hitung[s.charAt(i) - 'a']++;
        }
        return hitung;
    }
}