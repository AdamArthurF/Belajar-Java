/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam34MethodException;

import java.util.*;

public class HelloAdam34MethodException {

    public static void main(String[] MbahPutih) {
        int[] arrayData = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke-:");
        int indexInput = userInput.nextInt();

        // Exception biasa
        System.out.println("Exception biasa");
        try {
            System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);
        } catch (Exception e){
            System.err.println(e);
        }

        // Exception didalam fungsi
        System.out.println("\nException dalam fungsi");
        int data = ambilDataDariArray(arrayData, indexInput);
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data);

        // Exception throws by method
        System.out.println("Exception throws by method");
        int data2 = 0;

        try{
            data2 = ambilData(arrayData, indexInput);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data2);
        System.out.println("\n\nakhir dari program");
    }

    private static int ambilData(int[] array, int index) throws Exception {
        int hasil = array[index];
        return hasil;
    }


    private static int ambilDataDariArray(int[] array, int index){
        int hasil = 0;

        try {
            hasil = array[index];
        } catch (Exception e){
            System.err.println(e);
        }
        return hasil;
    }
}


