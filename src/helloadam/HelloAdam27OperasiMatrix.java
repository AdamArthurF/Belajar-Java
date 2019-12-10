package helloadam;

import java.util.*;

public class HelloAdam27OperasiMatrix {

    public static void main(String[] args) {

        // Penjumlahan Matrix
        int[][] MatrixA = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] MatrixB = {
                {11,12,13},
                {14,15,16},
                {17,18,19}
        };

        printArray(MatrixA);
        printArray(MatrixB);

        int[][] hasilTambah = tambah(MatrixA,MatrixB);
        printArray(hasilTambah);

        // Perkalian Matrix

        int[][] MatrixC = {
                {1,2},
                {3,4}
        };
        int[][] MatrixD = {
                {11,12},
                {13,14}
        };
        int[][] hasilKali = kali(MatrixC,MatrixD);

        printArray(hasilKali);
    }

    private static int[][] kali(int[][] Matrix1,int[][] Matrix2){
        int baris1 = Matrix1.length;
        int kolom1 = Matrix1[0].length;

        int baris2 = Matrix2.length;
        int kolom2 = Matrix2[0].length;

        /* Jika a.b maka jumlah baris akan mengikuti matrix a, sedangkan
         jumlah kolom akan mengikuti kolom b
         */

        int[][] hasil = new int[baris1][kolom2];

        int buffer;
        for (int i = 0;i < baris1;i++){
            for (int j = 0;j < kolom2;j++){
                buffer = 0;
                for (int k = 0;k < kolom1;k++){
                    buffer += Matrix1[i][k] * Matrix2[k][j];
                }
                hasil[i][j] = buffer;
            }
        }
        return hasil;
    }

    private static int[][] tambah(int[][] Matrix1,int[][] Matrix2){
        int baris1 = Matrix1.length;
        int kolom1 = Matrix1[0].length;

        int baris2 = Matrix2.length;
        int kolom2 = Matrix2[0].length;

        int[][] hasil = new int[baris1][kolom1];

        if (baris1 == baris2 && kolom1 == kolom2){
            for (int i = 0;i < baris1;i++){
                for (int j = 0;j < kolom1;j++){
                    hasil[i][j] = Matrix1[i][j] + Matrix2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah baris atau kolom tidak sama");
        }
        return hasil;
    }

    private static void printArray(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0;i < baris;i++){
            System.out.print("[");
            for (int j = 0;j < kolom;j++){
                System.out.print(dataArray[i][j]);

                if (j < (kolom - 1)){
                    System.out.print(",");
                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
