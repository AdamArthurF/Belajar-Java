/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam36ByteStreamFileIO;

import java.io.*;

public class HelloAdam36ByteStreamFileIO {

    public static void main(String[] MbahPutih) throws IOException{
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        // Membuka file
        fileInput = new FileInputStream("input.txt");

        // Membaca file
        int data = fileInput.read();

        while(data != -1){
            System.out.println((char) data);
            data = fileInput.read();
        }

        // Menutup File
        fileInput.close();


        // Salah satu contoh skenario program pembukaan file

        try {
            // Membuka File
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt");

            // Membaca File
            int buffer = fileInput.read();

            while (buffer != -1){
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }

        } finally {
            if (fileInput != null){
                fileInput.close();
            }

            if (fileOutput != null) {
                fileInput.close();
            }
        }

        // yang terakhir (try with resources)


        try (
                FileInputStream in = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output.txt")
        ){

            // Membaca file
            int data2 = in.read();

            while(data2 != -1){
                out.write((char) data2);
                data2 = in.read();
            }
        }
    }
}
