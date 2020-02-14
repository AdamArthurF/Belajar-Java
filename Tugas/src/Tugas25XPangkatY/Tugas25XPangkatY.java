/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas25XPangkatY;

import java.util.*;

public class Tugas25XPangkatY {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int x,y,m,n;

        System.out.println("====== X PANGKAT Y MENGGUNAKAN FOR ======");
        System.out.print("Masukkan nilai x = ");
        x = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai y = ");
        y = inputUser.nextInt(); inputUser.nextLine();
        PerulanganFor(x,y);

        System.out.println("====== M PANGKAT N MENGGUNAKAN WHILE ======");
        System.out.print("Masukkan nilai m = ");
        m = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();
        PerulanganWhile(m,n);
    }

    private static void PerulanganFor(int a,int b){
        int i,hasil;
        hasil = 1;
        for (i = 1;i <= b;i++){
            hasil = hasil * a;
            if (i == b){
                System.out.printf("Maka %d pangkat %d hasilnya adalah %d \n",a,b,hasil);
            }
        }
    }

    private static void PerulanganWhile(int a,int b){
        int nilaiAwal,hasil;
        boolean kondisi;
        hasil = 1;
        nilaiAwal = 1;
        kondisi = true;

        while (nilaiAwal <= b && kondisi){
            hasil = hasil * a;
            if (nilaiAwal == b){
                kondisi = false;
                System.out.printf("Maka %d pangkat %d hasilnya adalah %d \n",a,b,hasil);
            }
            nilaiAwal++;
        }
    }
}
