/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Tugas30FPB2Integer;

import java.util.*;

public class Tugas30FPB2Int {

    public static void main(String[] Mbahputih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int a,b;

        System.out.print("Masukkan bilangan a = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan bilangan b = ");
        b = inputUser.nextInt(); inputUser.nextLine();
        PerulanganWhile(a,b);

        System.out.print("Masukkan bilangan a = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan bilangan b = ");
        b = inputUser.nextInt(); inputUser.nextLine();
        PerulanganFor(a,b);
    }

    private static void PerulanganWhile(int a, int b) {
        int x,y,i = 2,j = 2;
        x = a;
        y = b;

        while (x != y) {
            if (x > y) {
                if (a % i == 0) {
                    x = a / i++;
                } else {
                    i++;
                }
            } else if (x < y) {
                if (b % j == 0) {
                    y = b / j++;
                } else {
                    j++;
                }
            }
        }
        System.out.printf("Maka FPB dari bilangan a & b adalah %d",x);
    }

    private static void PerulanganFor(int a,int b){
        int FPB = 1;

        for (int i = 1;i <= a && i <= b;i++){
            if (a % i == 0 && b % i == 0){
                FPB = i;
            }
        }
        System.out.printf("Maka FPB dari bilangan a & b adalah %d",FPB);
    }
}