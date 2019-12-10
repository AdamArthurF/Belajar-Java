package mandiri;

import java.util.*;

public class Mandiri23PengurutanSeleksi {

    public static void main(String[] MbahPutih) {
        int[] daftar = {2,1,3,5,4};
        pengurutanSeleksi(daftar);

        System.out.println(Arrays.toString(daftar));

    }

    private static void pengurutanSeleksi(int[] dataArray){
        for (int i = 0;i < dataArray.length - 1;i++){
            int minSekarang = dataArray[i];
            int indexMinSekarang = i;
            for (int j = i + 1;j < dataArray.length;j++){
                if (minSekarang > dataArray[j]) {
                    minSekarang = dataArray[j];
                    indexMinSekarang = j;
                }
            }

            if (indexMinSekarang != i) {
                dataArray[indexMinSekarang] = dataArray[i];
                dataArray[i] = minSekarang;
            }
        }
    }
}
