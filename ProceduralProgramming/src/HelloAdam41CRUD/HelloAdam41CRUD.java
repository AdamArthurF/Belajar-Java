/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package HelloAdam41CRUD;

import java.util.*;
import java.io.*;
import java.time.*;
import javax.swing.*;

public class HelloAdam41CRUD {

    public static void main(String[] MbahPutih) throws IOException {
        Scanner inputUser = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        clearScreen();
        sistemLogin();
        while (isLanjutkan) {
            clearScreen();
            System.out.println("------ DATABASE PERPUSTAKAAN DAERAH KAB.KARANGANYAR ------\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\nPilihan kamu : ");
            pilihanUser = inputUser.next();

            switch (pilihanUser) {
                case "1":
//                    System.out.println("\n=================");
//                    System.out.println("LIST SELURUH BUKU");
//                    System.out.println("=================");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    cariData();
                    break;
                case "3":
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    tambahData();
                    tampilkanData();
                    break;
                case "4":
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                    updateData();
                    break;
                case "5":
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                    hapusData();
                    break;
                default:
                System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih 1 s.d 5");
                JOptionPane.showMessageDialog(null,"Input anda tidak ditemukan\nSilahkan pilih 1 s.d 5","Error",JOptionPane.ERROR_MESSAGE);
            }
            isLanjutkan = GET_YES_OR_NO("Apakah anda ingin melanjutkan?");
        }
    }

    private static void tampilkanData() throws IOException{
        FileReader fileInput;
        BufferedReader bufferInput;

        // Kita cek file database nya (perpus.txt) ada atau tidak
        try {
            fileInput = new FileReader("perpus.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception ex){
//            System.err.println("Database Tidak ditemukan");
            JOptionPane.showMessageDialog(null,"Database tidak ditemukan!!!","Error",JOptionPane.ERROR_MESSAGE);
//            System.err.println("Silahkan tambah data terlebih dahulu");
            JOptionPane.showMessageDialog(null,"Silakan tambah data terlebih dahulu","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
            tambahData();
            return;
        }

        // Kita buat header nya secara manual
        System.out.print("____________________________________________________________________________________________");
        System.out.println("\n| No |\tTahun |\t\tPenulis\t\t|\tPenerbit\t|\tJudul Buku");
        System.out.println("--------------------------------------------------------------------------------------------");

        String data = bufferInput.readLine(); // Akan memulai pembacaan file di baris pertama
        int nomorData = 0;
        while(data != null) { // Jika data tidak kosong, maka kita baca isi nya
            nomorData++;
            StringTokenizer masukan = new StringTokenizer(data, ","); // Membaca file per kata di baris pertama

            masukan.nextToken(); // kita skip bagian Primary Keys nya
            String nomer = String.format("| %2d ", nomorData); // Kita tambahkan nomer secara manual
            String tahunTerbit = String.format("|\t%4s  ", masukan.nextToken()); // Bagian tahun terbit
            String penulis = String.format("|\t%-24s", masukan.nextToken()); // Bagian penulis
            String penerbit = String.format("|\t%-16s", masukan.nextToken()); // Bagian penerbit
            String judulBuku = String.format("|\t%s   ", masukan.nextToken()); // Bagian judul buku
            System.out.println(nomer + tahunTerbit + penulis + penerbit + judulBuku); // Mencetak data keseluruhan

            data = bufferInput.readLine(); // Akan memulai pembacaan file di baris selanjutnya
        }
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    private static void cariData() throws IOException{
        Scanner inputUser = new Scanner(System.in);

        // Mengecek database kita (perpus.txt) ada atau tidak
        try {
            File file = new File("perpus.txt");
        } catch (Exception ex){
//            System.err.println("Database Tidak ditemukan!!!");
            JOptionPane.showMessageDialog(null,"Database tidak ditemukan!!!","Error",JOptionPane.ERROR_MESSAGE);
//            System.err.println("Silahkan tambah data terlebih dahulu");
            JOptionPane.showMessageDialog(null,"Silakan tambah data terlebih dahulu","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
            tambahData();
            return;
        }

        // Kita ambil keyword dari user
        System.out.print("Masukan kata kunci untuk mencari buku : ");
        String cariString = inputUser.nextLine();
        String[] kataKunci = cariString.split("\\s+"); // Kita ubah menjadi Array  dengan tipe data String

        // Kita cek keyword di database
        cekBukuDiDatabase(kataKunci,true);
    }

    private static boolean cekBukuDiDatabase(String[] kataKunci, boolean isDisplay) throws IOException {
        FileReader fileInput = new FileReader("perpus.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine(); // Akan memulai pembacaan file di baris pertama
        boolean isExist = false; // isExist berfungsi sebagai status apakah keywords kita ada atau tidak
        int nomorData = 0;

        if (isDisplay) {
            System.out.print("____________________________________________________________________________________________");
            System.out.println("\n| No |\tTahun |\t\tPenulis\t\t|\tPenerbit\t|\tJudul Buku");
            System.out.println("--------------------------------------------------------------------------------------------");
        }

        while (data != null) {
            // Cek keywords didalam baris
            isExist = true;
            for (String keyword : kataKunci) { // Looping for each
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }

            // Jika keywordsnya cocok/true maka tampilkan
            if (isExist) {
                nomorData++;
                StringTokenizer masukan = new StringTokenizer(data, ","); // Membaca file per kata

                masukan.nextToken(); // Kita skip bagian Primary Keys nya
                String nomer = String.format("| %2d ", nomorData); // Kita tambahkan nomer
                String tahunTerbit = String.format("|\t%4s  ", masukan.nextToken()); // Bagian tahun terbit
                String penulis = String.format("|\t%-24s", masukan.nextToken()); // Bagian penulis
                String penerbit = String.format("|\t%-16s", masukan.nextToken()); // Bagian penerbit
                String judulBuku = String.format("|\t%s   ", masukan.nextToken()); // Bagian judul buku

                System.out.println(nomer + tahunTerbit + penulis + penerbit + judulBuku); // Mencetak data keseluruhan
            }
            data = bufferInput.readLine(); // Akan memulai pembacaan file di baris selanjutnya
        }
        if (isDisplay) {
            System.out.println("--------------------------------------------------------------------------------------------");
        }
        return isExist;
    }

    private static void tambahData() throws IOException{
        FileWriter fileOutput = new FileWriter("perpus.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // Mengambil input dari user untuk menambah data
        Scanner inputUser = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("Masukkan nama penulis : ");
        penulis = inputUser.nextLine();
        System.out.print("Masukan judul buku : ");
        judul = inputUser.nextLine();
        System.out.print("Masukan nama penerbit : ");
        penerbit = inputUser.nextLine();
        System.out.print("Masukan tahun terbit (YYYY) : ");
        tahun = ambilTahun();

        // Cek buku di database (perpus.txt)
        String[] keywords = {tahun + "," + penulis + "," + penerbit + "," + judul}; // Kita ubah menjadi array
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekBukuDiDatabase(keywords,false);

        // Menulis buku di database (perpus.txt)
        if (!isExist){
          /* fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah */
           /* System.out.println(ambilEntry(penulis, tahun)); */
            long nomorEntry = ambilEntry(penulis, tahun) + 1; // Menciptakan nomorEntry

            String penulisTanpaSpasi = penulis.replaceAll("\\s+",""); // Kita hapus semua spasi
            String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;
            System.out.println("\n---- Data yang akan anda masukkan : ----");
            System.out.println("----------------------------------------");
            System.out.println("Primary key  : " + primaryKey);
            System.out.println("Tahun terbit : " + tahun);
            System.out.println("Penulis      : " + penulis);
            System.out.println("Judul buku   : " + judul);
            System.out.println("Penerbit     : " + penerbit);

            boolean isTambah = GET_YES_OR_NO("Apakah anda ingin menambahkan data tersebut? ");
            if(isTambah){
                bufferOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferOutput.newLine(); // Menciptakan baris baru (enter)
                bufferOutput.flush(); // Menuliskan di database
            }
        } else {
            System.out.println("Buku yang anda akan masukan sudah tersedia di database dengan data berikut : ");
            cekBukuDiDatabase(keywords,true);
        }

        // Jangan lupa untuk menutup file
        bufferOutput.close(); // Menutup file
    }

    private static String ambilTahun(){
        Scanner inputUser = new Scanner(System.in);

        boolean tahunValid = false; // Sebagai status apakah tahunnya valid atau tidak
        String tahunInput = inputUser.nextLine();
        while(!tahunValid) {
            try {
                Year.parse(tahunInput); // Untuk mengecek apakah tahun kita berupa 4 digit angka
                tahunValid = true;
            } catch (Exception ex) {
                System.out.println("Format tahun yang anda masukkan salah! (format = YYYY)");
                JOptionPane.showMessageDialog(null,"Format tahun yang anda masukkan salah! (format = YYYY)","Error",JOptionPane.ERROR_MESSAGE);
                System.out.print("Silahkan masukkan tahun terbit lagi : ");
                tahunValid = false;
                tahunInput = inputUser.nextLine();
            }
        }
        return tahunInput;
    }

    private static long ambilEntry(String penulis,String tahun) throws IOException{
        FileReader fileInput = new FileReader("perpus.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        long entry = 0;
        String primaryKey;
        Scanner dataScanner; // Untuk membaca file per kalimat
        String data = bufferInput.readLine(); // Persiapan untuk membaca file di baris pertama

        while(data != null){
            dataScanner = new Scanner(data); // Akan memulai pembacaan file di kalimat pertama
            dataScanner.useDelimiter(","); // Akan kita akhiri pembacaan file setelah bertemu tanda koma (,)
            primaryKey = dataScanner.next(); // Mulai pembacaan file di kalimat pertama
            dataScanner = new Scanner(primaryKey);  // Kita baca lagi hasil potongan kalimat nya
            dataScanner.useDelimiter("_"); // Dan akan kita akhiri pembacaan file setelah bertemu tanda underscore (_)

            penulis = penulis.replaceAll("\\s+",""); // Kita hapus semua spasi
            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next()) ) {
                entry = dataScanner.nextInt();
            }
            data = bufferInput.readLine(); // Akan emulai pembacaan di baris selanjutnya
        }
        return entry;
    }

    private static void updateData() throws IOException{
        // Kita ambil file database original (perpus.txt)
        File database = new File("perpus.txt"); // Mengecek file kita ada atau tidak
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // Kita buat file database sementara (temporary.txt)
        File temporary = new File("temporary.txt"); // Mengecek file kita ada atau tidak
        FileWriter fileOutput = new FileWriter(temporary);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // Tampilkan data terlebih dahulu
        System.out.println("-------- List Buku --------");
        tampilkanData();

        // Kita ambil input dari user
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\nMasukan nomor buku yang akan diupdate : ");
        int updateNum = inputUser.nextInt();

        // Tampilkan data yang ingin diupdate
        String data = bufferedInput.readLine();
        int entryCounts = 0;

        while (data != null){
            entryCounts++;
            StringTokenizer masukan = new StringTokenizer(data,","); // Memulai pembacaan file per kata

            // Tampilkan jika entrycounts == updateNum
            if (updateNum == entryCounts){
                System.out.println("\n------ Data yang ingin anda update adalah : ------");
                System.out.println("--------------------------------------------------");
                System.out.println("Primary Keys   : " + masukan.nextToken()); // Bagian primary keys
                System.out.println("Tahun Terbit   : " + masukan.nextToken()); // Bagian tahun terbit
                System.out.println("Penulis        : " + masukan.nextToken()); // Bagian penulis
                System.out.println("Penerbit       : " + masukan.nextToken()); // Bagian penerbit
                System.out.println("Judul Buku     : " + masukan.nextToken()); // Bagian judul buku

                // Update data dengan cara mengambil input dari user
                String[] fieldData = {"tahun","penulis","penerbit","judul"};
                String[] tempData = new String[4];

                masukan = new StringTokenizer(data,","); // Kita refresh data
                String originalData = masukan.nextToken();
                for(int i=0; i < fieldData.length ; i++) {
                    boolean isUpdate = GET_YES_OR_NO("Apakah anda ingin mengubah " + fieldData[i]);
                    originalData = masukan.nextToken();
                    if (isUpdate){
                        // Mengambil input dari user
                        if (fieldData[i].equalsIgnoreCase("tahun")){
                            System.out.print("Masukkan tahun terbit, format = (YYYY) : ");
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
                System.out.println("\nData baru anda adalah ");
                System.out.println("---------------------------------------");
                System.out.println("Tahun       : " + masukan.nextToken() + " --> " + tempData[0]);
                System.out.println("Penulis     : " + masukan.nextToken() + " --> " + tempData[1]);
                System.out.println("Penerbit    : " + masukan.nextToken() + " --> " + tempData[2]);
                System.out.println("Judul       : " + masukan.nextToken() + " --> " + tempData[3]);

                boolean isUpdate = GET_YES_OR_NO("Apakah anda yakin ingin mengupdate data tersebut");
                if (isUpdate){
                    // Cek data baru di database
                    boolean isExist = cekBukuDiDatabase(tempData,false);
                    if(isExist){
//                        System.err.println("Data buku sudah ada di database, proses update dibatalkan, \nsilahkan delete data yang bersangkutan");
                        JOptionPane.showMessageDialog(null,"Data buku sudah ada di database, proses update dibatalkan, \nsilahkan delete data yang bersangkutan","Error",JOptionPane.ERROR_MESSAGE);
                        // Keseluruhan data tetap kita copy ke dalam temporary database (temporary.txt)
                        bufferedOutput.write(data);
                    } else {
                        // Format data baru ke dalam database
                        String tahun = tempData[0];
                        String penulis = tempData[1];
                        String penerbit = tempData[2];
                        String judul = tempData[3];

                        // Kita bikin primary key lagi
                        long nomorEntry = ambilEntry(penulis, tahun) + 1;
                        String penulisTanpaSpasi = penulis.replaceAll("\\s+","");
                        String primaryKey = penulisTanpaSpasi+"_"+tahun+"_"+nomorEntry;

                        // Tulis data kedalam database sementara (temporary.txt)
                        bufferedOutput.write(primaryKey + "," + tahun + ","+ penulis +"," + penerbit + ","+judul);
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

        // Kita delete original database (perpus.txt)
        database.delete();

        // Rename file temporary.txt menjadi perpus.txt
        temporary.renameTo(database);
    }

    private static void hapusData() throws IOException{
        // Kita ambil database original (perpus.txt)
        File database = new File("perpus.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat temporary database (temporary.txt)
        File temporary = new File("temporary.txt");
        FileWriter fileOutput = new FileWriter(temporary);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // Tampilkan data
        System.out.println("--------- LIST BUKU ---------");
        tampilkanData();

        // Kita ambil input dari user untuk menghapus data
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\nMasukkan nomor buku yang akan dihapus : ");
        int deleteNum = inputUser.nextInt();

        // Looping untuk membaca data tiap baris dan skip data yang akan dihapus
        boolean isFound = false;
        int entryCounts = 0;
        String data = bufferedInput.readLine(); // Akan memulai pembacaan file di baris pertama

        while (data != null){
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer masukan = new StringTokenizer(data,","); // Memulai pembacaan file per kata
            // Tampilkan terlebih dahulu data yang ingin di hapus
            if (deleteNum == entryCounts){
                System.out.println("\n----- Data yang akan anda hapus : -----");
                System.out.println("---------------------------------------");
                System.out.println("Primary Keys  : " + masukan.nextToken()); // Bagian Primary Keys
                System.out.println("Tahun Terbit  : " + masukan.nextToken()); // Bagian tahun terbit
                System.out.println("Penulis       : " + masukan.nextToken()); // Bagian penulis
                System.out.println("Penerbit      : " + masukan.nextToken()); // Bagian penerbit
                System.out.println("Judul Buku    : " + masukan.nextToken()); // Bagian Judul Buku

                isDelete = GET_YES_OR_NO("Apakah anda yakin untuk menghapus?");
                isFound = true;
            }
            if(isDelete){
                /* Data yang akan kita hapus tetap berada di database original (perpus.txt),
                * sedangkan data yang lainnya kita pindahkan ke database sementara (temporary.txt) */
                System.out.println("Data berhasil dihapus");
                JOptionPane.showMessageDialog(null,"Data berhasil dihapus","Pemberitahuan",JOptionPane.INFORMATION_MESSAGE);
            } else {
                /* kita pindahkan semua data dari database original (perpus.txt)
                * ke database sementara (temporary.txt) */
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }
        if(!isFound){
            System.err.println("Buku tidak ditemukan");
            JOptionPane.showMessageDialog(null,"Buku tidak ditemukan","Error",JOptionPane.ERROR_MESSAGE);
        }

        // Menuliskan data ke file database sementara (temporary.txt)
        bufferedOutput.flush();

        // Delete original file (perpus.txt)
        database.delete();

        // Rename file temporary (temporary.txt) menjadi file database asli (perpus.txt)
        temporary.renameTo(database);
    }

    private static boolean GET_YES_OR_NO(String message){
        Scanner inputUser = new Scanner (System.in);
        System.out.print("\n"+ message + " (Y/N) ");
        String pilihanUser = inputUser.next();

        // equalsIgnoreCase tidak mempedulikan huruf kecil maupun huruf besar
        while(!pilihanUser.equalsIgnoreCase("Y") && !pilihanUser.equalsIgnoreCase("N")) {
            System.err.println("Pilihan kamu salah!");
            JOptionPane.showMessageDialog(null,"Pilihan kamu salah!","Error",JOptionPane.ERROR_MESSAGE);
            System.out.print("\n" + message + " (Y/N) ");
            pilihanUser = inputUser.next();
        }
        return pilihanUser.equalsIgnoreCase("Y");
    }

    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){ // Jika sistem operasi yang kita gunakan adalah Windows
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143"); // Jika sistem operasi yang kita gunakan adalah Linux/Unix
            }
        } catch (Exception ex){
            System.err.println("Wah engga bisa clear screen gais"); // Selain Windows dan Linux/Unix
            JOptionPane.showMessageDialog(null,"Wah engga bisa clear screen gais","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void sistemLogin(){
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