package mandiri;

import java.util.*;

public class Mandiri22JumlahArray {

    public static void main(String[] MbahPutih) {
        int[] Angka = {2, 1, 3, 5, 4, 4, 4, 2};
        System.out.println(Arrays.toString(Angka));

        Arrays.sort(Angka);
        System.out.println(Arrays.toString(Angka));

        System.out.print("\n");
        for (int i = 0; i < Angka.length; i++) {
            int cari = Angka[i];
            int posisi = Arrays.binarySearch(Angka, cari);
            System.out.printf("Angka %d ada di indeks %d \n", cari, posisi);
        }

        System.out.print("\n");
        int temp;
        int ukuran = Angka.length;
        int jumlah;
        for (int i = 0;i < ukuran;i++){
            temp = Angka[i];
            jumlah = 1;

            if (i != ukuran - 1) {
                if (Angka[i] == Angka[i + 1]) {
                    continue;
                }
            }
            System.out.printf("Angka %d jumlahnya ada ",Angka[i]);

            for (int j = 1; j < ukuran; j++) {
                if (temp != Angka[j]){
                    System.out.printf("= %d (satu) \n",jumlah);
                    break;
                } else if (temp == Angka[j]) {
                    for (int k = 2; k < ukuran; k++) {
                        if (temp != Angka[k]) {
                            break;
                        } else if (temp == Angka[k + 1]){
                            jumlah++;
                            System.out.printf("= %d (tiga) \n",jumlah);
                            break;
                        }
                    }
                    jumlah++;
                    System.out.printf("= %d (dua) \n",jumlah);
                    break;
                }
            }
        }
    }
}