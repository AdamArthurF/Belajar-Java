/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri31Lingkaran2;

public class Mandiri31Lingkaran2 {
    public double jariJari;

    public static int jumlahObjek = 0;

    public Mandiri31Lingkaran2(){
        jariJari = 1.0;
        jumlahObjek++;
    }

    public Mandiri31Lingkaran2(double jariJariBaru) {
        jariJari = jariJariBaru;
        jumlahObjek++;
    }

    static int getJumlahObjek(){
        return jumlahObjek;
    }

    double Luas(){
        return jariJari * jariJari * Math.PI;
    }
}