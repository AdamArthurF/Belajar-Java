/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri39PeriksaPalindrome2;

import java.util.*;

public class Mandiri39PeriksaPalindrome2 {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        String s;

        System.out.println("Masukkan suatu string = ");
        s = inputUser.nextLine();

        System.out.println("Mengabaikan karakter alfanumerik, \napakah " + s + " suatu palindrome? " + apaPalindrom(s));
    }

    public static boolean apaPalindrom(String s){
        String s1 = filter(s);
        String s2 = balik(s1);
        return s2.equals(s1);
    }

    public static String filter(String s){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0;i < s.length();i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static String balik(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}