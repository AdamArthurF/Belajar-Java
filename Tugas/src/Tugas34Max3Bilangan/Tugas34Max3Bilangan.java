/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Tugas34Max3Bilangan;

import java.util.*;

public class Tugas34Max3Bilangan {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int a,b,c;

        System.out.print("Masukkan bilangan a = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan bilangan b = ");
        b = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan bilangan c = ");
        c = inputUser.nextInt(); inputUser.nextLine();

        System.out.printf("Maka bilangan terbesar adalah = %d (%s) \n",Max3Integer(a,b,c),Max3Integer2(a,b,c));
    }

    private static int Max3Integer(int a,int b,int c){
        int bilangan;

        if (a > b && a > c){
            bilangan = a;
        } else if (b > a && b > c) {
            bilangan = b;
        } else if (c > a && c > b) {
            bilangan = c;
        } else {
            bilangan = 0;
        }

        return bilangan;
    }

    private static String Max3Integer2(int a,int b,int c){
        String status;

        if (a > b && a > c){
            status = "Bilangan a";
        } else if (b > a && b > c) {
            status = "Bilangan b";
        } else if (c > a && c > b) {
            status = "Bilangan c";
        } else {
            status = " ";
        }

        return status;
    }
}
