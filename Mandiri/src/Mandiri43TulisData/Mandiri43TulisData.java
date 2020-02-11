/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri43TulisData;

import java.io.*;

public class Mandiri43TulisData {

    public static void main(String[] MbahPutih) throws Exception {
        File file = new File("MbahPutih.txt");
        if (file.exists()) {
            System.out.println("File sudah ada");
            System.exit(0);
        }

        PrintWriter keluaran = new PrintWriter(file);
        keluaran.print("Adam Arthur Faizal ");
        keluaran.println(17);
        keluaran.print("Mbah Putih Mulyosugito ");
        keluaran.println(71);

        keluaran.close();
    }
}
