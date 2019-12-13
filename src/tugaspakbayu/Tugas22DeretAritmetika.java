package tugaspakbayu;

import java.util.*;

public class Tugas22DeretAritmetika {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int a,b,n;

        System.out.println("====== DERET ARITMETIKA MENGGUNAKAN FOR ======");
        System.out.print("Masukkan nilai a (Suku pertama) = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai b (Beda) = ");
        b = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();

        PerulanganFor(a,b,n);

        System.out.println("\n====== DERET ARITMETIKA MENGGUNAKAN WHILE ======");
        System.out.print("Masukkan nilai a (Suku pertama) = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai b (Beda) = ");
        b = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();

        PerulanganWhile(a,b,n);
    }

    private static void PerulanganFor(int x,int y,int z){
        int i,Un,nilaiAwal,total;       // x --> a
        nilaiAwal = 0;                  // y --> b
        total = 0;                      // z --> n

        Un = x + (z - 1)*y; // Un = a + (n - 1)b

        if (y > 0){     // Jika b > 0 (positif)
        for (i = x;i <= Un;i+=y){
            nilaiAwal++;
            System.out.printf("Nilai pada n ke-%d adalah %d \n",nilaiAwal,i);
            total = total + i;

                if (nilaiAwal == z){
                    System.out.printf("Jumlah total adalah %d \n",total);
                }
            }
        } else if (y < 0){      // Jika b < 0 (negatif)
            for (i = x;i >= Un;i+=y){
                nilaiAwal++;
                System.out.printf("Nilai pada n ke-%d adalah %d \n",nilaiAwal,i);
                total = total + i;
                if (nilaiAwal == z){
                    System.out.printf("Jumlah total adalah %d \n",total);
                }
            }
        }
    }

    private static void PerulanganWhile(int x,int y,int z){
        int nilaiAwal,total,Un;         // x --> a
        boolean kondisi;                // y --> b
        nilaiAwal = 0;                  // z --> n
        total = 0;
        kondisi = true;

        Un = x + (z - 1)*y;     // Un = a + (n - 1)b

        if (y > 0) {
            while (x <= Un && kondisi) {
                nilaiAwal++;
                System.out.printf("Nilai pada n ke-%d adalah %d \n", nilaiAwal, x);
                total = total + x;
                x += y;
                if (nilaiAwal == z) {
                    kondisi = false;
                    System.out.printf("Jumlah total adalah %d \n", total);
                }
            }
        } else if (y < 0){
            while (x >= Un && kondisi) {
                nilaiAwal++;
                System.out.printf("Nilai pada n ke-%d adalah %d \n", nilaiAwal, x);
                total = total + x;
                x += y;
                if (nilaiAwal == z) {
                    kondisi = false;
                    System.out.printf("Jumlah total adalah %d \n", total);
                }
            }

        }
    }
}
