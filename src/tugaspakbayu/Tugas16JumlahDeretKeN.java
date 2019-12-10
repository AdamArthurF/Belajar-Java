package tugaspakbayu;

import java.util.*;

public class Tugas16JumlahDeretKeN {

    public static void main(String[] args) {

        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int nilai;

        // Menggunakan perulangan while
        System.out.print("Masukkan n nilai pertama = ");
        nilai = inputUser.nextInt(); inputUser.nextLine();

        PerulanganWhile(nilai);

        // Menggunakan perulangan for
        System.out.print("\nMasukkan n nilai pertama = ");
        nilai = inputUser.nextInt(); inputUser.nextLine();

        PerulanganFor(nilai);
    }

    private static void PerulanganWhile(int x){
        int nilaiAwal,total;
        boolean kondisi;
        kondisi = true;
        nilaiAwal = 1;
        total = 0;
        while (nilaiAwal <= x && kondisi){
            total = total + nilaiAwal;
            System.out.printf("Ditambah %d menjadi %d \n",nilaiAwal,total);
            if (nilaiAwal == x){
                kondisi = false;
                System.out.printf("Total = %d \n",total);
            }
            nilaiAwal++;
        }
    }

    private static void PerulanganFor(int y){
        int i,total;
        total = 0;
        for (i = 1;i <= y;i++){
            total = total + i;
            System.out.println("Ditambah " + i + " menjadi " + total);
        }
        System.out.printf("Total = %d \n",total);
    }
}

