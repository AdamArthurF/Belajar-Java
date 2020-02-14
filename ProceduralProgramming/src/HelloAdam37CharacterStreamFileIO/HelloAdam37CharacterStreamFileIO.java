/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam37CharacterStreamFileIO;

import java.io.*;

public class HelloAdam37CharacterStreamFileIO {

    public static void main(String[] MbahPutih) throws IOException{
        // Membuka File

        // byte stream -> FileInputStream
        // Character stream -> FileReader

        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader      charFileInput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter      charFileOutput = new FileWriter("outputChar.txt");

        // Membaca File

        // byte file
        int buffer = byteFileInput.read();

        while(buffer != -1){
            System.out.print((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println("\n");
        // char file
        buffer = charFileInput.read();

        while(buffer != -1){
            System.out.print((char)buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        // Menutup File

        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();
    }
}
