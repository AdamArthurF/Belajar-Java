package tugaspakbayu;

import java.util.*;

public class Tugas26DeretGeometri {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        double a,r,n;

        // Deret geometri dengan menggunakan perulangan for
        System.out.println("====== DERET GEOMETRI DENGAN PERULANGAN FOR ===== ");
        System.out.print("Masukkan nilai a (Suku pertama) = ");
        a = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan nilai r (Rasio) = ");
        r = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextDouble(); inputUser.nextLine();

        PerulanganFor(a,r,n);

        // Deret geometri dengan menggunakan perulangan while
        System.out.println("\n====== DERET GEOMETRI DENGAN PERULANGAN WHILE ===== ");
        System.out.print("Masukkan nilai a (Suku pertama) = ");
        a = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan nilai r (Rasio) = ");
        r = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextDouble(); inputUser.nextLine();

        PerulanganWhile(a,r,n);
    }

    private static void PerulanganFor(double x,double y,double z){
        double i,total,nilaiAwal,Un;            // x --> a
        total = 0;                              // y --> r
        nilaiAwal = 0;                          // z --> n


        Un = x * Math.pow(y,(z - 1)); // Un = a * Math.pow(r,(n - 1))
        if (y > 0){ // Jika r > 0 (positif)
            for (i = x; i <= Un; i *= y) {
                nilaiAwal++;
                System.out.printf("Nilai pada n ke-%.1f adalah %.1f \n", nilaiAwal, i);
                total = total + i;
                if (i == Un) {
                    System.out.printf("Jumlah total adalah %.1f \n", total);
                }
            }
        } else if (y < 0){ // Jika r < 0 (negatif)
            if (z % 2 == 1){ // Jika n adalah bilangan ganjil
                for (i = x; i <= Un; i *= y) {
                    nilaiAwal++;
                    System.out.printf("Nilai pada n ke-%.1f adalah %.1f \n", nilaiAwal, i);
                    total = total + i;
                    if (i == Un) {
                    System.out.printf("Jumlah total adalah %.1f \n",total);
                    }
                }
            } else if (z % 2 == 0){ // Jika n adalah bilangan genap
                for (i = x;i >= Un;i *= y){
                    nilaiAwal++;
                    System.out.printf("Nilai pada n ke-%.1f adalah %.1f \n", nilaiAwal, i);
                    total = total + i;
                    if (i == Un){
                        System.out.printf("Jumlah total adalah %.1f \n",total);
                    }
                }
            }
        }
    }

    private static void PerulanganWhile(double x,double y,double z){
        double nilaiAwal,total,Un;             // x --> a
        boolean kondisi;                       // y --> r
        kondisi = true;                        // z --> n
        total = 0;
        nilaiAwal = 0;

        Un = x * Math.pow(y,(z - 1));   // Un = a * Math.pow(r,(n - 1))
        if (y > 0) { // Jika r > 0 (positif)
            while (x <= Un && y > 0 && kondisi) {
                nilaiAwal++;
                System.out.printf("Nilai pada n ke-%.1f adalah %.1f \n", nilaiAwal, x);
                total = total + x;
                if (x == Un) {
                    kondisi = false;
                    System.out.printf("Jumlah total adalah %.1f \n", total);
                }
                x *= y;
            }
        } else if (y < 0) { // Jika r < 0 (negatif)
            if (z % 2 == 1) { // Jika n adalah bilangan ganjil
                while (((z % 2 == 1) && (x <= Un)) && ((y < 0) && (kondisi))) {
                    nilaiAwal++;
                    System.out.printf("Nilai pada n ke-%.1f adalah %.1f \n", nilaiAwal, x);
                    total = total + x;
                    if (x == Un) {
                        kondisi = false;
                        System.out.printf("Jumlah total adalah %.1f \n", total);
                    }
                    x *= y;
                }
            } else if (z % 2 == 0){ // Jika n adalah bilangan genap
                while (((z % 2) == 0 && (x >= Un)) && ((y < 0) && (kondisi))) {
                    nilaiAwal++;
                    System.out.printf("Nilai pada n ke-%.1f adalah %.1f \n", nilaiAwal, x);
                    total = total + x;
                    if (x == Un) {
                        kondisi = false;
                        System.out.printf("Jumlah total adalah %.1f \n", total);
                    }
                    x *= y;
                }
            }
        }
    }
}