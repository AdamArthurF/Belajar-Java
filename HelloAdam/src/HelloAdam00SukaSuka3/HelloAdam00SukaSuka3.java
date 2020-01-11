/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package HelloAdam00SukaSuka3;

import javax.swing.JOptionPane;

public class HelloAdam00SukaSuka3 {

    public static void main(String[] MbahPutih) {

        System.out.println("=====================================");
        System.out.println("====== MASUKKAN IDENTITAS ANDA ======");
        System.out.println("=====================================");
        System.out.println("\n");

        String nama,jenisKelamin,x;
        int umur;
        double tinggi;

        nama = JOptionPane.showInputDialog(null,"Nama","Masukkan Data",JOptionPane.QUESTION_MESSAGE);
        x = JOptionPane.showInputDialog(null,"Umur : ","Masukkan Data",JOptionPane.QUESTION_MESSAGE);
        umur = Integer.parseInt(x);
        jenisKelamin = JOptionPane.showInputDialog(null,"Jenis Kelamin :","Masukkan Data",JOptionPane.QUESTION_MESSAGE);
        x = JOptionPane.showInputDialog(null,"Tinggi Badan : ","Masukkan Data",JOptionPane.QUESTION_MESSAGE);
        tinggi = Double.parseDouble(x);
            
        System.out.println("Nama kamu adalah " + nama);    
        System.out.println("Umur kamu " + umur + " tahun");
        System.out.println("Jenis kelamin " + jenisKelamin);
        System.out.println("Tinggi badan kamu " + tinggi + " centimeter");

        JOptionPane.showMessageDialog(null,"Wah, Ujicoba error dong!","Error gais",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,"JAVA itu tangguh!","Pemberitahuan gais",JOptionPane.INFORMATION_MESSAGE);

















    }
    
}
