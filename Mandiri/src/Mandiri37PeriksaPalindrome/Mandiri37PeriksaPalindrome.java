/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri37PeriksaPalindrome;

import java.util.*;

public class Mandiri37PeriksaPalindrome {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        String kata;

        System.out.print("Masukkan suatu kata : ");
        kata = inputUser.nextLine();

        if (apaPalindrome(kata)) {
            System.out.printf("%s adalah suatu palindrom \n", kata);
        } else {
            System.out.printf("%s bukanlah suatu palindrom \n",kata);
        }
    }

    public static boolean apaPalindrome(String s) {
        int bawah = 0;
        int atas = s.length() - 1;

        while (bawah < atas) {
            if (s.charAt(bawah) != s.charAt(atas)) {
                return false;
            }
            bawah++;
            atas--;
        }
        return true;
    }
}
