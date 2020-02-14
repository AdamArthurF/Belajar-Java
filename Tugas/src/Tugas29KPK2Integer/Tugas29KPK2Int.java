/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
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

