/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam10Percabangan;

import java.util.*;

public class HelloAdam10AlgoritmaPercabangan {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        
        // Algoritma percabangan
        // Tutorial untuk if else statement
        System.out.println("===== IF ELSE STATEMENT ======");
        System.out.print("Masukkan nilai a = ");
        int a = inputUser.nextInt();

        System.out.println("Nilai a = " + a);

        // Ini adalah cabang nya
        if (a == 10){
            System.out.println("Ini adalah jalur true");
        } else{
            System.out.println("Ini adalah jalur false");
        }
        System.out.println("Selesai");

        // Tutorial untuk if else if statemnet
        System.out.println("====== IF ELSE IF STATEMENT ======");
        System.out.print("Masukkan nilai b = ");
        int b = inputUser.nextInt();

        System.out.println("Ini adalah awal program");
        System.out.println("Nilai b = " + b);
         
        // Ini adalah cabangnya
        if (b == 5){
            System.out.println("Ini adalah aksi 1");
        } else if(b != 10){
            System.out.println("Ini adalah aksi 2");
        } else{
            System.out.println("Ini adalah aksi default");
        }
        
        // Akhir dari if else if statement
        System.out.println("Ini adalah akhir program");
        
        // Tutorial untuk nested if (if bersarang)        
        System.out.println("====== NESTED IF ======");
        System.out.print("Masukkan nilai c = ");
        int c = inputUser.nextInt();
        System.out.print("Masukkan nilai d = ");
        int d = inputUser.nextInt();

        System.out.println("Ini adalah awal dari program");
    
        if (c == 5){
            if (d == 10){
                System.out.println("Ini adalah dimana c = 5 dan d = 10");
            } else {
                System.out.println("Ini adalah dimana c = 5 dan d bukan 10");
            }
        } else{
            System.out.println("Ini adalah dimana c salah");
        }
        System.out.println("Ini adalah akhir dari program");
    }
}