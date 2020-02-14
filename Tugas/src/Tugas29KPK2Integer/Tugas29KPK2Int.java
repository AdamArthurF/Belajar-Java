/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Tugas29KPK2Integer;

import java.util.*;

public class Tugas29KPK2Int {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int a,b;

        System.out.print("Masukkan bilangan a = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan bilangan b = ");
        b = inputUser.nextInt(); inputUser.nextLine();

        PerulanganWhile(a,b);
    }

    private static void PerulanganWhile(int a,int b){
        int i = 2,j = 2,x,y;
        x = a;
        y = b;
        while (x != y){
            if (x < y){
                x = a * i++;
            } else if (x > y){
                y = b * j++;
            }
        }
        System.out.printf("KPK dari bilangan a & b adalah %d",x);
    }
}

