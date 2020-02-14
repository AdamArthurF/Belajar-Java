/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Tugas18TotalGaji;

import java.util.*;
import java.util.jar.JarOutputStream;

public class Tugas18TotalGaji {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        double gaji;

        System.out.println(" Pilihan golongan gaji kamu : ");
        System.out.println("1. Golongan 1");
        System.out.println("2. Golongan 2");
        System.out.println("3. Golongan 3");
        System.out.print("Masukkan pilihan = ");
        gaji = inputUser.nextInt(); inputUser.nextLine();

        Gaji(gaji);
    }

    private static void Gaji(double x){
        double totalgaji3,gajipokok3;
        if (x == 1) {
            System.out.println("Maka total gaji kamu Rp1000.000");
        } else if (x == 2){
            System.out.println("Maka total gaji kamu Rp2000.000");
        } else if (x == 3){
            gajipokok3 = 3000000 * 0.8;
            totalgaji3 = 0.98 * gajipokok3;
            System.out.println("Maka total gaji kamu Rp" + totalgaji3);
        } else {
            System.out.println("Inputan salah");
        }
    }
}