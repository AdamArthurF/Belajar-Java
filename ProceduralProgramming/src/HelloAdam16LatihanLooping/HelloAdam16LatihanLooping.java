/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package HelloAdam16LatihanLooping;

import java.util.Scanner;

public class HelloAdam16LatihanLooping {

    public static void main(String[] args) {
        // Program untuk menjumlahkan angka
        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        while (nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }

        // Menghitung nilai deret fibonacci ke-n
        int fn,fn_1,fn_2,n;
        System.out.print("Mengambil nilai fibonacci ke-");
        n = inputUser.nextInt();
        
        fn_2 = 0;
        fn_1 = 1;
        fn = 1;
            
        for (int i = 1; i <= n; i++){
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            System.out.println("Nilai ke-" + i + " adalah " + fn);
        }
    }
}