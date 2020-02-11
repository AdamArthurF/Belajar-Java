/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri32UjiLingkaran2;

import Mandiri31Lingkaran2.Mandiri31Lingkaran2;

public class Mandiri32UjiLingkaran2 {

    public static void main(String[] MbahPutih) {
        System.out.println("Sebelum menciptakan objek-objek");
        System.out.println("Jumlah objek lingkaran adalah " + Mandiri31Lingkaran2.jumlahObjek);

        Mandiri31Lingkaran2 lingkaran1 = new Mandiri31Lingkaran2();
        System.out.println("Setelah menciptakan lingkaran1");
        System.out.println("Lingkaran1: jari-jari (" + lingkaran1.jariJari + ") dan jumlah objek lingkaran adalah " + lingkaran1.jumlahObjek);

        Mandiri31Lingkaran2 lingkaran2 = new Mandiri31Lingkaran2();
        lingkaran1.jariJari = 100;
        System.out.println("Setelah menciptakan lingkaran2 dan memodifikasi lingkaran1");
        System.out.println("Lingkaran1: jari-jari (" + lingkaran1.jariJari + ") dan jumlah objek lingkaran adalah " + lingkaran1.jumlahObjek);
        System.out.println("Lingkaran2: jari-jari (" + lingkaran2.jariJari + ") dan jumlah objek lingkaran adalah " + lingkaran2.jumlahObjek);
    }
}
