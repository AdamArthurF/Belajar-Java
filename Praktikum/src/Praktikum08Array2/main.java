/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum08Array2;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
//        int[] contohArray = new int[6];
//
//        contohArray[0] = 10;
//        contohArray[1] = 20;
//        contohArray[2] = 30;
//        contohArray[3] = 40;
//        contohArray[4] = 50;
//        contohArray[5] = 60;
//
//        System.out.println("Elemen array indeks ke-0 : " + contohArray[0]);
//        System.out.println("Elemen array indeks ke-1 : " + contohArray[1]);
//        System.out.println("Elemen array indeks ke-2 : " + contohArray[2]);
//        System.out.println("Elemen array indeks ke-3 : " + contohArray[3]);
//        System.out.println("Elemen array indeks ke-4 : " + contohArray[4]);
//        System.out.println("Elemen array indeks ke-5 : " + contohArray[5]);

//        String[] namaNabi = {"Nuh", "Ibrahim", "Musa", "Isa", "Muhammad"};
//        for (int i = 0;i < namaNabi.length; i++) {
//            System.out.println("Indeks ke-" + i + " = " + namaNabi[i]);
//        }
//        String[] nabi = new String[5];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < nabi.length; i++) {
//            System.out.print("Masukkan nama nabi yang anda ketahui : " + i + " : ");
//            nabi[i] = scanner.nextLine();
//        }
//        System.out.println("----------------------------------------");
//        for (String n : nabi) {
//            System.out.println(n);
//        }
//        int[] nomer = {70, 20, 35, 10, 25, 60};
//        System.out.println("\nSebelum diurutkan =========");
//        for (int x : nomer) {
//            System.out.println(x + " ");
//        }
//        Arrays.sort(nomer);
//        System.out.println("\nSetelah diurutkan =========");
//        for (int x : nomer) {
//            System.out.println(x + " ");
//        }

//        int[] angka = {1, 2, 3, 4, 5, 6};
//        int[] angka2 = {1, 2, 3, 4, 5, 6};
//        int[] angka3 = {1, 2, 3, 4};
//        System.out.println("Array 1 sama dengan Array 2 ?? " + Arrays.equals(angka, angka2));
//        System.out.println("Array 2 sama dengan Array 3 ?? " + Arrays.equals(angka, angka3));

//        String[][] Mahasiswa = {
//                {"Ahmad", "M3117032"},
//                {"Ibrahim", "M3117033"},
//                {"Umar", "M3117034"},
//        };
//        for (int i = 0; i < Mahasiswa.length; i++) {
//            System.out.println("Nama : " + Mahasiswa[i][0]);
//            System.out.println("NIM  : " + Mahasiswa[i][1]);
//            System.out.println("-------------------------");
//        }

        int[] Data = {21, 6, 18, 29, 7, 10, 14, 11};

        // Sorting array
        for (int i = 0; i < Data.length; i++) {
            for (int j = 0; j < Data.length - 1; j++) {
                if (Data[j] > Data[j + 1]) {
                    int temp = Data[j];
                    Data[j] = Data[j + 1];
                    Data[j + 1] = temp;
                }
            }
        }
        System.out.println("1. Hasil sorting = " + Arrays.toString(Data));

        // Menghitung rata-rata
        double a = 0, total = 0;
        for (int elemen : Data) {
            a++;
            total = total + elemen;
        }
        double rataRata = total / a;
        System.out.println("2. Hasil rata-rata = " + rataRata);

        // Data minimum dan maksimum
        for (int i = 0; i < Data.length; i++) {
            for (int j = 0; j < Data.length - 1; j++) {
                if (Data[j] > Data[j + 1]) {
                    int temp = Data[j];
                    Data[j] = Data[j + 1];
                    Data[j + 1] = temp;
                }
            }
        }
        int minimal = Data[0];
        int maksimal = Data[Data.length - 1];
        System.out.println("3. Nilai minimal = " + minimal +  ", Nilai maksimal = " + maksimal);

        // Menampilkan elemen yang termasuk bilangan ganjil
        int indeks = 0;
        int jumlah_ganjil = 0;
        for (int elemen : Data) {
            if (elemen % 2 == 1) {
                jumlah_ganjil++;
            }
        }

        int[] ganjil = new int[jumlah_ganjil];
        for (int elemen : Data) {
            if (elemen % 2 == 1) {
                ganjil[indeks] = elemen;
                indeks++;
            }
        }
        System.out.println("4. Elemen bilangan ganjil pada array = " + Arrays.toString(ganjil));

        // Menampilkan elemen yang termasuk bilangan prima
        boolean status;
        int jumlah_prima = 0;
        for (int elemen : Data) {
            status = true;
            for (int pembagi = 2; pembagi <= (elemen / 2); pembagi++) {
                if (elemen % pembagi == 0) {
                    status = false;
                    break;
                }
            }
            if (status) {
             jumlah_prima++;
            }
        }
        int[] prima = new int[jumlah_prima];
        indeks = 0;
        for (int elemen : Data) {
            status = true;
            for (int pembagi = 2; pembagi <= (elemen / 2); pembagi++) {
                if (elemen % pembagi == 0) {
                    status = false;
                    break;
                }
            }
            if (status) {
                prima[indeks] = elemen;
                indeks++;
            }
        }
        System.out.println("5. Elemen bilangan prima pada array = " + Arrays.toString(prima));

        String[][] rukunIman = {
                {"Allah","Beriman dengan wujud Allah\n" +
                        "Beriman dengan rububiyah Allah. Beriman dengan uluhiyah\n" +
                        "Allah. Beriman dengan nama-nama dan sifat-sifat Allah"},
                {"Malaikat","Beriman dengan keberadaan para malaikat Allah. Mengimani\n" +
                        "secara rinci nama-nama malaikat yang kita ketahui, dan\n" +
                        "mengimani secara global yang tidak kita ketahui. Mengimani\n" +
                        "secara rinci sifat-sifat mereka yang kita ketahui, dan\n" +
                        "mengimani secara global yang tidak kita ketahui. Mengimani\n" +
                        "secara rinci. tugas-tugas mereka yang kita ketahui, dan\n" +
                        "mengimani secara global yang tidak kita ketahui."},
                {"Kitabullah","Mengimanai bahwa seluruh kitab berasal dari Allah. Mengimani\n" +
                        "secara rinci nama-nama kitab Allah yang kita ketahui dan\n" +
                        "mengimani secara global yang tidak kita ketahui. Membenarkan\n" +
                        "berita-berita yang terdapat dalam kitab-kitab tersebut.\n" +
                        "Beramal dengan hukum-hukum yang ada di dalamnya selama belum\n" +
                        "dihapus"},
                {"Rasul","Mengimani bahwa seluruh risalah para rasul berasal dari Allah.\n" +
                        "Mengimani secra rinci nama para nabi dan rasul Allah yang kita\n" +
                        "ketahui dan mengimani secara global yang tidak kita ketahui.\n" +
                        "Membenarkan berita yang shahih yang datang dari mereka.\n" +
                        "Beramal dengan syariat Rasul yang diutus kepada kita (yaitu\n" +
                        "Muhammad shalallhu ‘alaihi wa sallam)."},
                {"Kiamat","Beriman dengan hari kebangkitan. Beriman dengan hari\n" +
                        "perhitungan dan pembalasan (al hisaab wal jazaa’). Beriman\n" +
                        "dengan surga dan neraka. Beriman dengan segala sesuatu yang\n" +
                        "terjadi setelah kematian."},
                {"Takdir","Beriman bahwasanya Allah mengetahui segala sesuatu yang\n" +
                        "terjadi. Beriman bahwasanya Allah telah menetapkan segala\n" +
                        "sesuatu di Lauh mahfudz. Beriman bahwa segala sesuatu terjadi\n" +
                        "dengan kehendak Allah. Beriman bahwa segala sesuatu yang\n" +
                        "terjadi merupakan makhluk Allah."}
        };

        Scanner inputUser = new Scanner(System.in);
        String input;
        System.out.print("Sebutkan rukun iman yang anda ketahui : ");
        input = inputUser.nextLine();

        for (String[] elemen : rukunIman) {
            if (elemen[0].equals(input)) {
                System.out.println(elemen[1]);
            }
        }
    }
}
