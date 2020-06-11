/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

/**
 * 
 */
package com.uas.praktikum.arthur;

/**
 * @author (Adam Arthur Faizal)
 * @version (11 Juni 2020)
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Mahasiswa mahasiswa = new Mahasiswa();
		Person person1 = new Person();
		Person person2 = new Mahasiswa();
		System.out.println(mahasiswa.getIpk());
		System.out.println(mahasiswa.getNim());
		System.out.println(mahasiswa.getProdi());
		System.out.println(mahasiswa.getStrata());
		System.out.println(mahasiswa.getAngkatan());
		System.out.println(person1.getNamaDepan());
		System.out.println(person1.getNamaTengah());
		System.out.println(person1.getNamaBelakang());
		System.out.println(person1.getTanggalLahir());
		System.out.println(person1.getTanggalLahir());
		System.out.println(person2.getNamaDepan());
		System.out.println(person2.getNamaTengah());
		System.out.println(person2.getNamaBelakang());
		System.out.println(person2.getTanggalLahir());
		System.out.println(person2.getTanggalLahir());
	}
}
