/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam00SukaSuka2;

import java.io.*;

public class HelloAdam00SukaSuka2 {

    public static void main(String[] MbahPutih) throws java.lang.Exception {

        System.out.println("=====================================");
        System.out.println("====== MASUKKAN IDENTITAS ANDA ======");
        System.out.println("=====================================");
        System.out.println("\n");
        
        BufferedReader inputUser;
        inputUser = new BufferedReader(new InputStreamReader (System.in));
        
        String nama;
        String jenisKelamin;
        int umur;
        double tinggi;
        
        System.out.print("Nama : ");
        nama = inputUser.readLine();
        System.out.print("Umur : ");
        umur = Integer.parseInt(inputUser.readLine());
        System.out.print("Jenis Kelamin : ");
        jenisKelamin = inputUser.readLine();
        System.out.print("Tinggi Badan : ");    
        tinggi = Double.parseDouble(inputUser.readLine());
            
        System.out.println("Nama kamu adalah " + nama);    
        System.out.println("Umur kamu " + umur + " tahun");
        System.out.println("Jenis kelamin " + jenisKelamin);
        System.out.println("Tinggi badan kamu " + tinggi + " centimeter");
    }
}
