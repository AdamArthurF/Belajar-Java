/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tugas42DeretFibonacciRekursif;

import java.util.*;

public class Tugas42DeretFibonacciRekursif {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int n,temp;

        System.out.print("Masukkan n deret fibonacci = ");
        n = inputUser.nextInt(); inputUser.nextLine();

        int[] Fibonacci = new int[n + 1];
        temp = n;
        for (int i = 0;i <= temp;i++) {
            Fibonacci[i] = UnFibonacci(n);
           // System.out.print(UnFibonacci(n) + "  ");
            n--;
        }
        Arrays.sort(Fibonacci);
        System.out.println(Arrays.toString(Fibonacci));
    }

    private static int UnFibonacci(int n){
        int hasil;
        if (n == 1 || n == 0) {
            hasil = n;
        } else {
            hasil = UnFibonacci(n - 1) + UnFibonacci(n - 2);
        }
        return hasil;
    }
}