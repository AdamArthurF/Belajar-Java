/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri20AngkaLotto;

import java.util.*;

public class Mandiri20AngkaLotto {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int angka;
        boolean semuaDirangkum;
        boolean[] apaDirangkum = new boolean[99];

        angka = inputUser.nextInt(); inputUser.nextLine();
        while (angka != 0) {
            apaDirangkum[angka - 1] = true;
            angka = inputUser.nextInt(); inputUser.nextLine();
        }

        semuaDirangkum = true;
        for (int i = 0;i < 99;i++) {
            if (!apaDirangkum[i]){
                semuaDirangkum = false;
                break;
            }
        }

        if (semuaDirangkum) {
            System.out.println("Tiket telah merangkum semua angka");
        } else {
            System.out.println("Tiket tidak merangkum semua angka");
        }
    }
}
