/*
 * Copyright (c) 2020. Adam Arthur Faizal
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
