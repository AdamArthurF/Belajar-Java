/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas05RataRataSKS;

import java.util.*;

public class Tugas05RatarataSKS {

    public static void main(String[] MbahPutih) {
        double math,algo,ratarata;
        String nilai;
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai Matematika = ");
        math = inputUser.nextDouble();
        System.out.print("Masukkan nilai Algoritma = ");
        algo = inputUser.nextDouble();
        //Matematika = 2 sks
        //Algoritma = 3 sks
        ratarata = ((math * 2) + (algo * 3)) / (5);
        System.out.println("Maka rata-rata kamu = " + ratarata);

        if (ratarata >= 85){
            nilai = "A";
            System.out.println("Nilai = " + nilai);
        } else if ((ratarata >= 80) && (ratarata <= 84)){
            nilai = "A-";
            System.out.println("Nilai = " + nilai);
        } else if ((ratarata >= 75) && (ratarata <= 79)){
            nilai = "B+";
            System.out.println("Nilai = " + nilai);
        } else if ((ratarata >= 70) && (ratarata <= 74)){
            nilai = "B";
            System.out.println("Nilai = " + nilai);
        } else if ((ratarata >= 65) && (ratarata <= 69)){
            nilai = "C+";
            System.out.println("Nilai = " + nilai);
        } else if ((ratarata >= 60) && (ratarata <= 64)){
            nilai = "C";
            System.out.println("Nilai = " + nilai);
        } else if ((ratarata >= 50) && (ratarata <= 59)){
            nilai = "D";
            System.out.println("Nilai = " + nilai);
        } else if ((ratarata < 50)){
            nilai = "E";
            System.out.println("Nilai = " + nilai);
        } else {
            System.out.println("Salah input cuk");
        }

//        switch (nilai){
//            case "A":
//                System.out.println("IPK = 4.00");
//
//        }
    }
}
