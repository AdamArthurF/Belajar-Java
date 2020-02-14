/*
 * Copyright (c) 2020. Adam Arthur Faizal
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
