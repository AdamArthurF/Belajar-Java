package tugaspakbayu;

import java.util.*;

public class Tugas17RataNBilangan {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int n;

        System.out.print("Masukkan bilangan n = ");
        n = inputUser.nextInt(); inputUser.nextLine();

        PerulanganWhile(n);
    }

    private static void PerulanganWhile(int x){
        int total,nilaiAwal,ratarata;
        nilaiAwal = 1;
        total = 0;
        while (nilaiAwal <= x){
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
        ratarata = total/x;
        System.out.println("Maka rata-rata = " + ratarata);
    }
}
