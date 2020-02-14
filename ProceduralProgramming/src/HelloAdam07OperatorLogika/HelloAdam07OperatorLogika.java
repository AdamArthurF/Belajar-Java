/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package HelloAdam07OperatorLogika;

import java.util.Scanner;

public class HelloAdam07OperatorLogika {

    public static void main(String[] MbahPutih) {

        /*Operator Logika --> Operasi yang biasa kita lakukan pada tipe data boolean*/

        //AND, OR & XOR

        boolean a, b, c;

        //1. OR / atau (||)

        System.out.println("===== OR / atau (||) =====");
        a = false;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a || b);
        System.out.println(a + " || " + b + " = " + c);

        //2. AND / dan (&&)

        System.out.println("===== AND / dan (&&) =====");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        //3. XOR / eksklusif or (^)

        System.out.println("===== XOR / eksklusif or (^) =====");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);

        System.out.println("===========================================");
        System.out.println("====== AYO KITA MAIN TEBAK - TEBAKAN ======");
        System.out.println("===========================================");

        /* Membuat sebuah objek untuk menangkap input dari user */
        Scanner inputUser = new Scanner(System.in);

        /* Sebuah program sederhana untuk menebak sebuah angka */
        int nilaiBenar = 7;
        int nilaiTebakan; // Nilai tebakan dari user input
        boolean statusTebakan;

        System.out.print("Masukan nilai tebakan kamu : ");
        nilaiTebakan = inputUser.nextInt();

        System.out.println("Nilai tebakan kamu adalah " + nilaiTebakan);

        //Program operasi logika dari permainan tebak - tebakan
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan kamu = " + statusTebakan);

        //Program operasi aljabar boolean
        System.out.println("=====================================");
        System.out.println("====== OPERASI ALJABAR BOOLEAN ======");
        System.out.println("=====================================");

        System.out.print("Masukkan nilai diantara 5 dan 10 : ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 5) && (nilaiTebakan < 10);
        
    /* a && b --> hasil       a || b --> hasil
       0    0       0         0    0       0
       0    1       0         0    1       1
       1    0       0         1    0       1
       1    1       1         1    1       2
    */
        System.out.println("Nilai tebakan kamu adalah " + nilaiTebakan);
        System.out.println("Tebakan kamu = " + statusTebakan);
    }
}