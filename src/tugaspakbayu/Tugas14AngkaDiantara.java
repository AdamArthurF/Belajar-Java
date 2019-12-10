package tugaspakbayu;

import java.util.*;

public class Tugas14AngkaDiantara {

    public static void main(String[] args) {

        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int a,b;

        // Mencetak angka menggunakan perulangan while
        System.out.println("====== ANGKA DIANTARA DENGAN PERULANGAN WHILE ======");
        System.out.print("Masukkan nilai pertama = ");
        a = inputUser.nextInt();
        System.out.print("Masukkan nilai terakhir = ");
        b = inputUser.nextInt();

        PerulanganWhile(a,b);

        // Mencetak angka menggunakan perulangan for
        System.out.println("\n====== ANGKA DIANTARA DENGAN PERULANGAN FOR ======");
        System.out.print("Masukkan nilai pertama = ");
        a = inputUser.nextInt();
        System.out.print("Masukkan nilai terakhir = ");
        b = inputUser.nextInt();

        PerulanganFor(a,b);
    }

    private static void PerulanganWhile(int x,int y){
        boolean kondisi;
        kondisi = true;
        while (x <= y && kondisi) {
            System.out.println(x);
            if (x == y) {
                kondisi = false;
            }
            x++;
        }
        while (x >= y && kondisi) {
            System.out.println(y);
            if (y == x) {
                kondisi = false;
            }
            y++;
        }
    }

    private static void PerulanganFor(int x,int y){
        int i;
        if (x <= y) {
            for (i = x; i <= y;i++){
                System.out.println(i);
            }
        } else if (x >= y){
            for (i = y;i <= x;i++){
                System.out.println(i);
            }
        }
    }
}
