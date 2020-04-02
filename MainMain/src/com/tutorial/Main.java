/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package com.tutorial;

public abstract class Main {
    public String nama;
    public String nim;  
    public Integer umur;
    public Float energi;
    public Double skill;

    public Main(String nama, String nim, Integer umur, Float energi){

    }

    public void makan(Integer porsi) {

    }

    public void belajar(Double jam) {

    }

    public void bermain(Integer jam) {

    }

    public void tidur(Integer jam) {

    }
}

class Mahasiswa extends Main {

    public Mahasiswa(String nama, String nim, Integer umur, Float energi) {
        super(nama, nim, umur, energi);

    }

    public static void main(String[] args) {

    }
}
