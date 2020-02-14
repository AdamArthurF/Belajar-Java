/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas12MengurutkanData;

import java.util.*;

public class Tugas12MengurutkanData {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int a,b;
        System.out.print("Masukkan nilai pertama = ");
        a = inputUser.nextInt();
        System.out.print("Masukkan nilai kedua = ");
        b = inputUser.nextInt();
        if (a > b){
            System.out.println(b);
            System.out.println(a);
        } else if (b > a){
            System.out.println(a);
            System.out.println(b);
        }
    }
}