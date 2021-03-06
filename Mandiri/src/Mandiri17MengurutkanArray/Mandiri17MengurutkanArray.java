/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri17MengurutkanArray;

import java.util.*;

public class Mandiri17MengurutkanArray {

    public static void main(String[] MbahPutih) {
        int[] ArrayAngka = {5,4,1,2,3};
        PrintArray("Array A = ",ArrayAngka,"\n");

        Arrays.sort(ArrayAngka);
        PrintArray("Array A = ",ArrayAngka,"\n");

        ArraySwapReverse(ArrayAngka);
//        ArrayReverse(ArrayAngka);
//        PrintArray("Array A = ",ArrayAngka,"\n");

        ArraySwap(ArrayAngka);
    }

    private static void ArrayReverse(int[] dataArray){
//        int a,b,c;
        int temp;

        for (int i = 0;i < (dataArray.length/2);i++){
//            a = dataArray[i];
//            b = dataArray[(dataArray.length - 1) - i];

            temp = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = temp;

//            dataArray[i] = a;
//            dataArray[(dataArray.length - 1) - i] = b;
        }
    }

    private static void ArraySwap(int[] dataArray){
//        int a,b,c;
            int temp;

        for (int i = 0;i < (dataArray.length);i++){
            PrintArray("",dataArray,"");
            for (int j = 0;j < (dataArray.length - 1);j++){
                if (dataArray[j] > dataArray [j + 1]) {
//                    a = dataArray[j];
//                    b = dataArray[j + 1];

                    temp = dataArray[j];
                    dataArray[j] = dataArray[j + 1];
                    dataArray[j + 1] = temp;

//                    dataArray[j] = a;
//                    dataArray[j + 1] = b;
                }
            }
        }
        System.out.print("\n");
    }

    private static void ArraySwapReverse(int[] dataArray){
        int temp;

        for (int i = 0; i < dataArray.length; i++) {
            PrintArray("",dataArray,"");
            for (int j = 0; j < (dataArray.length - 1); j++) {
                if (dataArray[j] < dataArray[j + 1]) {
                    temp = dataArray[j + 1];
                    dataArray[j + 1] = dataArray[j];
                    dataArray[j] = temp;
                }
            }
        }
        System.out.print("\n");
    }

    private static void PrintArray(String m,int[] dataArray,String n){
        System.out.println(m + Arrays.toString(dataArray ) + n);
    }
}