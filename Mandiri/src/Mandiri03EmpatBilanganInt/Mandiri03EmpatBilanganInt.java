/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri03EmpatBilanganInt;

import java.util.*;

public class Mandiri03EmpatBilanganInt {

    public static void main(String[] args) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int a,b,c,d;
        System.out.print("Masukkan bilangan a = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan bilangan b = ");
        b = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan bilangan c = ");
        c = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan bilangan d = ");
        d = inputUser.nextInt(); inputUser.nextLine();

        MaxBilanganInt(a,b,c,d);
    }

    private static void MaxBilanganInt(int w,int x,int y,int z){
        if ((w >= x) && (w >= y) && (w >= z)){
            System.out.println("Maka bilangan terbesar adalah = " + w);
        } else if ((x >= w) && (x >= y) && (x >= z)){
            System.out.println("Maka bilangan terbesar adalah = " + x);
        } else if ((y >= w) && (y >= x) && (y >= z)){
            System.out.println("Maka bilangan terbesar adalah = " + y);
        } else if ((z >= w) && (z >= x) && (z >= y)){
            System.out.println("Maka bilangan terbesar adalah = " + z);
        }
    }
}
