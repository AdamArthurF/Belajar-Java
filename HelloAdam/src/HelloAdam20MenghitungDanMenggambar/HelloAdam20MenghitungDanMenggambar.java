/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam20MenghitungDanMenggambar;

import java.util.Scanner;

public class HelloAdam20MenghitungDanMenggambar {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("====== MENGHITUNG DAN MENGGAMBAR ======");
        System.out.println("=======================================");
        System.out.println("\n");
        
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Panjang = ");
        int inputPanjang = inputUser.nextInt();
        System.out.print("Lebar = ");    
        int inputLebar = inputUser.nextInt();
            
        gambar(inputPanjang,inputLebar);
        TampilkanKelilingDanLuas(inputPanjang,inputLebar);
    
    }

    private static void gambar(int panjang,int lebar){
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }   
    }

    private static int keliling(int panjang,int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static int luas(int panjang,int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }

    private static void TampilkanKelilingDanLuas(int panjang,int lebar){
        System.out.println("Keliling = " + keliling(panjang,lebar));
        System.out.println("Luas = " + luas(panjang,lebar));
    }
}