/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri01Ascending3Data;

import java.util.*;

public class Mandiri01Ascending3Data {

    public static void main(String[] args) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int a,b,c;
        System.out.print("Masukkan data a = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan data b = ");
        b = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan data c = ");
        c = inputUser.nextInt(); inputUser.nextLine();

        Ascending3Data(a,b,c);
    }

    private static void Ascending3Data(int x,int y,int z){
        if ((x >= y) && (x >= z) && (y >= z)){
            System.out.printf("Maka urutan data adalah %d, %d, %d \n",z,y,x);
        } else if ((x >= y) && (x >= z) && (z >= y)){
            System.out.printf("Maka urutan data adalah %d, %d, %d \n",y,z,x);
        } else if ((y >= x) && (y >= z) && (x >= z)){
            System.out.printf("Maka urutan data adalah %d, %d, %d \n",z,x,y);
        } else if ((y >= x) && (y >= z) && (z >= x)){
            System.out.printf("Maka urutan data adalah %d, %d, %d \n",x,z,y);
        } else if ((z >= x) && (z >= y) && (x >= y)){
            System.out.printf("Maka urutan data adalah %d, %d, %d \n",y,x,z);
        } else if ((z >= x) && (z >= y) && (y >= x)){
            System.out.printf("Maka urutan data adalah %d, %d, %d \n",x,y,z);
        }

    }
}
