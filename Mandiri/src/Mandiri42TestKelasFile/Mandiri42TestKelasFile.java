/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri42TestKelasFile;

import java.io.*;
import java.util.*;

public class Mandiri42TestKelasFile {

    public static void main(String[] MbahPutih) {
        File file = new File("MbahPutih.txt");
        System.out.println("Apakah file ini ada? " + file.exists());
        System.out.println("file ini memiliki " + file.length() + " byte");
        System.out.println("Dapatkah file ini dibaca? " + file.canRead());
        System.out.println("Dapatkah file ini ditulis? " + file.canWrite());
        System.out.println("Apakah ini direktori? " + file.isDirectory());
        System.out.println("Apakah ini suatu file? " + file.isFile());
        System.out.println("Apakah ini nama absolut? " + file.isAbsolute());
        System.out.println("Apakah file ini hidden? " + file.isHidden());
        System.out.println("Absolute path adalah " + file.getAbsolutePath());
        System.out.println("Terakhir kali dimodifikasi " + new Date(file.lastModified()));
    }
}
