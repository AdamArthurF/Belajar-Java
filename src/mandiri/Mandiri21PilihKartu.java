package mandiri;

import java.util.*;

public class Mandiri21PilihKartu {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int index,temp,muncul;
        String jenisKartu,urutanKartu;
        int[] kartu = new int[52];
        String[] suit = {"Spade", "Heart", "Diamond", "Club"};
        String[] rank = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        for (int i = 0;i < kartu.length;i++) {
            kartu[i] = i;
        }

        for (int i = 0;i < kartu.length;i++) {
            index = (int) (Math.random() * kartu.length);
            temp = kartu[i];
            kartu[i] = kartu[index];
            kartu[index] = temp;
        }

        System.out.print("Berapa kartu yang ingin kamu munculkan secara acak ? ");
        muncul = inputUser.nextInt(); inputUser.nextLine();
        for (int i = 0; i < muncul; i++) {
            jenisKartu = suit[kartu[i] / (52/muncul)];
            urutanKartu = rank[kartu[i] / (52/muncul)];
            System.out.printf("Nomor kartu %d = %s %s \n",kartu[i],urutanKartu,jenisKartu);
        }
    }
}