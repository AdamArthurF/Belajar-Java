/*
 * Copyright (c) 2020. Adam Arthur Faizal
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