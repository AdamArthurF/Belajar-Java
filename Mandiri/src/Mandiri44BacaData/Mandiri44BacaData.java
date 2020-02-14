/*
 * Copyright (c) 2020. Adam Arthur Faizal
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
