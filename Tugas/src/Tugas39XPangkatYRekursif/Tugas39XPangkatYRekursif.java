/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Tugas39XPangkatYRekursif;

import java.util.*;

public class Tugas39XPangkatYRekursif {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int x,y;

        System.out.print("Masukkan nilai x = ");
        x = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai y = ");
        y = inputUser.nextInt(); inputUser.nextLine();

        System.out.printf("Maka hasil dari %d pangkat %d adalah %d \n",x,y,xPangkaty(x,y));
    }

    private static int xPangkaty(int x,int y){
        int hasil;
        if (y == 1) {
            hasil = x;
        } else {
            hasil = x * xPangkaty(x, y - 1);
        }
        return hasil;
    }
}
