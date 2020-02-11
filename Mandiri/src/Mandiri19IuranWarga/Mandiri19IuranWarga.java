/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri19IuranWarga;

import javax.swing.*;

public class Mandiri19IuranWarga {

    public static void main(String[] MbahPutih) {
        String inputUser;
        int jumlah,iuran,total = 0;
        inputUser = JOptionPane.showInputDialog(null,"Berapa jumlah warga? ","Masukkan data",JOptionPane.QUESTION_MESSAGE);
        jumlah = Integer.parseInt(inputUser);

        String[] namaWarga = new String[jumlah];
        int[] jumlahIuran = new int[jumlah];
        for (int i = 0;i < namaWarga.length || i < jumlahIuran.length;i++) {
            inputUser = JOptionPane.showInputDialog(null,"Masukkan nama warga ke-" + (i + 1) + " : ","Input Data",JOptionPane.INFORMATION_MESSAGE);
            namaWarga[i] = inputUser;

            inputUser = JOptionPane.showInputDialog(null,"Masukkan besaran iuran " + namaWarga[i] + " : ","Input Data",JOptionPane.INFORMATION_MESSAGE);
            iuran = Integer.parseInt(inputUser);
            jumlahIuran[i] = iuran;

            total = total + iuran;
        }
        JOptionPane.showMessageDialog(null,"Besar iuran yang terkumpul adalah : Rp" + total,"Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
    }
}