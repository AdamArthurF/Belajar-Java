/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri35UjiPelewatanObjek;

import Mandiri33Lingkaran3.Mandiri33Lingkaran3;

public class Mandiri35UjiPelewatanObjek {

    public static void main(String[] MbahPutih) {
        Mandiri33Lingkaran3 lingkaranKu = new Mandiri33Lingkaran3();

        int n = 5;
        Luas(lingkaranKu,n);

        System.out.println("\n" + "Jari-jari " + lingkaranKu.getJariJari());
        System.out.println("n = " + n);
    }

    public static void Luas(Mandiri33Lingkaran3 lingkaran, int kali) {
        System.out.println("Jari-jari \t\tLuas");
        while (kali >= 1) {
            System.out.println(lingkaran.getJariJari() + "\t\t" + lingkaran.Luas());
            lingkaran.tetapkanJari(lingkaran.getJariJari() + 1);
            kali--;
        }
    }
}