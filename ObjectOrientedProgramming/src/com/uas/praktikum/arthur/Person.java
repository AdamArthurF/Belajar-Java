/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package com.uas.praktikum.arthur;

import java.util.Date;

/**
 * @author (Adam Arthur Faizal)
 * @version (11 Juni 2020)
 *
 */

public class Person {
	private String namaDepan;
	private String namaTengah;
	private String namaBelakang;
	private Date tanggalLahir;
	
	public Person() {
		this.namaDepan = "Adam";
		this.namaTengah = "Arthur";
		this.namaBelakang = "Faizal";
	}
	
	public Person(String namaDepan, String namaTengah, String namaBelakang, Date tanggalLahir) {
		this.namaDepan = namaDepan;
		this.namaTengah = namaTengah;
		this.namaBelakang = namaBelakang;
		this.tanggalLahir = tanggalLahir;
	}

	/**
	 * @return the namaDepan
	 */
	public String getNamaDepan() {
		return this.namaDepan;
	}

	/**
	 * @param namaDepan the namaDepan to set
	 */
	public void setNamaDepan(String namaDepan) {
		this.namaDepan = namaDepan;
	}

	/**
	 * @return the namaTengah
	 */
	public String getNamaTengah() {
		return this.namaTengah;
	}

	/**
	 * @param namaTengah the namaTengah to set
	 */
	public void setNamaTengah(String namaTengah) {
		this.namaTengah = namaTengah;
	}

	/**
	 * @return the namaBelakang
	 */
	public String getNamaBelakang() {
		return this.namaBelakang;
	}

	/**
	 * @param namaBelakang the namaBelakang to set
	 */
	public void setNamaBelakang(String namaBelakang) {
		this.namaBelakang = namaBelakang;
	}

	/**
	 * @return the tanggalLahir
	 */
	public Date getTanggalLahir() {
		return this.tanggalLahir;
	}

	/**
	 * @param tanggalLahir the tanggalLahir to set
	 */
	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
}
