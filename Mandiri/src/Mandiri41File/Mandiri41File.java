/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri41File;

import java.io.*;

public class Mandiri41File {

    public static void main(String[] MbahPutih) throws IOException{
        FileInputStream fileInput = new FileInputStream("input.txt");   // Byte
        FileOutputStream fileOutput = new FileOutputStream("outputByte.txt");   // Byte

        FileReader fileInput2 = new FileReader("input.txt");    // Char
        FileWriter fileOutput2 = new FileWriter("outputChar.txt");  // Char

        int baca;
        // Byte file
            baca = fileInput.read();
            while (baca != -1){
                System.out.print((char) baca);
                fileOutput.write(baca);
                baca = fileInput.read();
            }

        System.out.println("\n");
        // Char file
            baca = fileInput2.read();
            while (baca != -1) {
                System.out.print((char) baca);
                fileOutput2.write(baca);
                baca = fileInput2.read();
            }

            fileInput.close();
            fileOutput.close();

            fileInput2.close();
            fileOutput2.close();
    }
}