/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package HelloAdam21FungsiRecursive;

import java.util.Scanner;

public class HelloAdam20FungsiRecursive {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai kamu = ");
        int nilai = inputUser.nextInt();
        System.out.println("Kamu memasukkan nilai " + nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah = " + jumlah);
        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil faktorial = " + faktorial);
    }
    
    // Fungsi rekursif sederhana
    private static void printNilai(int parameter){
        System.out.println("Nilai = " + parameter);
        if (parameter == 0){
            return;
        }
        parameter--;
    }

    private static int jumlahNilai(int parameter){
        System.out.println("Parameter = " + parameter);
        if (parameter == 0){
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);
    }

    private static int hitungFaktorial(int parameter){
        System.out.println("Parameter = " + parameter);
        if (parameter ==1){
            return parameter;
        }
        return parameter * hitungFaktorial(parameter -1);
    }
}

