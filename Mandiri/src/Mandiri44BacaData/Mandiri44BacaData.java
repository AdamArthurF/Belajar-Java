/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri44BacaData;

import java.util.*;
import java.io.*;

public class Mandiri44BacaData {

    public static void main(String[] MbahPutih) throws Exception{
        File file = new File("MbahPutih.txt");
        Scanner masukan = new Scanner(file);
        while (masukan.hasNextLine()) {
            String namaPertama = String.format("| %-6s |",masukan.next());
            String namaTengah = String.format(" %-6s |",masukan.next());
            String namaTerakhir = String.format(" %-12s |",masukan.next());
            String umur = String.format(" %-5s",masukan.next());
            System.out.println(namaPertama + namaTengah + namaTerakhir + umur);
        }

        masukan.close();
    }
}
