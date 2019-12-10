package mandiri;

import java.util.*;

public class Mandiri20AngkaLotto {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int angka;
        boolean semuaDirangkum;
        boolean[] apaDirangkum = new boolean[99];

        angka = inputUser.nextInt(); inputUser.nextLine();
        while (angka != 0) {
            apaDirangkum[angka - 1] = true;
            angka = inputUser.nextInt(); inputUser.nextLine();
        }

        semuaDirangkum = true;
        for (int i = 0;i < 99;i++) {
            if (!apaDirangkum[i]){
                semuaDirangkum = false;
                break;
            }
        }

        if (semuaDirangkum) {
            System.out.println("Tiket telah merangkum semua angka");
        } else {
            System.out.println("Tiket tidak merangkum semua angka");
        }
    }
}
