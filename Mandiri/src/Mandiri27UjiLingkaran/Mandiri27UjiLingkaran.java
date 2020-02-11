/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri27UjiLingkaran;

public class Mandiri27UjiLingkaran {

    public static void main(String[] MbahPutih) {
        Lingkaran1 lingkaran1 = new Lingkaran1 ();
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaran1.jariJari + "cm adalah " + lingkaran1.Luas() + "cm");

        Lingkaran1 lingkaran2 = new Lingkaran1 (25);
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaran2.jariJari + "cm adalah " + lingkaran2.Luas() + "cm");

        Lingkaran1 lingkaran3 = new Lingkaran1(125);
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaran3.jariJari + "cm adalah " + lingkaran3.Luas() + "cm");

        lingkaran1.jariJari = 500;
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaran1.jariJari + "cm adalah " + lingkaran1.Luas() + "cm");
    }
}

class Lingkaran1 {
    double jariJari;
    public Lingkaran1(){
        jariJari = 1.0;
    }

    public Lingkaran1(double radiusBaru) {
        jariJari = radiusBaru;
    }

    double Luas(){
        return jariJari * jariJari * Math.PI;
    }
}