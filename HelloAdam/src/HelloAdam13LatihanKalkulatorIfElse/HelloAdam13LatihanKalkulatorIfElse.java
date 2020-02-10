/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam13LatihanKalkulatorIfElse;

import java.util.Scanner;

public class HelloAdam13LatihanKalkulatorIfElse {

    public static void main(String[] args) {
    // Membuat kalkulator
    // a, operator, b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner (System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Input user = " + a + " " + operator + " " + b);

        // Operator yang tersedia --> +, -, *, dan /

        if (operator == '+'){
            //Penjumlahan
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        } else if(operator == '-'){
            //Pengurangan
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        } else if(operator == '*'){
            //Perkalian
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        } else if(operator == '/'){
            //Pengurangan
            hasil = a / b;
            System.out.println("Hasil = " + hasil);
        } else {
            System.out.println("Operator tidak ditemukan");
    }
}






























    }
