/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package HelloAdam02OperasiAritmetika;

import java.util.Scanner;

public class HelloAdam02OperasiAritmetika {

    public static void main(String[] MbahPutih) {
        System.out.println("Hello World");
        System.out.println("\n");
 
        // Operasi Aritmatika
        // Penjumlahan, pengurangan, perkalian, pembagian, dan hasil bagi (modulus)

        int a = 12;
        int b = 13;

        int hasil;
        
        // 1. Penjumlahan
        hasil = a + b;
        System.out.printf("%d + %d = %d \n",a,b,hasil);
        System.out.println(a + " + " + b + " = " + hasil );
        
        // 2. Pengurangan
        hasil = a - b;
        System.out.printf("%d - %d = %d \n",a,b,hasil);
        
        // 3. Perkalian
        hasil = a * b;
        System.out.printf("%d * %d = %d \n",a,b,hasil);
        
        // 4. Pembagian
        hasil = a / b;
        System.out.printf("%d / %d = %d \n",a,b,hasil);
      
        // 5. Hasil bagi (modulus)
        hasil = a % b;
        System.out.printf("%d %% %d = %d \n",a,b,hasil);
        

            /* Perkalian dan pembagian akan dilakukan terlebih dahulu */
            /* Operasi dilakukan dari kiri ke kanan jika tidak ada perkalian/pembagian */
            /* Jika dilakukan perkalian dan pembagian, maka operasi nya akan dilakukan dari
            kiri ke kanan */
        
        int hasil2 = 5 * 10 / 2;
        System.out.println("5 * 10 / 2 = " + hasil2);
        hasil2 = 5 + 2 - 10;
        System.out.println("5 + 2 - 10 = " + hasil2);
    
        // Menggunakan pengelompokan operasi dengan "()"
        hasil2 = 60 / (2 + 10);
        System.out.println("60 / (2 + 10) = " + hasil2);
        
        // Perhitungan persamaan kuadrat
        Scanner userInput = new Scanner(System.in);
        System.out.println("====== MENGHITUNG PERSAMAAN KUADRAT ======");
        int m,x,c;
        
        System.out.print("Gradien m = ");
        m = userInput.nextInt();
        System.out.print("Nilai x = ");
        x = userInput.nextInt();
        System.out.print("Bias c = ");
        c = userInput.nextInt();
        
        int y = (m * x * x) + c;
        System.out.println("Nilai y = " + y);
    }
}