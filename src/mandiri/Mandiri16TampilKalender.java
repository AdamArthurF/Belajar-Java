package mandiri;

import java.util.*;

public class Mandiri16TampilKalender {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int tahun,bulan;

        System.out.print("Masukkan tahun = ");
        tahun = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan bulan (1 s.d 12) = ");
        bulan = inputUser.nextInt(); inputUser.nextLine();

        tampilBulan(tahun,bulan);
    }

    private static boolean apaTahunLeap(int tahun){
        return (tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0));
    }

    private static int jumlahHariDalamSebulan(int tahun,int bulan){
        if (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8 || bulan == 10 || bulan == 12)
            return 31;
        if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11)
            return 30;
        if (bulan == 2) return apaTahunLeap(tahun) ? 29 : 28;

        return 0;
    }

    private static int totalJumlahHari(int tahun,int bulan){
        int total = 0;

        for (int i = 1800; i < tahun; i++)
            if (apaTahunLeap(i))
                total = total + 366;
            else
                total = total + 365;
        for (int i = 1; i < bulan; i++)
            total = total + jumlahHariDalamSebulan(tahun,i);
        return total;
    }

    private static int hariMulai(int tahun,int bulan) {
        final int HARI_MULAI_JAN_1_1800 = 3;
        int totalJumlahHari = totalJumlahHari(tahun, bulan);

        return (totalJumlahHari + HARI_MULAI_JAN_1_1800) % 7;
    }

    private static String namaBulan(int bulan){
        String namaBulan = " ";

        switch (bulan) {
            case 1 :
                namaBulan = "Januari";
                break;
            case 2 :
                namaBulan = "Februari";
                break;
            case 3 :
                namaBulan = "Maret";
                break;
            case 4 :
                namaBulan = "April";
                break;
            case 5 :
                namaBulan = "Mei";
                break;
            case 6 :
                namaBulan = "Juni";
                break;
            case 7 :
                namaBulan = "Juli";
                break;
            case 8 :
                namaBulan = "Agustus";
                break;
            case 9 :
                namaBulan = "September";
                break;
            case 10 :
                namaBulan = "Oktober";
                break;
            case 11 :
                namaBulan = "November";
                break;
            case 12 :
                namaBulan = "Desember";
        }

        return namaBulan;
    }

    private static void tubuhBulan(int tahun,int bulan){
        int hariMulai = hariMulai(tahun, bulan);
        int jumlahHariDalamSebulan = jumlahHariDalamSebulan(tahun,bulan);

        for (int i = 0;i < hariMulai;i++) {
            System.out.print("      ");
        }
        for (int  i = 1;i <= jumlahHariDalamSebulan;i++) {
            System.out.printf("%6d",i);

            if ((i + hariMulai) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    private static void judulBulan(int tahun,int bulan){
        System.out.println("               " + namaBulan(bulan) + " " + tahun);
        System.out.println("_______________________________________________");
        System.out.println("  Minggu Senin Selasa Rabu Kamis Jum'at Sabtu  ");
    }

    private static void tampilBulan(int tahun,int bulan){
        judulBulan(tahun, bulan);
        tubuhBulan(tahun, bulan);
    }
}