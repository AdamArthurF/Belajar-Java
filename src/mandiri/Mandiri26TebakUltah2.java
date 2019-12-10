package mandiri;

import javax.swing.*;
import java.util.*;

public class Mandiri26TebakUltah2 {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int jumlahHari = 0,jumlahBulan = 0,jumlahTahun = 0,n = 1;
        String jawaban,statusBulan = null,statusTahun = null;

        int[][][] tanggal = {
                {       {1,3,5,7},
                        {9,11,13,15},
                        {17,19,21,23},
                        {25,27,29,31}       },
                {       {2,3,6,7},
                        {10,11,14,15},
                        {18,19,22,23},
                        {26,27,30,31}       },
                {       {4,5,6,7},
                        {12,13,14,15},
                        {20,21,22,23},
                        {28,29,30,31}       },
                {       {8,9,10,11},
                        {12,13,14,15},
                        {24,25,26,27},
                        {28,29,30,31}       },
                {       {16,17,18,19},
                        {20,21,22,23},
                        {24,25,26,27},
                        {28,29,30,31}
                }
        };

        int[][][] bulan = {
                {{1,3,5},
                 {7,9,11}},
                {{2,3,6},
                 {7,10,11}},
                {{4,5,6},
                 {7,12,13}},
                {{8,9,10},
                 {11,12,13}}
        };

        int[][][] tahun = {
                {{1996,1998},
                 {2000,2002}},
                {{1997,1998},
                 {2001,2002}},
                {{1999,2000},
                 {2001,2002}}
        };

        /*  BAGIAN TANGGAL    */
        for (int i = 0;i < 5;i++) {
            clearScreen();
            System.out.println("====== SELAMAT DATANG DI PROGRAM TEBAK ULANG TAHUN ======");
            System.out.println("\nApakah tanggal ultah kamu ada pada angka-angka berikut? (Y/N)\n");
            for (int j = 0; j < 4; j++) {
                for (int k = 0;k < 4;k++) {
                    System.out.printf("%4d",tanggal[i][j][k]);
                }
                System.out.println("\n");
            }
            System.out.print("--> ");
            jawaban = inputUser.nextLine();
            if (jawaban.equals("Y") || jawaban.equals("y")) {
                jumlahHari += tanggal[i][0][0];
            }
            while (!jawaban.equalsIgnoreCase("Y") && !jawaban.equalsIgnoreCase("N")) {
                System.out.println("Wahh salah input wkwk!! \n");
                System.out.print("--> ");
                jawaban = inputUser.nextLine();
            }
        }
        if (jumlahHari != 0) {
            JOptionPane.showMessageDialog(null, "Wah, ternyata tanggal ultah kamu adalah tanggal " + jumlahHari, "Pemberitahuan penting nih!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Horee error wkwk!!!","Error gais",JOptionPane.ERROR_MESSAGE);
        }

        /*  BAGIAN BULAN    */
        for (int i= 0;i < 4;i++) {
            clearScreen();
            System.out.println("====== SELAMAT DATANG DI PROGRAM TEBAK ULANG TAHUN ======");
            System.out.println("\nApakah bulan kelahiran kamu ada pada angka-angka berikut? (Y/N)\n");
            for (int j = 0;j < 2;j++) {
                for (int k = 0;k < 3;k++) {
                    System.out.printf("%4d",bulan[i][j][k]);
                }
                System.out.println("\n");
            }
            System.out.print("--> ");
            jawaban = inputUser.nextLine();
            if (jawaban.equals("Y") || jawaban.equals("y")) {
                jumlahBulan += bulan[i][0][0];
            }
            while (!jawaban.equalsIgnoreCase("Y") && !jawaban.equalsIgnoreCase("N")) {
                System.out.println("Wahh salah input wkwk!! \n");
                System.out.print("--> ");
                jawaban = inputUser.nextLine();
            }
        }
        switch (jumlahBulan) {
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

        /*  BAGIAN TAHUN    */
        for (int i = 0;i < 3;i++) {
            clearScreen();
            System.out.println("====== SELAMAT DATANG DI PROGRAM TEBAK ULANG TAHUN ======");
            System.out.println("\nApakah bulan kelahiran kamu ada pada angka-angka berikut? (Y/N)\n");
            for (int j = 0;j < 2;j++) {
                for (int k = 0;k < 2;k++) {
                    System.out.printf("%8d",tahun[i][j][k]);
                }
                System.out.println("\n");
            }
            System.out.print("--> ");
            jawaban = inputUser.nextLine();
            if (jawaban.equals("Y") || jawaban.equals("y")) {
                jumlahTahun += n;
            }
            n *= 2;
            while (!jawaban.equalsIgnoreCase("Y") && !jawaban.equalsIgnoreCase("N")) {
                System.out.println("Wahh salah input wkwk!! \n");
                System.out.print("--> ");
                jawaban = inputUser.nextLine();
            }
        }
        switch (jumlahTahun) {
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

        JOptionPane.showMessageDialog(null,"Berarti kamu ulang tahun pada " + jumlahHari + " " + statusBulan + " " + statusTahun,"Pemberitahuan penting nih",JOptionPane.INFORMATION_MESSAGE);
    }

    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex) {
            System.out.println("Wah engga bisa clear screen gais");
        }
    }
}