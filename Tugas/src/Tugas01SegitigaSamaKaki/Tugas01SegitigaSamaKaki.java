/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas01SegitigaSamaKaki;

import java.util.*;

public class Tugas01SegitigaSamaKaki {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        double luas,keliling,alas,tinggi;
        System.out.print("Masukkan alas = ");
        alas = inputUser.nextDouble();
        System.out.print("Masukkan tinggi = ");
        tinggi = inputUser.nextDouble();
        luas = 0.5 * alas * tinggi;
        double a,b;                         // Akar 3 --> Math.sqrt(3);
        a = Math.pow(tinggi,2);             // 2 pangkat 3 --> Math.pow(2,3);
        b = Math.pow(0.5 * alas,2);         // Akar 3 dari 8 --> Math.pow(8,(double)1/3);
        double sisimiring;
        sisimiring = Math.sqrt(a + b);
        keliling = alas + 2 * sisimiring;
        System.out.println("Keliling = " + keliling);
        System.out.println("Luas = " + luas);
    }
}
