/*
 * Copyright (c) 2020. Adam Arthur Faizal
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
