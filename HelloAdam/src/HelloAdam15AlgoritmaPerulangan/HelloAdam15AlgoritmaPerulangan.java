/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam15AlgoritmaPerulangan;

public class HelloAdam15AlgoritmaPerulangan {

    public static void main(String[] args) {
    
        // Algoritma Perulangan --> 1. While Loop
        /* While (kondisi) {
                aksi
        }
        */

        int a = 0;
        boolean kondisi = true;
    
        System.out.println("====== WHILE LOOP =====");
        System.out.println("Awal program");
        
        while (kondisi){
            System.out.println("While loop ke-" + a);

            if (a == 10){
                kondisi = false;
            }

            a++;
        }
            
        System.out.println("Akhir program");
    
        // Algoritma perulangan --> 2. Do While
        /* do {
                aksi
            } while(kondisi);
        */
        
        int b = 0;
        boolean kondisi2 = true;
        
        System.out.println("===== DO WHILE ======");
        System.out.println("Awal program");
    
        do {
            b++;
            System.out.println("Do while ke-" + b);

                if (b == 10){
                    kondisi2 = false;
                }

        } while(kondisi2);
    
        System.out.println("Akhir program");
    
        // Algoritma perulangan --> For Loop
        /* for (inisialisasi; kondisi; step_nilai){
                aksi;
        }
        */
    
        System.out.println("====== FOR WHILE ======");
        System.out.println("Awal program");
    
        System.out.println("------ Loop pertama");

        for (int nilai = 0; nilai <= 10; nilai++){
            System.out.println("For loop ke-" + nilai);
        }

        System.out.println("------ Loop Kedua");

        for (int nilai = 0; nilai < 10; nilai++){
            System.out.println("For loop ke-" + nilai);
        }

        System.out.println("------ Loop ketiga");

        for (int nilai = 10; nilai >= 0; nilai--){
            System.out.println("For loop ke-" + nilai);
        }

        System.out.println("------ Loop keempat");

        int nilai = 0;
        for (; nilai < 10 ;){
            nilai++;
            System.out.println("For loop ke-" + nilai);
        }
    
        System.out.println("Akhir program");
    }
}