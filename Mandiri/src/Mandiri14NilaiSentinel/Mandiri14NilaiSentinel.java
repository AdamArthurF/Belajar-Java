/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri14NilaiSentinel;

import javax.swing.*;

public class Mandiri14NilaiSentinel {

    public static void main(String[] MbahPutih) {
        int jumlah,opsi,data;
        String dataString;
        jumlah = 0;

        opsi = JOptionPane.YES_OPTION;
        while (opsi == JOptionPane.YES_OPTION) {
            dataString = JOptionPane.showInputDialog(null,"Masukkan suatu nilai integer = ","Kotak dialog",JOptionPane.INFORMATION_MESSAGE);
            data = Integer.parseInt(dataString);

            jumlah += data;
            opsi = JOptionPane.showConfirmDialog(null,"Mau lanjut engga? ","Kotak dialog",JOptionPane.YES_NO_CANCEL_OPTION);
        }
        JOptionPane.showMessageDialog(null,"Wah ternyata jumlah nya adalah " + jumlah);
    }
}
