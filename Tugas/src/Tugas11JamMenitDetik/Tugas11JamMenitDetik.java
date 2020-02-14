/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Tugas11JamMenitDetik;

import java.util.*;

public class Tugas11JamMenitDetik {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int jam,menit,detik,jam2,menit2,detik2,jam3,menit3,detik3,d_jam,d_jam2,d_menit,d_menit2,d_jml,d_jml2;
        int detikjmlsemua,sisajam,sisamenit;
        System.out.print("Masukkan jam = ");
        jam = inputUser.nextInt();
        System.out.print("Masukkan menit = ");
        menit = inputUser.nextInt();
        System.out.print("Masukkan detik = ");
        detik = inputUser.nextInt();
        System.out.print("Masukkan jam ke 2 = ");
        jam2 = inputUser.nextInt();
        System.out.print(("Masukkan menit ke 2 = "));
        menit2 = inputUser.nextInt();
        System.out.print("Masukkan detik ke 2 = ");
        detik2 = inputUser.nextInt();
        d_jam = 3600 * jam;
        d_menit = 60 * menit;
        d_jam2 = 3600 * jam2;
        d_menit2 = 60 * menit2;
        d_jml = (d_jam + d_menit + detik);
        d_jml2 = (d_jam2 + d_menit2 + detik2);
        detikjmlsemua = (d_jml2 - d_jml);
        jam3 = detikjmlsemua/3600;
        sisajam = detikjmlsemua % 3600;
        menit3 = sisajam/60;
        sisamenit = sisajam % 60;
        System.out.println("SISA WAKTU = " + jam3 + " Jam " + menit3 + " Menit " + sisamenit + " Detik ");
    }
}


