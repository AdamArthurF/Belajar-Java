package tugaspakbayu;

import java.util.*;

public class Tugas10GenapGanjil {

    public static void main(String[] MbahPutih) {

        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int bilangan,hasil;
        String jenis;

        System.out.print("Masukkan bilangan kamu = ");
        bilangan = inputUser.nextInt();

        hasil = bilangan % 2;

        if (hasil == 0){
            jenis = "Bilangan genap";
        } else if (hasil == 1){
            jenis = "Bilangan ganjil";
        } else {
            jenis = "Ini adalah bilangan negatif";
        }

        System.out.println(jenis);
        System.out.println("Program selesai");
    }
}
