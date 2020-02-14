/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas03WaktuBertemu;

import java.util.*;

public class Tugas03WaktuBertemu {

    public static void main(String[] MbahPutih){
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        double kecepatanA,kecepatanB,kecepatanTotal,jarakAB,jarakA,jarakB,waktu;
        System.out.print("Kecepatan si A (dalam kilometer) = ");
        kecepatanA = inputUser.nextDouble();
        System.out.print("Kecepatan si B (dalam kilometer) = ");
        kecepatanB = inputUser.nextDouble();
        System.out.print("Jarak si A dan si B (dalam kilometer) = ");
        jarakAB = inputUser.nextDouble();
        kecepatanTotal = kecepatanA + kecepatanB;
        waktu = jarakAB / kecepatanTotal;
        jarakA = waktu + kecepatanA;
        jarakB = waktu + kecepatanB;
        System.out.println("Waktu bertemu si A dan si B adalah = " + waktu + "jam");
        System.out.println("Jarak tempuh mobil A = " + jarakA + " Kilometer");
        System.out.println("Jarak tempuh mobil B = " + jarakB + " Kilometer");
    }
}
