/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas23KaliNBilangan;

import java.util.*;

public class Tugas23KaliNBilangan {
    static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int i,n;

        System.out.println("====== KALI N BILANGAN DENGAN PERCABANGAN IF ======");
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();
        PercabanganIf(n);

        System.out.println("====== KALI N BILANGAN DENGAN PERULANGAN FOR ======");
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();
        PerulanganFor(n);

        System.out.println("====== KALI N BILANGAN DENGAN PERULANGAN WHILE ======");
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();
        PerulanganWhile(n);
    }

    private static void PercabanganIf(int x){
        int a,b,c,d,e,f,g,h,i,j,hasil;
        if (x == 1){
            System.out.print("Masukkan bilangan a = ");
            a = inputUser.nextInt(); inputUser.nextLine();
            hasil = a;
            System.out.printf("Bilangan yang diinput %d, maka hasilnya = %d \n",a,hasil);
        } else if (x == 2){
            System.out.print("Masukkan bilangan a = ");
            a = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan b = ");
            b = inputUser.nextInt(); inputUser.nextLine();
            hasil = a * b;
            System.out.printf("Bilangan yang diinput %d,%d maka hasilnya = %d*%d = %d \n",a,b,a,b,hasil);
        } else if (x == 3){
            System.out.print("Masukkan bilangan a = ");
            a = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan b = ");
            b = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan c = ");
            c = inputUser.nextInt(); inputUser.nextLine();
            hasil = a * b * c;
            System.out.printf("Bilangan yang diinput %d,%d,%d maka hasilnya = %d*%d*%d = %d \n",a,b,c,a,b,c,hasil);
        } else if (x == 4){
            System.out.print("Masukkan bilangan a = ");
            a = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan b = ");
            b = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan c = ");
            c = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan d = ");
            d = inputUser.nextInt(); inputUser.nextLine();
            hasil = a * b * c * d;
            System.out.printf("Bilangan yang diinput %d,%d,%d,%d maka hasilnya = %d*%d*%d*%d = %d \n",a,b,c,d,a,b,c,d,hasil);
        } else if (x == 5){
            System.out.print("Masukkan bilangan a = ");
            a = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan b = ");
            b = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan c = ");
            c = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan d = ");
            d = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan e = ");
            e = inputUser.nextInt(); inputUser.nextLine();
            hasil = a * b * c * d * e;
            System.out.printf("Bilangan yang diinput %d,%d,%d,%d,%d maka hasilnya = %d*%d*%d*%d*%d = %d \n",a,b,c,d,e,a,b,c,d,e,hasil);
        } else if (x == 6){
            System.out.print("Masukkan bilangan a = ");
            a = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan b = ");
            b = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan c = ");
            c = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan d = ");
            d = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan e = ");
            e = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan f = ");
            f = inputUser.nextInt(); inputUser.nextLine();
            hasil = a * b * c * d * e * f;
            System.out.printf("Bilangan yang diinput %d,%d,%d,%d,%d,%d maka hasilnya = %d*%d*%d*%d*%d*%d = %d \n",a,b,c,d,e,f,a,b,c,d,e,f,hasil);
        } else if (x == 7){
            System.out.print("Masukkan bilangan a = ");
            a = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan b = ");
            b = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan c = ");
            c = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan d = ");
            d = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan e = ");
            e = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan f = ");
            f = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan g = ");
            g = inputUser.nextInt(); inputUser.nextLine();
            hasil = a * b * c * d * e * f * g;
            System.out.printf("Bilangan yang diinput %d,%d,%d,%d,%d,%d,%d maka hasilnya = %d*%d*%d*%d*%d*%d*%d = %d \n",a,b,c,d,e,f,g,a,b,c,d,e,f,g,hasil);
        } else if (x == 8){
            System.out.print("Masukkan bilangan a = ");
            a = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan b = ");
            b = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan c = ");
            c = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan d = ");
            d = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan e = ");
            e = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan f = ");
            f = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan g = ");
            g = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan h = ");
            h = inputUser.nextInt(); inputUser.nextLine();
            hasil = a * b * c * d * e * f * g * h;
            System.out.printf("Bilangan yang diinput %d,%d,%d,%d,%d,%d,%d,%d maka hasilnya = %d*%d*%d*%d*%d*%d*%d*%d = %d \n",a,b,c,d,e,f,g,h,a,b,c,d,e,f,g,h,hasil);
        } else if (x == 9){
            System.out.print("Masukkan bilangan a = ");
            a = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkab bilangan b = ");
            b = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan c = ");
            c = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan d = ");
            d = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan e = ");
            e = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan f = ");
            f = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan g = ");
            g = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan h = ");
            h = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan i = ");
            i = inputUser.nextInt(); inputUser.nextLine();
            hasil = a * b * c * d * e * f * g * h * i;
            System.out.printf("Bilangan yang diinput %d,%d,%d,%d,%d,%d,%d,%d,%d maka hasilnya = %d*%d*%d*%d*%d*%d*%d*%d*%d = %d \n",a,b,c,d,e,f,g,h,i,a,b,c,d,e,f,g,h,i,hasil);
        } else if (x == 10){
            System.out.print("Masukkan bilangan a = ");
            a = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan b = ");
            b = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan c = ");
            c = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan d = ");
            d = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan e = ");
            e = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan f = ");
            f = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan g = ");
            g = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan h = ");
            h = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan i = ");
            i = inputUser.nextInt(); inputUser.nextLine();
            System.out.print("Masukkan bilangan j = ");
            j = inputUser.nextInt(); inputUser.nextLine();
            hasil = a * b * c * d * e * f * g * h * i * j;
            System.out.printf("Bilangan yang diinput %d,%d,%d,%d,%d,%d,%d,%d,%d,%d maka hasilnya = %d*%d*%d*%d*%d*%d*%d*%d*%d*%d = %d \n",a,b,c,d,e,f,g,h,i,j,a,b,c,d,e,f,g,h,i,j,hasil);
        }
    }

    private static void PerulanganFor(int x){
        int i,bilangan,total;
        total = 1;
        for (i = 1;i <= x;i++){
            System.out.print("Masukkan bilangan anda = ");
            bilangan = inputUser.nextInt(); inputUser.nextLine();
            total = total * bilangan;
        }
        System.out.printf("Maka hasilnya adalah = %d \n",total);
    }

    private static void PerulanganWhile(int x){
        int nilaiAwal,total,bilangan;
        boolean kondisi;
        kondisi = true;
        nilaiAwal = 1;
        total = 1;

        while (nilaiAwal <= x && kondisi){
            System.out.print("Masukkan bilangan anda = ");
            bilangan = inputUser.nextInt(); inputUser.nextLine();
            total = total * bilangan;
            if (nilaiAwal == x && kondisi){
                kondisi = false;
                System.out.printf("Maka hasilnya adalah = %d \n",total);
            }
            nilaiAwal++;
        }
    }
}