/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri09TahunKabisat;

import java.util.*;

public class Mandiri09TahunKabisat {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int tahun;
        boolean status;

        System.out.print("Masukkan suatu tahun = ");
        tahun = inputUser.nextInt(); inputUser.nextLine();

        status = (((tahun % 4 == 0) && (tahun % 100 != 0)) || (tahun % 400 == 0));

        System.out.printf("%d apakah tahun kabisat? %b",tahun,status);
    }
}
