/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri34UjiLingkaran3;

import Mandiri33Lingkaran3.Mandiri33Lingkaran3;

public class Mandiri34UjiLingkaran3 {

    public static void main(String[] MbahPutih) {
        Mandiri33Lingkaran3 lingkaranku = new Mandiri33Lingkaran3();
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaranku.getJariJari() + " adalah " + lingkaranku.Luas());

        lingkaranku.tetapkanJari(lingkaranku.getJariJari() * 100);
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaranku.getJariJari() + " adalah " + lingkaranku.Luas());

        System.out.println("Jumlah objek yang diciptakan adalah " + lingkaranku.jumlahObjek());
    }
}