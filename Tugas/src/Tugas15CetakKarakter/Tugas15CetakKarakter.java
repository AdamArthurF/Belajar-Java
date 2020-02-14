/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas15CetakKarakter;

import java.util.*;

public class Tugas15CetakKarakter {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        //Mencetak karakter menggunakan perulangan while
        PerulanganWhile();
    }

    private static void PerulanganWhile() {
        char karakter;
        boolean kondisi;
        kondisi = true;
        while (kondisi) {
            System.out.print("Masukkan karakter kamu = ");
            karakter = inputUser.next().charAt(0);
            inputUser.nextLine();
            System.out.println("Karakter yang tercetak adalah " + karakter);

            if (karakter == 'x' || karakter == 'X') {
                kondisi = false;
                System.out.println("Program selesai");
            }
        }
    }
}