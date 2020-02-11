/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri06TebakUltah;

import java.util.*;
import javax.swing.*;

public class Mandiri06TebakUltah {
    protected static Scanner inputUser = new Scanner (System.in);
    public static void main(String[] MbahPutih) {
        String hari_1,hari_2,hari_3,hari_4,hari_5,bulan_1,bulan_2,bulan_3,bulan_4,tahun_1,tahun_2,tahun_3,statusBulan = null,statusTahun = null;
        int hari = 0,bulan = 0,tahun = 0,jawab;
        System.out.println("======== AYO MAIN TEBAK-TEBAKAN ULANG TAHUN ========");
        System.out.print("\n");

        /* BAGIAN TAHUN */
        System.out.println("------ SET 1 ------");
        hari_1 = "1   3   5   7 \n" +
                "9   11  13  15 \n" +
                "17  19  21  23 \n" +
                "25  27  29  31 \n";
        System.out.println(hari_1);
            jawab = JOptionPane.showConfirmDialog(null,"Apakah tanggal ultah kamu ada pada angka-angka berikut? \n" + hari_1,"Ayo main tebak-tebakan",JOptionPane.YES_NO_CANCEL_OPTION);
//        jawab = inputUser.next().charAt(0); inputUser.nextLine();
        if (jawab == JOptionPane.YES_OPTION){
            hari +=1;
        }

        System.out.println("\n------ SET 2 ------");
        hari_2 = "2   3   6   7 \n" +
                "10  11  14  15 \n" +
                "18  19  22  23 \n" +
                "26  27  30  31 \n";
        System.out.println(hari_2);
        jawab = JOptionPane.showConfirmDialog(null,"Apakah tanggal ultah kamu ada pada angka-angka berikut? \n" + hari_2,"Ayo main tebak-tebakan",JOptionPane.YES_NO_CANCEL_OPTION);
//        jawab = inputUser.next().charAt(0); inputUser.nextLine();
        if (jawab == JOptionPane.YES_OPTION){
            hari += 2;
        }

        System.out.println("\n------ SET 3 ------");
        hari_3 = "4   5   6   7 \n" +
                "12  13  14  15 \n" +
                "20  21  22  23 \n" +
                "28  29  30  31 \n";
        System.out.println(hari_3);
        jawab = JOptionPane.showConfirmDialog(null,"Apakah tanggal ultah kamu ada pada angka-angka berikut? \n" + hari_3,"Ayo main tebak-tebakan",JOptionPane.YES_NO_CANCEL_OPTION);
//        jawab = inputUser.next().charAt(0); inputUser.nextLine();
        if (jawab == JOptionPane.YES_OPTION) {
            hari += 4;
        }

        System.out.println("\n------ SET 4 ------");
        hari_4 = "8   9   10  11 \n" +
                "12  13  14  15 \n" +
                "24  25  26  27 \n" +
                "28  29  30  31 \n";
        System.out.println(hari_4);
        jawab = JOptionPane.showConfirmDialog(null,"Apakah tanggal ultah kamu ada pada angka-angka berikut? \n" + hari_4,"Ayo main tebak-tebakan",JOptionPane.YES_NO_CANCEL_OPTION
        );
//        jawab = inputUser.next().charAt(0); inputUser.nextLine();
        if (jawab == JOptionPane.YES_OPTION){
            hari += 8;
        }

        System.out.println("\n------ SET 5 ------");
        hari_5 = "16  17  18  19 \n" +
                "20  21  22  23 \n" +
                "24  25  26  27 \n" +
                "28  29  30  31 \n";
        System.out.println(hari_5);
        jawab = JOptionPane.showConfirmDialog(null,"Apakah tanggal ultah kamu ada pada angka-angka berikut? \n" + hari_5,"Ayo main tebak-tebakan",JOptionPane.YES_NO_CANCEL_OPTION);
//        jawab = inputUser.next().charAt(0); inputUser.nextLine();
        if (jawab == JOptionPane.YES_OPTION){
            hari += 16;
        }

        if (hari != 0) {
            JOptionPane.showMessageDialog(null, "Wah, ternyata tanggal ultah kamu adalah tanggal " + hari, "Pemberitahuan penting nih!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Wah error nih wkwk!!!","Error gais",JOptionPane.ERROR_MESSAGE);
        }
        //        System.out.printf("\nTanggal ulang tahun kamu adalah %d \n",hari);

        /* BAGIAN BULAN */
        System.out.println("\n------ SET 1 ------");
        bulan_1 = "1   3   5 \n" +
                  "7   9  11 ";
        System.out.println(bulan_1);
        jawab = JOptionPane.showConfirmDialog(null,"Apakah bulan kelahiran kamu ada pada angka-angka berikut? \n" + bulan_1,"Ayo main tebak-tebakan",JOptionPane.YES_NO_CANCEL_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            bulan += 1;
        }

        System.out.println("\n------ SET 2 ------");
        bulan_2 = "2   3   6 \n" +
                  "7  10  11";
        System.out.println(bulan_2);
        jawab = JOptionPane.showConfirmDialog(null,"Apakah bulan kelahiran kamu ada pada angka-angka berikut? \n" + bulan_2,"Ayo main tebak-tebakan",JOptionPane.YES_NO_CANCEL_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            bulan += 2;
        }

        System.out.println("\n------ SET 3 ------");
        bulan_3 = "4   5   6 \n" +
                  "7  12";
        System.out.println(bulan_3);
        jawab = JOptionPane.showConfirmDialog(null,"Apakah bulan kelahiran kamu ada pada angka-angka berikut? \n" + bulan_3,"Ayo main tebak-tebakan",JOptionPane.YES_NO_CANCEL_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            bulan += 4;
        }

        System.out.println("\n------ SET 4 ------");
        bulan_4 = "8   9  10 \n" +
                  "11  12";
        System.out.println(bulan_4);
        jawab = JOptionPane.showConfirmDialog(null,"Apakah bulan kelahiran kamu ada pada angka-angka berikut \n" + bulan_4,"Ayo main tebak-tebakan",JOptionPane.YES_NO_CANCEL_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            bulan += 8;
        }

        switch (bulan) {
            case 1 :
                statusBulan = "Januari";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2 :
                statusBulan = "Februari";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3 :
                statusBulan = "Maret";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4 :
                statusBulan = "April";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5 :
                statusBulan = "Mei";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6 :
                statusBulan = "Juni";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 7 :
                statusBulan = "Juli";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 8 :
                statusBulan = "Agustus";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 9 :
                statusBulan = "September";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 10 :
                statusBulan = "Oktober";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 11 :
                statusBulan = "November";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 12 :
                statusBulan = "Desember";
                JOptionPane.showMessageDialog(null,"Wah, ternyata kamu lahir pada bulan " + statusBulan,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Horeee error!!!","Wah error nih",JOptionPane.ERROR_MESSAGE);
        }

        /* BAGIAN TAHUN */
        System.out.println("\n------ SET 1 ------");
        tahun_1 = "1996   1998 \n" +
                  "2000   2002";
        System.out.println(tahun_1);
        jawab = JOptionPane.showConfirmDialog(null,"Apakah tahun kelahiranmu ada pada angka-angka berikut? \n" + tahun_1,"Ayo main tebak-tebakan",JOptionPane.YES_NO_CANCEL_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            tahun += 1;
        }

        System.out.println("\n------ SET 2 ------");
        tahun_2 = "1997   1998 \n" +
                  "2001   2002";
        System.out.println(tahun_2);
        jawab = JOptionPane.showConfirmDialog(null,"Apakah tahun kelahiranmu ada pada angka-angka berikut? \n" + tahun_2,"Ayo main tebak-tebakan", JOptionPane.YES_NO_CANCEL_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            tahun += 2;
        }

        System.out.println("\n------ SET 3 ------");
        tahun_3 = "1999   2000 \n" +
                  "2001   2002";
        jawab = JOptionPane.showConfirmDialog(null,"Apakah tahun kelahiranmu ada pada angka-angka berikut? \n" + tahun_3,"Ayo main tebak-tebakan", JOptionPane.YES_NO_CANCEL_OPTION);
        if (jawab == JOptionPane.YES_OPTION) {
            tahun += 4;
        }

        switch (tahun) {
            case 1 :
                statusTahun = "1996";
                JOptionPane.showMessageDialog(null,"Wah, ternyata tahun kelahiran kamu " + statusTahun,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2 :
                statusTahun = "1997";
                JOptionPane.showMessageDialog(null,"Wah, ternyata tahun kelahiran kamu " + statusTahun,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3 :
                statusTahun = "1998";
                JOptionPane.showMessageDialog(null,"Wah, ternyata tahun kelahiran kamu " + statusTahun,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4 :
                statusTahun = "1999";
                JOptionPane.showMessageDialog(null,"Wah, ternyata tahun kelahiran kamu " + statusTahun,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5 :
                statusTahun = "2000";
                JOptionPane.showMessageDialog(null,"Wah, ternyata tahun kelahiran kamu " + statusTahun,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6 :
                statusTahun = "2001";
                JOptionPane.showMessageDialog(null,"Wah, ternyata tahun kelahiran kamu " + statusTahun,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 7 :
                statusTahun = "2002";
                JOptionPane.showMessageDialog(null,"Wah, ternyata tahun kelahiran kamu " + statusTahun,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Horeee error!!!","Wah error nih",JOptionPane.ERROR_MESSAGE);
        }

        if (hari != 0 && bulan != 0 && tahun != 0) {
            JOptionPane.showMessageDialog(null,"Berarti kamu ulang tahun pada " + hari + " " + statusBulan + " " + statusTahun,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Engga ada yang bisa ditampilkan dikarenakan error hehe","Error gais",JOptionPane.ERROR_MESSAGE);
        }
    }
}