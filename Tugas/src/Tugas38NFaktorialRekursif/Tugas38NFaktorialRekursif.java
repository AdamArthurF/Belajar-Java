/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Tugas38NFaktorialRekursif;

import java.util.*;

public class Tugas38NFaktorialRekursif {
    protected static Scanner inputUser = new Scanner (System.in);
    public static void main(String[] MbahPutih) {
        int n;
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();

        System.out.printf("Maka %d! = %d \n",n,Faktorial(n));
    }

    private static int Faktorial(int n) {
        int hasil;
        if (n == 1){
            hasil = 1;
        } else {
            hasil = n * Faktorial(n - 1);
        }
        return hasil;
    }
}
