/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri46DialogFile;

import java.util.*;
import java.io.*;
import javax.swing.*;

public class Mandiri46DialogFile {

    public static void main(String[] MbahPutih) throws Exception{
        JFileChooser pemilihFile = new JFileChooser();
        if (pemilihFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = pemilihFile.getSelectedFile();
            Scanner masukan = new Scanner(file);

            while (masukan.hasNext()) {
                System.out.println(masukan.nextLine());
            }

            masukan.close();
        } else {
            System.out.println("Tidak ada file yang dipilih");
        }
    }
}