/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Tugas43CRUD;

import java.io.*;
import java.util.*;
import java.time.*;
import javax.swing.*;

public class Tugas43CRUD {

    public static void main(String[] MbahPutih) throws IOException {
        Scanner inputUser = new Scanner(System.in);
        String pilihanUser;
        boolean lanjutkan = true;

        clearScreen();
        sistemLogin();
        while (lanjutkan) {
            clearScreen();
            System.out.println("====== DATABASE INVENTARIS GUDANG UNIVERSITAS SEBELAS MARET =======\n");
            System.out.println("1.\tList Seluruh Barang");
            System.out.println("2.\tSearch Barang");
            System.out.println("3.\tBarang Masuk");
            System.out.println("4.\tBarang Keluar");
            System.out.println("5.\tData Supplier");
            System.out.println("6.\tData Peminjam");
            System.out.println("7.\tUpdate Barang");
            System.out.println("8.\tDelete Barang");

            System.out.print("\nPilihan kamu : ");
            pilihanUser = inputUser.nextLine();

            switch (pilihanUser) {
                case "1" :
                    System.out.print("\n");
                    System.out.println("                                ==============================");
                    System.out.println("                                ====== LIST DATA BARANG ======");
                    System.out.println("                                ==============================\n");
                    listBarang();
                    break;
                case "2" :
                    System.out.print("\n");
                    System.out.println("                                ===========================");
                    System.out.println("                                ====== SEARCH BARANG ======");
                    System.out.println("                                ===========================\n");
                    searchData();
                    break;
                case "3" :
                    System.out.print("\n");
                    System.out.println("                                ==========================");
                    System.out.println("                                ====== BARANG MASUK ======");
                    System.out.println("                                ==========================\n");
                    barangMasuk();
                    break;
                case "4" :
                    System.out.print("\n");
                    System.out.println("                                ===========================");
                    System.out.println("                                ====== BARANG KELUAR ======");
                    System.out.println("                                ===========================\n");
                    barangKeluar();
                    break;
                case "5" :
                    System.out.print("\n");
                    System.out.println("                                ===========================");
                    System.out.println("                                ====== DATA SUPPLIER ======");
                    System.out.println("                                ===========================\n");
                    dataSupplier();
                    break;
                case "6" :
                    System.out.print("\n");
                    System.out.println("                                =============================");
                    System.out.println("                                ====== DATA PEMINJAMAN ======");
                    System.out.println("                                =============================\n");
                    dataPeminjaman();
                    break;
                case "7" :
                    System.out.print("\n");
                    System.out.println("                                ===========================");
                    System.out.println("                                ====== UPDATE BARANG ======");
                    System.out.println("                                ===========================\n");
                    updateBarang();
                    break;
                case "8" :
                    System.out.print("\n");
                    System.out.println("                                ===========================");
                    System.out.println("                                ====== DELETE BARANG ======");
                    System.out.println("                                ===========================\n");
                    deleteBarang();
                    break;
                default :
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih 1 s.d 8");
                    JOptionPane.showMessageDialog(null,"Input anda tidak ditemukan\nSilahkan pilih 1 s.d 5","Wah error nih",JOptionPane.ERROR_MESSAGE);
            }
            lanjutkan = GET_YES_OR_NO("Apakah anda ingin melanjutkan?"); // Sebagai konfirmasi
        }
    }

    // Operasi
    public static void listBarang() throws IOException{
        FileReader fileInput;
        BufferedReader bufferInput;

        // Kita cek file database nya (inventory.txt) ada atau tidak
        try {
            fileInput = new FileReader("inventory.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Database tidak ditemukan!!!","Wah error nih",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Silakan tambah data terlebih dahulu","Pemberitahuan Penting",JOptionPane.INFORMATION_MESSAGE);
            barangMasuk();
            return;
        }

        // Kita buat header nya secara manual
        System.out.print("________________________________________________________________________________________________");
        System.out.println("\n| No |\tTahun |\tJenis Barang\t|      Merk     |             Seri Barang            |  Stok  |");
        System.out.println("------------------------------------------------------------------------------------------------");

        String data = bufferInput.readLine(); // Akan memulai pembacaaan file di baris pertama
        int nomor = 0;

        while (data != null){ // Jika data tidak kosong, maka kita baca isi nya
            nomor++;
            StringTokenizer masukan = new StringTokenizer(data, ","); // Membaca per kata di baris pertama

            masukan.nextToken(); // Kita skip bagian primary keys nya
            masukan.nextToken(); // Kita skip bagian supplier nya
            String nomer = String.format("| %2d ",nomor); // Kita tambahkan nomor secara manual
            String stok = String.format("|   %-5s|",masukan.nextToken()); // Bagian stok barang
            String tahun = String.format("|\t%4s  ",masukan.nextToken()); // Bagian tahun
            String jenisBarang = String.format("|\t%-16s",masukan.nextToken()); // Bagian jenis barang
            String Merk = String.format("|     %-10s",masukan.nextToken()); // Bagian merk barang
            String Seri = String.format("| %-35s",masukan.nextToken()); // Bagian seri barang
            System.out.println(nomer + tahun + jenisBarang + Merk + Seri + stok); // Mencetak data keseluruhan

            data = bufferInput.readLine(); // Akan memulai pembacaan file di baris selanjutnya
        }
        System.out.println("------------------------------------------------------------------------------------------------");
    }

    public static void searchData() throws IOException{
        Scanner inputUser = new Scanner(System.in);

        // Mengecek database kita (inventory.txt) ada atau tidak
        try {
            File file = new File("inventory.txt"); // Untuk mengecek file kita ada atau tidak
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Database tidak ditemukan!!!","Wah error nih!",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Silakan tambah data terlebih dahulu","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
            barangMasuk();
            return;
        }

        // Kita ambil inputan keyword dari user
        System.out.print("Masukkan kata kunci untuk mencari barang : ");
        String cariString = inputUser.nextLine();
        String[] kataKunci = cariString.split("\\s+"); // Kita ubah menjadi Array  dengan tipe data String

        // Kita cek keyword di database
        cekBarangDiDatabase(kataKunci,true);
    }

    public static void barangMasuk() throws IOException{
        FileWriter fileOutput = new FileWriter("inventory.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // Mengambil input dari user untuk menambah data
        Scanner inputUser = new Scanner(System.in);
        String jawab, supplier, pilihJenis, jenis = null, merk, seri, tahun;
        int stok;

        /* Untuk barang masuk, ada 2 pilihan */
        System.out.println("A. Tambah barang baru");
        System.out.println("B. Tambah stok barang");
        System.out.print("--> ");
        jawab = inputUser.nextLine();
        while (!jawab.equalsIgnoreCase("A") && !jawab.equalsIgnoreCase("B")) {
            System.out.println("Maaf anda salah input! Silahkan coba lagi!");
            JOptionPane.showMessageDialog(null,"Maaf anda salah input! Silahkan coba lagi!","Error",JOptionPane.ERROR_MESSAGE);
            System.out.print("--> ");
            jawab = inputUser.nextLine();
        }

        // Menulis barang di database (inventory.txt)
        if (jawab.equalsIgnoreCase("A")){ // Jika kita memilih A
            System.out.print("Masukkan supplier : ");
            supplier = inputUser.nextLine();
            System.out.println("Jenis Barang : ");
            System.out.println("1. Elektronik");
            System.out.println("2. Transportasi");
            System.out.print("Masukkan jenis barang : ");
            pilihJenis = inputUser.nextLine();
            if (pilihJenis.equals("1")) {
                jenis = "Elektronik";
            } else if (pilihJenis.equals("2")) {
                jenis = "Transportasi";
            } else {
                System.out.println("Salah input! Tambah barang dibatalkan!");
                JOptionPane.showMessageDialog(null,"Salah input! Tambah barang dibatalkan!","Error",JOptionPane.ERROR_MESSAGE);
                return; // Keluar dari method
            }

            System.out.print("Masukan merk barang : ");
            merk = inputUser.nextLine();
            System.out.print("Masukan seri barang : ");
            seri = inputUser.nextLine();
            System.out.print("Masukan tahun barang (YYYY) : ");
            tahun = ambilTahun();
            System.out.print("Masukkan banyak nya barang : ");
            stok = inputUser.nextInt(); inputUser.nextLine();

            long nomorEntry = ambilEntry(merk, tahun) + 1; // Menciptakan nomorEntry

            String merkTanpaSpasi = merk.replaceAll("\\s+",""); // Kita hapus semua spasi
            String primaryKey = merkTanpaSpasi + "_" + tahun + "_" + nomorEntry;
            System.out.println("\n---- Data yang akan anda masukkan : ----");
            System.out.println("----------------------------------------");
            System.out.println("Primary key      : " + primaryKey);
            System.out.println("Supplier         : " + supplier);
            System.out.println("Tahun Barang     : " + tahun);
            System.out.println("Jenis Barang     : " + jenis);
            System.out.println("Merk Barang      : " + merk);
            System.out.println("Seri Barang      : " + seri);
            System.out.println("Banyaknya Barang : " + stok);

            boolean isTambah = GET_YES_OR_NO("Apakah anda ingin menambahkan data tersebut? "); // Sebagai konfirmasi
            if(isTambah){
                bufferOutput.write(primaryKey + "," + supplier + "," + stok + "," + tahun + "," + jenis + "," + merk + "," + seri);
                bufferOutput.newLine(); // Menciptakan baris baru (enter)
                bufferOutput.flush(); // Menuliskan di database (inventory.txt)
                System.out.println("Data barang berhasil ditambahkan!");
                JOptionPane.showMessageDialog(null,"Data barang berhasil ditambahkan!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                listBarang();
            }
        } else if (jawab.equalsIgnoreCase("B")){
            // Kita ambil file database nya (inventory.txt)
            File database = new File("inventory.txt");
            FileReader fileInput = new FileReader(database);
            BufferedReader bufferInput = new BufferedReader(fileInput);

            // Tampilkan data terlebih dahulu
            listBarang();
            System.out.print("Masukkan nomor barang yang akan ditambah stoknya : ");
            int nomor = inputUser.nextInt();

            String data = bufferInput.readLine(); // Akan mulai membaca file per baris
            String tahun2 = null,jenis2 = null,merk2 = null,seri2 = null;
            int nomorData = 0;
            while (data != null) {
                nomorData++;
                if (nomorData == nomor) {
                    StringTokenizer masukan = new StringTokenizer(data, ","); // Mulai membaca baris per kata
                    masukan.nextToken(); // Kita lewati bagian Primary keys nya
                    masukan.nextToken(); // Kita lewati bagian Supplier nya
                    masukan.nextToken(); // Kita lewati bagian Stok nya
                    tahun2 = masukan.nextToken(); // bagian tahun
                    jenis2 = masukan.nextToken(); // bagian jenis barang
                    merk2 = masukan.nextToken(); // bagian merk barang
                    seri2 = masukan.nextToken(); // bagian seri barang
                }
                data = bufferInput.readLine(); // Akan mulai membaca file di baris selanjutnya
            }
            if (nomor > nomorData) { // Jika nomor yang kita inputkan tidak sesuai dengan data
                JOptionPane.showMessageDialog(null,"Barang tidak ditemukan!","Error",JOptionPane.ERROR_MESSAGE);
                return; // Keluar dari method
            }
            System.out.print("Berapa jumlah yang akan ditambahkan : ");
            int stok2 = inputUser.nextInt();

            String[] keywords = {tahun2 + "," + jenis2 + "," + merk2 + "," + seri2};
            tambahStok(keywords,stok2);
            listBarang();
        }

        // Jangan lupa untuk menutup file
        bufferOutput.close(); // Menutup file
    }

    public static void barangKeluar() throws IOException{
        // Kita ambil file database original (inventory.txt)
        File database = new File("inventory.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);

        // Kita buat file database sementara (temporary.txt);
        File temporary = new File("temporary.txt");
        FileWriter fileOutput = new FileWriter(temporary);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // Tampilkan data terlebih dahulu
        System.out.println("-_-_-_-_- LIST BARANG -_-_-_-_-");
        listBarang();

        // Kita ambil input dari user
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nama peminjam : ");
        String peminjam = inputUser.nextLine();

        System.out.print("Masukkan nomor barang yang akan dipinjamkan : ");
        int nomorPinjam = inputUser.nextInt();

        // Mulai proses program
        String data = bufferInput.readLine(); // Akan mulai membaca file di baris pertama
        int entryCounts = 0;
        int stokAwal = 0;

        while (data != null) {
            entryCounts++;
            StringTokenizer masukan = new StringTokenizer(data, ","); // Hanya sebatas deklarasi

            // Jika entrycounts = nomorPinjam
            if (nomorPinjam == entryCounts) {
                System.out.print("Jumlah yang akan dipinjamkan : ");
                int jumlahPinjam = inputUser.nextInt();

                String[] fieldData = {"supplier", "stok", "tahun", "jenis", "merk", "seri"}; // Hanya sebagai parameter untuk jaga-jaga
                String[] tempData = new String[6]; // Kita ciptakan array kosong dengan length 6

                masukan = new StringTokenizer(data, ","); // Akan memulai membaca file di baris pertama
                String originalData = masukan.nextToken(); // Mulai membaca file per kata di baris pertama
                for (int i = 0;i < fieldData.length;i++) {
                    originalData = masukan.nextToken(); // Deklarasi untuk menyimpan data yang tidak di ubah
                    if (i == 1) { // Kita ubah di bagian stok barang nya
                        stokAwal = Integer.parseInt(originalData); // Mengubah string menjadi integer
                        tempData[i] = String.valueOf(stokAwal - jumlahPinjam); // Kurangi stok awal dengan jumlah pinjam
                    } else {
                        tempData[i] = originalData; // Selain bagian stok, data tidak kita ubah
                    }
                }

                if (stokAwal - jumlahPinjam <= 0) { // Jika barang yang kita pinjam melebihi stok yang ada
                    JOptionPane.showMessageDialog(null,"Stok tidak mencukupi! \nProses peminjaman dibatalkan!","Error",JOptionPane.ERROR_MESSAGE);
                    return; // Keluar dari method
                }
                tambahPeminjam(peminjam); // Jika tidak keluar dari method, kita masukkan nama peminjam ke method lain

                // Tampilkan data ke layar
                masukan = new StringTokenizer(data, ",");
                System.out.println("\n---- Barang yang akan anda pinjamkan : ----");
                System.out.println("-------------------------------------------");
                System.out.println("Primary key       : " + masukan.nextToken());
                System.out.println("Supplier          : " + masukan.nextToken());
                masukan.nextToken(); // Kita skip bagian stok nya
                System.out.println("Tahun Barang      : " + masukan.nextToken());
                System.out.println("Jenis Barang      : " + masukan.nextToken());
                System.out.println("Merk Barang       : " + masukan.nextToken());
                System.out.println("Seri Barang       : " + masukan.nextToken());
                System.out.println("Stok awal         : " + stokAwal);
                System.out.println("Dipinjamkan       : " + jumlahPinjam);
                System.out.println("Sisa stok         : " + tempData[1]);

                boolean isPinjam = GET_YES_OR_NO("Apakah anda ingin meminjamkan barang tersebut?");
                if (isPinjam) {
                    // Format data baru ke dalam database
                    String supplier = tempData[0]; // Bagian supplier
                    String stokBaru = tempData[1]; // Bagian stok baru
                    String tahun = tempData[2]; // Bagian tahun barang
                    String jenis = tempData[3]; // Bagian jenis barang
                    String merk = tempData[4]; // Bagian merk barang
                    String seri = tempData[5]; // Bagian seri barang

                    // Kita bikin primary keys nya
                    long nomorEntry = ambilEntry(merk, tahun);
                    String merkTanpaSpasi = merk.replaceAll("\\s+", "");
                    String primaryKey = merkTanpaSpasi + "_" + tahun + "_" + nomorEntry;

                    // Tulis data kedalam database sementara (temporary.txt)
                    bufferOutput.write(primaryKey + "," + supplier + "," + stokBaru + "," + tahun + "," + jenis + "," + merk + "," + seri);
                    JOptionPane.showMessageDialog(null,"Barang berhasil dipinjamkan!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                    listBarang();
                } else {
                    // Copy data
                    bufferOutput.write(data);
                }
            } else {
                // Copy data
                bufferOutput.write(data);
            }

            bufferOutput.newLine(); // Kita tambahkan enter
            data = bufferInput.readLine(); // Akan memulai membaca file di baris selanjutnya
        }
        if (nomorPinjam > entryCounts) { // Jika nomor barang yang ingin dipinjam tidak sesuai dengan data
            JOptionPane.showMessageDialog(null,"Barang tidak ditemukan! \nProses peminjaman dibatalkan!","Error",JOptionPane.ERROR_MESSAGE);
            return; // Keluar dari method
        }

        // Menulis data kedalam file temporary database (temporary.txt)
        bufferOutput.flush();

        // Kita delete original database (inventory.txt)
        database.delete();

        // Rename file temporary.txt menjadi inventory.txt
        temporary.renameTo(database);
    }

    public static void dataSupplier() throws IOException{
        // Kita ambil file database original (inventory.txt)
        File database = new File("inventory.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);

        // Kita buat file baru untuk data supplier (supplyInventory.txt)
        File dataSupplier = new File ("supplyInventory.txt");
        FileWriter fileOutput = new FileWriter(dataSupplier);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        ArrayList<String> supplierList = new ArrayList<>(); // Kita buat ArrayList untuk menyimpan data supplier sementara
        int indeks = 0;
        String data = bufferInput.readLine(); // Akan memulai membaca file di baris pertama
        Scanner dataScanner; // Kita gunakan Scanner untuk membaca baris pertama
        while (data != null) { // Ketika data memiliki isi/tidak kosong, maka kita baca isi dari data tersebut
            dataScanner = new Scanner(data); // Akan memulai membaca data
            dataScanner.useDelimiter(","); // Kita gunakan tanda koma sebagai pemisah pembacaan kalimat
            dataScanner.next(); // Kita lompati bagian primary keys nya
            supplierList.add(indeks,dataScanner.next()); // Kita masukkan supplier nya kedalam ArrayList
            indeks++;
            data = bufferInput.readLine(); // Akan memulai membaca file di baris selanjutnya
        }
        Collections.sort(supplierList); // Kita urut kan

        // Kita gunakan for di dalam for untuk menghapus indeks yang memiliki kesamaan isi dengan indeks yang lainnya
        for (int i = 0;i < supplierList.size();i++) {
            for (int j = 0; j < supplierList.size() - 1; j++) {
                if (supplierList.get(j).equals(supplierList.get(j + 1))) {
                    supplierList.remove(j); // Hapus indeks
                }
            }
        }
        indeks = 0;
        supplierList.trimToSize(); // Kita hapus indeks yang kosong

        // Kita tulis data supplier per indeks ke dalam (supplyInventory.txt)
        while (indeks < supplierList.size()) {
            bufferOutput.write(String.valueOf(supplierList.get(indeks)));
            bufferOutput.newLine();
            indeks++;
        }
        bufferOutput.flush(); // Tulis data
        bufferOutput.close();
        bufferInput.close();

        // Kita ambil file dataSupplier nya (dataSupplier.txt)
        File file = new File("supplyInventory.txt");
        FileReader fileInput2 = new FileReader(file);
        BufferedReader bufferInput2 = new BufferedReader(fileInput2);

        String data2 = bufferInput2.readLine();
        Scanner dataScanner2;
        int nomorData = 0;
        while (data2 != null) { // Ketika data memiliki isi dan tidak kosong, maka kita baca isinya
            nomorData++;
            dataScanner2 = new Scanner(data2); // Mulai kita baca baris pertama
            String nomor = String.format("%d.",nomorData); // Kita tambahkan nomor secara manual
            String supplier = String.format(" %-30s",dataScanner2.nextLine()); // Kita baca keseluruhan data di baris pertama
            System.out.println(nomor + supplier); // Kita cetak keseluruhan data di baris pertama
            data2 = bufferInput2.readLine(); // Akan memulai pembacaan file di baris selanjutnya
        }
    }

    public static void dataPeminjaman() throws IOException{
        // Kita ambil file data peminjam (pinjamInventory.txt)
        File dataPeminjam = new File("pinjamInventory.txt");
        FileReader fileInput = new FileReader(dataPeminjam);
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine(); // Akan kita baca file nya di baris pertama
        Scanner dataScanner; // Kita gunakan Scanner
        int nomorData = 0;
        while (data != null) { // Ketika data tidak kosong/memiliki isi, maka kita baca isi nya
            nomorData++;
            dataScanner = new Scanner(data); // Mulai kita baca baris pertama
            String nomor = String.format("%d.",nomorData); // Kita tambahkan nomor secara manual
            String peminjam = String.format(" %-30s",dataScanner.nextLine()); // Kita baca keseluruhan baris pertama
            System.out.println(nomor + peminjam);// Kita cetak keseluruhan data di baris pertama
            data = bufferInput.readLine(); // Akan memulai pembacaan file di baris selanjutnya
        }
    }

    public static void updateBarang() throws IOException{
        // Kita ambil file database original (inventory.txt)
        File database = new File("inventory.txt"); // Mengecek file kita ada atau tidak
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // Kita buat file database sementara (temporary.txt)
        File temporary = new File("temporary.txt"); // Mengecek file kita ada atau tidak
        FileWriter fileOutput = new FileWriter(temporary);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // Tampilkan data
        System.out.println("-_-_-_-_- LIST BARANG -_-_-_-_-");
        listBarang();

        // Kita ambil input dari user
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\nMasukan nomor barang yang akan diupdate : ");
        int updateNum = inputUser.nextInt();

        // Tampilkan data yang ingin diupdate
        String data = bufferedInput.readLine();
        int entryCounts = 0;

        while (data != null){ // Ketika data memiliki isi/tidak kosong, maka kita baca isi nya
            entryCounts++;
            StringTokenizer masukan = new StringTokenizer(data,","); // Memulai pembacaan file per kata

            // Tampilkan jika entrycounts == updateNum
            if (updateNum == entryCounts){
                System.out.println("\n------ Data yang akan anda update adalah : ------");
                System.out.println("--------------------------------------------------");
                System.out.println("Primary Keys   : " + masukan.nextToken()); // Bagian primary keys
                System.out.println("Supplier       : " + masukan.nextToken()); // Bagian supplier
                System.out.println("Stok Barang    : " + masukan.nextToken()); // Bagian stok barang
                System.out.println("Tahun Barang   : " + masukan.nextToken()); // Bagian tahun barang
                System.out.println("Jenis Barang   : " + masukan.nextToken()); // Bagian jenis barang
                System.out.println("Merk Barang    : " + masukan.nextToken()); // Bagian merk barang
                System.out.println("Seri Barang    : " + masukan.nextToken()); // Bagian seri barang

                // Update data dengan cara mengambil input dari user
                String[] fieldData = {"supplier","stok","tahun","jenis","merk","seri"};
                String[] tempData = new String[6];

                masukan = new StringTokenizer(data,","); // Kita refresh data
                String originalData = masukan.nextToken();
                for(int i=0; i < fieldData.length ; i++) {
                    originalData = masukan.nextToken();
                    if (i == 1){ // Kita lewati bagian stok nya
                        tempData[i] = originalData;
                        continue;
                    }

                    boolean isUpdate = GET_YES_OR_NO("Apakah anda ingin mengubah " + fieldData[i] + "?");
                    if (isUpdate){
                        // Mengambil input dari user
                        if (fieldData[i].equalsIgnoreCase("tahun")){
                            System.out.print("Masukkan tahun barang, format = (YYYY) : ");
                            tempData[i] = ambilTahun();
                        } else {
                            inputUser = new Scanner(System.in);
                            System.out.print("\nMasukkan " + fieldData[i] + " baru : ");
                            tempData[i] = inputUser.nextLine();
                        }
                    } else {
                        tempData[i] = originalData;
                    }
                }

                // Tampilkan data baru ke layar
                masukan = new StringTokenizer(data,",");
                masukan.nextToken(); // Kita skip bagian primary keys nya
                System.out.println("\n------- Data baru anda adalah : -----");
                System.out.println("-------------------------------------");
                System.out.println("Supplier Barang  : " + masukan.nextToken() + " --> " + tempData[0]);
                masukan.nextToken(); // Kita lompati bagian stok nya
                System.out.println("Tahun Barang     : " + masukan.nextToken() + " --> " + tempData[2]);
                System.out.println("Jenis Barang     : " + masukan.nextToken() + " --> " + tempData[3]);
                System.out.println("Merk Barang      : " + masukan.nextToken() + " --> " + tempData[4]);
                System.out.println("Seri Barang      : " + masukan.nextToken() + " --> " + tempData[5]);

                boolean isUpdate = GET_YES_OR_NO("Apakah anda yakin ingin mengupdate data tersebut");
                if (isUpdate){
                    // Cek data baru di database
                    boolean isExist = cekBarangDiDatabase(tempData,false);
                    if(isExist){
                        System.err.println("Data barang sudah ada di database, proses update dibatalkan, \nsilahkan delete data yang bersangkutan");
                        // Keseluruhan data tetap kita copy ke dalam temporary database (temporary.txt)
                        bufferedOutput.write(data);
                    } else {
                        // Format data baru ke dalam database
                        String supplier = tempData[0];
                        String stok = tempData[1];
                        String tahun = tempData[2];
                        String jenis = tempData[3];
                        String merk = tempData[4];
                        String seri = tempData[5];

                        // Kita bikin primary key lagi
                        long nomorEntry = ambilEntry(merk, tahun) + 1;
                        String merkTanpaSpasi = merk.replaceAll("\\s+","");
                        String primaryKey = merkTanpaSpasi + "_" + tahun + "_" + nomorEntry;

                        // Tulis data kedalam database sementara (temporary.txt)
                        bufferedOutput.write(primaryKey + "," + supplier + "," + stok + "," + tahun + "," + jenis + "," + merk + "," + seri);
                        System.out.println("Data barang berhasil diupdate!");
                        JOptionPane.showMessageDialog(null,"Data barang berhasil diupdate!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    // Copy data
                    bufferedOutput.write(data);
                }
            } else {
                // Copy data
                bufferedOutput.write(data);
            }
            bufferedOutput.newLine();
            data = bufferedInput.readLine(); // Memulai pembacaan file per kata di baris selanjutnya
        }

        // Menulis data kedalam file temporary database (temporary.txt)
        bufferedOutput.flush();

        // Kita delete original database (inventory.txt)
        database.delete();

        // Rename file temporary.txt menjadi inventory.txt
        temporary.renameTo(database);
    }

    public static void deleteBarang() throws IOException{
        // Kita ambil database original (inventory.txt)
        File database = new File("inventory.txt"); // Mengecek file kita ada atau tidak
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // Kita buat temporary database (temporary.txt)
        File temporary = new File("temporary.txt"); // Mengecek file kita ada atau tidak
        FileWriter fileOutput = new FileWriter(temporary);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // Tampilkan data
        System.out.println("-_-_-_-_- LIST BARANG -_-_-_-_-");
        listBarang();

        // Kita ambil input dari user untuk menghapus data
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\nMasukkan nomor barang yang akan dihapus : ");
        int deleteNum = inputUser.nextInt();

        // Looping untuk membaca data tiap baris dan skip data yang akan dihapus
        boolean isFound = false;
        int entryCounts = 0;
        String data = bufferedInput.readLine(); // Akan memulai pembacaan file di baris pertama

        while (data != null){ // Ketika data memiliki isi, maka kita baca data tersebut
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer masukan = new StringTokenizer(data,","); // Memulai pembacaan file per kata
            // Tampilkan terlebih dahulu data yang ingin di hapus
            if (deleteNum == entryCounts){
                System.out.println("\n------ Data yang ingin anda delete adalah : ------");
                System.out.println("--------------------------------------------------");
                System.out.println("Primary Keys   : " + masukan.nextToken()); // Bagian primary keys
                System.out.println("Supplier       : " + masukan.nextToken()); // Bagian supplier
                System.out.println("Stok Barang    : " + masukan.nextToken()); // Bagian stok barang
                System.out.println("Tahun Barang   : " + masukan.nextToken()); // Bagian tahun barang
                System.out.println("Jenis Barang   : " + masukan.nextToken()); // Bagian jenis barang
                System.out.println("Merk Barang    : " + masukan.nextToken()); // Bagian merk barang
                System.out.println("Seri Barang    : " + masukan.nextToken()); // Bagian seri barang

                isDelete = GET_YES_OR_NO("Apakah anda yakin untuk menghapus?");
                isFound = true;
            }
            if(isDelete){
                /* Data yang akan kita hapus tetap berada di database original (inventory.txt),
                 * sedangkan data yang lainnya kita pindahkan ke database sementara (temporary.txt) */
                System.out.println("Data barang berhasil dihapus!");
                JOptionPane.showMessageDialog(null,"Data barang berhasil dihapus!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
            } else {
                /* kita pindahkan semua data dari database original (inventory.txt)
                 * ke database sementara (temporary.txt) */
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }
        if(!isFound){
            System.err.println("Barang tidak ditemukan");
        }

        // Menuliskan data ke file database sementara (temporary.txt)
        bufferedOutput.flush();

        // Delete original file database (inventory.txt)
        database.delete();

        // Rename file temporary (temporary.txt) menjadi file database asli (inventory.txt)
        temporary.renameTo(database);
    }

    // Utility
    protected static boolean cekBarangDiDatabase(String[] kataKunci,boolean isDisplay) throws IOException {
        // Kita ambil file database inventory.txt
        FileReader fileInput = new FileReader("inventory.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine(); // Akan memulai pembacaan file di baris pertama
        boolean isExist = false; // isExist berfungsi sebagai status apakah keywords kita ada atau tidak
        int nomorData = 0;

        if (isDisplay) {
            System.out.print("________________________________________________________________________________________________");
            System.out.println("\n| No |\tTahun |\tJenis Barang\t|      Merk     |             Seri Barang            |  Stok  |");
            System.out.println("------------------------------------------------------------------------------------------------");
        }

        while (data != null) { // Ketika data memiliki isi, maka kita baca data tersebut
            // Cek keywords didalam baris
            isExist = true;
            for (String keyword : kataKunci) { // Looping for each
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
            // Jika keywordsnya cocok/true maka tampilkan
            if (isExist) {
                nomorData++;
                StringTokenizer masukan = new StringTokenizer(data, ","); // Membaca file per kata di baris  pertama

                masukan.nextToken(); // Kita skip bagian Primary Keys nya
                masukan.nextToken(); // Kita skip bagian Supplier nya
                String nomer = String.format("| %2d ", nomorData); // Kita tambahkan nomor secara manual
                String stok = String.format("|   %-5s|", masukan.nextToken()); // Bagian stok barang
                String tahun = String.format("|\t%4s  ", masukan.nextToken()); // Bagian tahun
                String jenisBarang = String.format("|\t%-16s", masukan.nextToken()); // Bagian jenis barang
                String Merk = String.format("|     %-10s", masukan.nextToken()); // Bagian merk barang
                String Seri = String.format("| %-35s", masukan.nextToken()); // Bagian seri barang

                if (isDisplay) {
                    System.out.println(nomer + tahun + jenisBarang + Merk + Seri + stok); // Mencetak data keseluruhan
                }
            }
            data = bufferInput.readLine(); // Akan memulai pembacaan file di baris selanjutnya
        }
        if (isDisplay) {
            System.out.println("------------------------------------------------------------------------------------------------");
        }
        return isExist;
    }

    protected static String ambilTahun(){
        Scanner inputUser = new Scanner(System.in);

        boolean tahunValid = false; // Sebagai status apakah tahunnya valid atau tidak
        String tahunInput = inputUser.nextLine();
        while(!tahunValid) {
            try {
                Year.parse(tahunInput); // Untuk mengecek apakah inputan tahun kita berupa 4 digit angka
                tahunValid = true;
            } catch (Exception ex) {
                System.out.println("Format tahun yang anda masukan salah (format = YYYY)");
                JOptionPane.showMessageDialog(null,"Format tahun yang anda masukan salah! (format = YYYY)","Error",JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null,"Silahkan masukkan tahun barang lagi!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                System.out.print("Silahkan masukkan tahun barang lagi : ");
                tahunValid = false;
                tahunInput = inputUser.nextLine();
            }
        }
        return tahunInput;
    }

    protected static long ambilEntry(String merk,String tahun) throws IOException{
        // Kita ambil file database inventory.txt
        FileReader fileInput = new FileReader("inventory.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String primaryKey;
        Scanner dataScanner; // Untuk membaca file per kalimat
        String data = bufferInput.readLine(); // Persiapan untuk membaca file di baris pertama

        while (data != null) {
            dataScanner = new Scanner(data); // Akan memulai pembacaan file di kalimat pertama
            dataScanner.useDelimiter(","); // Akan kita akhiri pembacaan file setelah bertemu tanda koma (,)
            primaryKey = dataScanner.next(); // Mulai pembacaan file di kalimat pertama
            dataScanner = new Scanner(primaryKey);  // Kita baca lagi hasil potongan kalimat nya
            dataScanner.useDelimiter("_"); // Dan akan kita akhiri pembacaan file setelah bertemu tanda underscore (_)

            merk = merk.replaceAll("\\s+",""); // Kita hapus semua spasi
            if (merk.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next()) ) {
                entry = dataScanner.nextInt();
            }
            data = bufferInput.readLine(); // Akan memulai pembacaan di baris selanjutnya
        }
        return entry;
    }

    public static int cekNomorDiDatabase(String[] kataKunci) throws IOException{
        FileReader fileInput = new FileReader("inventory.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine(); // Akan memulai pembacaan file di baris pertama
        boolean isExist = false;
        int count = 0;
        int nomorData = 0;
        while (data != null) { // Jika data memiliki isi/tidak kosong, maka kita baca isi nya
            count++;
            isExist = true;
            for (String keyword : kataKunci) { // Looping for each untuk search keyword
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
            if (isExist) { // Jika ketemu, maka kita ambil nomor data nya saja
                nomorData = count;
            }
            data = bufferInput.readLine(); // Akan memulai pembacaan file di baris selanjutnya
        }
        return nomorData;
    }

    public static void tambahStok(String[] kataKunci,int stok) throws IOException {
        // Kita ambil file database original (inventory.txt)
        File database = new File("inventory.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferInput = new BufferedReader(fileInput);

        // Kita buat file database sementara (temporary.txt)
        File temporary = new File("temporary.txt");
        FileWriter fileOutput = new FileWriter(temporary);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        String data = bufferInput.readLine(); // Akan memulai pembacaan file di baris pertama
        int stokNum = cekNomorDiDatabase(kataKunci); // Kita ambil nomor barang yang ingin ditambah stok nya
        int nomorData = 0;
        int stokAwal = 0;

        while (data != null) {
            nomorData++;
            StringTokenizer masukan = new StringTokenizer(data, ",");

            if (stokNum == nomorData) {
                String[] fieldData = {"Supplier","Stok","Tahun","Jenis","Merk","Seri"};
                String[] tempData = new String[6];

                masukan = new StringTokenizer(data, ","); // Kita baca file di baris pertama
                String originalData = masukan.nextToken(); // Skip bagian primary keys
                for (int i = 0;i < fieldData.length;i++) {
                    originalData = masukan.nextToken();
                    if (i == 1) { // Kita ubah di bagian stok barang nya
                        stokAwal = Integer.parseInt(originalData); // Mengubah string menjadi integer
                        tempData[i] = String.valueOf(stokAwal + stok); // Tambah stok
                    } else {
                        tempData[i] = originalData; // Selain bagian stok, data tidak kita ubah
                    }
                }

                // Tampilkan data baru ke layar
                masukan = new StringTokenizer(data, ","); // Refresh data
                System.out.println("\n---- Data yang akan anda masukkan : ----");
                System.out.println("----------------------------------------");
                System.out.println("Primary key       : " + masukan.nextToken());
                System.out.println("Supplier          : " + masukan.nextToken());
                masukan.nextToken(); // Kita skip bagian stok nya
                System.out.println("Tahun Barang      : " + masukan.nextToken());
                System.out.println("Jenis Barang      : " + masukan.nextToken());
                System.out.println("Merk Barang       : " + masukan.nextToken());
                System.out.println("Seri Barang       : " + masukan.nextToken());
                System.out.println("Stok awal         : " + stokAwal);
                System.out.println("Pertambahan stok  : " + stok);
                System.out.println("Total stok        : " + tempData[1]);

                boolean isTambah = GET_YES_OR_NO("Apakah anda ingin menambahkan data tersebut?");
                if (isTambah) {
                    // Format data baru ke dalam database
                    String supplier = tempData[0];
                    String stokBaru = tempData[1];
                    String tahun = tempData[2];
                    String jenis = tempData[3];
                    String merk = tempData[4];
                    String seri = tempData[5];

                    // Kita bikin primary keys nya
                    long nomorEntry = ambilEntry(merk, tahun);
                    String merkTanpaSpasi = merk.replaceAll("\\s+", "");
                    String primaryKey = merkTanpaSpasi + "_" + tahun + "_" + nomorEntry;

                    // Tulis data kedalam database sementara (temporary.txt)
                    bufferOutput.write(primaryKey + "," + supplier + "," + stokBaru + "," + tahun + "," + jenis + "," + merk + "," + seri);

                    System.out.println("Stok barang berhasil ditambahkan!");
                    JOptionPane.showMessageDialog(null,"Stok barang berhasil ditambahkan!","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Copy data
                    bufferOutput.write(data);
                }
            } else {
                // Copy data
                bufferOutput.write(data);
            }
            bufferOutput.newLine();
            data = bufferInput.readLine();
        }

        // Menulis data kedalam file temporary database (temporary.txt)
        bufferOutput.flush();

        // Kita delete original database (inventory.txt)
        database.delete();

        // Rename file temporary.txt menjadi inventory.txt
        temporary.renameTo(database);
    }

    static ArrayList<String> peminjamList = new ArrayList<>();
    public static void tambahPeminjam(String peminjam) throws IOException{
        peminjamList.add(peminjam); // Kita masukkan nama peminjam ke ArrayList
        Collections.sort(peminjamList); // Kita lakukan sorting untuk jaga-jaga
//        System.out.println(peminjamList);

//      Kita buat file untuk data peminjam (pinjamInventory.txt)
        File dataPeminjam = new File("pinjamInventory.txt");
        FileWriter fileOutput = new FileWriter(dataPeminjam);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // Kita gunakan for di dalam for untuk menghapus indeks yang memiliki kesamaan isi dengan indeks yang lainnya
        for (int i = 0;i < peminjamList.size();i++) {
            for (int j = 0; j < peminjamList.size() - 1; j++) {
                if (peminjamList.get(j).equals(peminjamList.get(j + 1))) {
                    peminjamList.remove(j); // Hapus indeks
                }
            }
        }

        int indeks = 0;
        Collections.sort(peminjamList); // Kita urutkan
        peminjamList.trimToSize(); // Kita hapus indeks yang kosong

        // Kita tulis data peminjam per indeks ke dalam file pinjamInventory.txt
        while (indeks < peminjamList.size()) {
            bufferOutput.write(String.valueOf(peminjamList.get(indeks)));
            bufferOutput.newLine();
            indeks++;
        }
        bufferOutput.flush(); // Tulis data
        bufferOutput.close();
    }

    public static boolean GET_YES_OR_NO(String message){
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\n" + message + " (Y/N) ");
        String konfirmasi = inputUser.nextLine();

        // equalsIgnoreCase tidak mempedulikan huruf kecil maupun huruf besar
        while (!konfirmasi.equalsIgnoreCase("Y") && !konfirmasi.equalsIgnoreCase("N")) {
            System.err.println("Pilihan kamu salah");
            JOptionPane.showMessageDialog(null,"Pilihan kamu salah!!!","Wah error nih",JOptionPane.ERROR_MESSAGE);
            System.out.print("\n" + message + " (Y/N) ");
            konfirmasi = inputUser.nextLine();
        }
        return konfirmasi.equalsIgnoreCase("Y");
    }

    public static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")) { // Jika sistem operasi yang kita gunakan adalah windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143"); // Jika sistem operasi yang kita gunakan adalah Linux/Unix
            }
        } catch (Exception ex) {
            System.err.println("Wah engga bisa clear screen gais awokwokwowk!!!"); // Selain Windows dan Linux/Unix
        }
    }

    public static void sistemLogin(){
        String username,password; // Untuk inputan user
        String ID = "admin";
        String pass = "admin";

        // Mengambil input username dan password dari user
        username = JOptionPane.showInputDialog(null,"Masukkan username anda ","Login dulu gais",JOptionPane.INFORMATION_MESSAGE);
        password = JOptionPane.showInputDialog(null,"Masukkan password anda ","Login dulu gais",JOptionPane.INFORMATION_MESSAGE);

        while (!username.equals(ID) || !password.equals(pass)) {
            JOptionPane.showMessageDialog(null,"Login gagal, silakan coba lagi","Error gais",JOptionPane.ERROR_MESSAGE);
            username = JOptionPane.showInputDialog(null,"Masukkan username anda ","Login dulu gais",JOptionPane.INFORMATION_MESSAGE);
            password = JOptionPane.showInputDialog(null,"Masukkan password anda ","Login dulu gais",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
