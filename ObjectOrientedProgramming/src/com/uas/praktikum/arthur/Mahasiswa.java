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

public class Mahasiswa extends Person {
	private String nim, prodi, strata;
	private double ipk;
	private int angkatan;
	private static int jumlahMatkul;

	public Mahasiswa() {
		this.nim = "M3119001";
		this.prodi = "Teknik Informatika";
		this.strata = "D3";
		this.ipk = 3.67;
		this.angkatan = 2019;
	}
	
	public Mahasiswa(String namaDepan, String namaTengah, String namaBelakang, Date tanggalLahir, String nim, String prodi, String strata, double ipk, int angkatan) {
		super(namaDepan, namaTengah, namaBelakang, tanggalLahir);
		this.nim = nim;
		this.prodi = prodi;
		this.strata = strata;
		this.ipk = ipk;
		this.angkatan = angkatan;
	}
	
	public static double hitungIPK(int jumlahMatkul, String ...ipkHuruf) {
		Mahasiswa.setJumlahMatkul(jumlahMatkul);
		double[] ipkAngka = new double [5];
		double totalIpk = 0;
		for (int i = 0; i < ipkHuruf.length; i++) {
			if (ipkHuruf[i].equals("A")) {
				ipkAngka[i] = 4;
			} else if (ipkHuruf[i].equals("A-")) {
				ipkAngka[i] = 3.7;
			} else if (ipkHuruf[i].equals("B+")) {
				ipkAngka[i] = 3.3;
			} else if (ipkHuruf[i].equals("B")) {
				ipkAngka[i] = 3;
			} else if (ipkHuruf[i].equals("B-")) {
				ipkAngka[i] = 2.7;
			} else if (ipkHuruf[i].equals("C+")) {
				ipkAngka[i] = 2.3;
			} else if (ipkHuruf[i].equals("C")) {
				ipkAngka[i] = 2;
			} else if (ipkHuruf[i].equals("D")) {
				ipkAngka[i] = 1;
			} else if (ipkHuruf[i].equals("E")) {
				ipkAngka[i] = 0;
			}
		}
		for (double angka : ipkAngka) {
			totalIpk += angka;
		}
		return totalIpk/jumlahMatkul;
	}

	/**
	 * @return the nim
	 */
	public String getNim() {
		return this.nim;
	}

	/**
	 * @param nim the nim to set
	 */
	public void setNim(String nim) {
		this.nim = nim;
	}

	/**
	 * @return the prodi
	 */
	public String getProdi() {
		return this.prodi;
	}

	/**
	 * @param prodi the prodi to set
	 */
	public void setProdi(String prodi) {
		this.prodi = prodi;
	}

	/**
	 * @return the strata
	 */
	public String getStrata() {
		return this.strata;
	}

	/**
	 * @param strata the strata to set
	 */
	public void setStrata(String strata) {
		this.strata = strata;
	}

	/**
	 * @return the ipk
	 */
	public double getIpk() {
		return this.ipk;
	}

	/**
	 * @param ipk the ipk to set
	 */
	public void setIpk(double ipk) {
		this.ipk = ipk;
	}

	/**
	 * @return the angkatan
	 */
	public int getAngkatan() {
		return this.angkatan;
	}

	/**
	 * @param angkatan the angkatan to set
	 */
	public void setAngkatan(int angkatan) {
		this.angkatan = angkatan;
	}

	/**
	 * @return the jumlahMatkul
	 */
	public static int getJumlahMatkul() {
		return jumlahMatkul;
	}

	/**
	 * @param jumlahMatkul the jumlahMatkul to set
	 */
	public static void setJumlahMatkul(int jumlahMatkul) {
		Mahasiswa.jumlahMatkul = jumlahMatkul;
	}
}
