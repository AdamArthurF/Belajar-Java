/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri11TebakAngka;

import java.util.*;

public class Mandiri11TebakAngka {
    protected static Scanner inputUser = new Scanner (System.in);
    public static void main(String[] args) {
        int angka,tebak;
        boolean kondisi;
        kondisi = true;
        angka = (int) (Math.random() * 101);

        while (kondisi) {
            System.out.print("Tebak suatu angka dari 0 sampai dengan 100 = ");
            tebak = inputUser.nextInt();
            inputUser.nextLine();
            if (tebak == angka) {
                System.out.printf("Wah, kamu bener, angka magic nya adalah %d \n", angka);
                kondisi = false;
            } else if (tebak > angka) {
                System.out.println("Hmm tebakan kamu terlalu tinggi!");
            } else {
                System.out.println("Hmm tebakan kamu terlalu rendah");
            }
        }
    }
}