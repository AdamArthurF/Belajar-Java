/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam38BufferedCharStream;

import java.io.*;
import java.util.*;

public class HelloAdam38BufferedByteStream {

    public static void main(String[] MbahPutih) throws IOException {
        long waktuStart,waktuFinish;

        // Membaca dari File
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());

        // menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));
        byteInput.close();

        // Membaca dari memory
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);

        bufferedInput.mark(200);
        // menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));

        // baca ulang
        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);
        bufferedInput.close();
        byteInput2.close();

        // Menulis dengan buffered output

        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        // write data berupa byte
        bufferedOutput.write(data,0,data.length);
        bufferedOutput.flush();

        bufferedOutput.close();
        byteOutput.close();


    }
}
