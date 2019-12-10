package helloadam;

import java.util.Arrays;

public class HelloAdam25ArrayMultidimensi {

    public static void main(String[] args) {

        System.out.println("====== ARRAY MULTIDIMENSI ======");

        // Cara membuat array 2D dengan assignment
        int[][] array_2D = {
                {1,2},
                {3,4}
        };
        printArray2D(array_2D);

        // Cara membuat array 2D dengan deklarasi
        // int[baris][kolom]
        int[][] arrayAngka = new int[5][4];
        printArray2D(arrayAngka);

        // Looping secara manual

        for(int i = 0;i < arrayAngka.length;i++){
            for(int j = 0;j < arrayAngka[i].length;j++){
                System.out.print(arrayAngka[i][j] + "  ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        // Looping for each

//        for (int[] baris:arrayAngka){
//            System.out.println("\n");
//            for(int angka;baris){
//                System.out.println(angka + " ");
//            }
//            System.out.println("\n");
//        }

        //Array secara manual untuk pembuktian

        int[][] arrayAngka2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };

        printArray2D(arrayAngka2);

        int[][] arrayRagged = {
                {1,2,3},
                {4,5,6,7},
                {8,9,},
                {10}
        };
        printArray2D(arrayRagged);
    }

    private static void printArray2D(int[][] dataArray){
        for(int i = 0;i < dataArray.length;i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }
        System.out.println("\n");
    }
}