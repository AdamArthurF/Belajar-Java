/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri33Lingkaran3;

public class Mandiri33Lingkaran3 {

    private double jariJari = 1;

    private static int jumlahObjek = 0;

    public Mandiri33Lingkaran3() {
        jumlahObjek++;
    }

    public Mandiri33Lingkaran3(double jariJariBaru) {
        jariJari = jariJariBaru;
    }

    public double getJariJari(){
        return jariJari;
    }

    public void tetapkanJari(double jariJariBaru) {
        jariJari = (jariJariBaru >= 0) ? jariJariBaru : 0;
    }

    public static int jumlahObjek() {
        return jumlahObjek;
    }

    public double Luas() {
        return jariJari * jariJari * Math.PI;
    }
}