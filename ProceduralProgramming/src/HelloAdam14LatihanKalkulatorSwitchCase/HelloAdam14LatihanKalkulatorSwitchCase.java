/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam14LatihanKalkulatorSwitchCase;

import java.util.Scanner;

public class HelloAdam14LatihanKalkulatorSwitchCase {

    public static void main(String[] args) {
    
        // Membuat kalkulator dengan Switch Case

        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next();
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        switch(operator){

            case "+":
                // Penjumlahan
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                // Pengurangan
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                // Perkalian
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                // Pembagian
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("Operator " + operator + " tidak ditemukan");
        }
    }
}
