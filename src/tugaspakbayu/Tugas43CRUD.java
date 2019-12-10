package tugaspakbayu;

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
            System.out.println("1.\tList seluruh barang");
            System.out.println("2.\tCari data barang");
            System.out.println("3.\tTambah data barang");
            System.out.println("4.\tUpdate data barang");
            System.out.println("5.\tHapus data barang");

            System.out.print("\nPilihan kamu : ");
            pilihanUser = inputUser.nextLine();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n==============================");
                    System.out.println("====== LIST DATA BARANG ======");
                    System.out.println("==============================");
                    listData();
                    break;
                case "2":
                    System.out.println("\n=========================");
                    System.out.println("====== CARI BARANG ======");
                    System.out.println("=========================");
                    cariData();
                    break;
                case "3":
                    System.out.println("\n================================");
                    System.out.println("====== TAMBAH DATA BARANG ======");
                    System.out.println("================================");
                    tambahData();
                    listData();
                    break;
                case "4":
                    System.out.println("\n==============================");
                    System.out.println("====== UPDATE DATA BARANG ======");
                    System.out.println("==============================");
                    updateData();
                    break;
                case "5":
                    System.out.println("\n===============================");
                    System.out.println("====== HAPUS DATA BARANG ======");
                    System.out.println("===============================");
                    hapusData();
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih 1 s.d 5");
            }

            lanjutkan = GET_YES_OR_NO("Apakah anda ingin melanjutkan?"); // Sebagai konfirmasi
        }
    }

    private static void listData() throws IOException{
        FileReader fileInput;
        BufferedReader bufferInput;

        // Kita cek file database nya (inventory.txt) ada atau tidak
        try {
            fileInput = new FileReader("inventory.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception ex){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        // Kita buat header nya secara manual
        System.out.print("____________________________________________________________________________________________");
        System.out.println("\n| No |\tTahun |\tJenis Barang\t|      Merk     |\tSeri Barang");
        System.out.println("--------------------------------------------------------------------------------------------");

        String data = bufferInput.readLine(); // Akan memulai pembacaaan file di kalimat pertama
        int nomor = 0;
        while (data != null){ // Jika data tidak kosong, maka kita baca isi nya
            nomor++;
            StringTokenizer masukan = new StringTokenizer(data, ","); // Membaca per kata di baris pertama

            masukan.nextToken(); // Kita skip bagian primary keys nya
            String nomer = String.format("| %2d ",nomor); // Kita tambahkan nomor secara manual
            String tahun = String.format("|\t%4s  ",masukan.nextToken()); // Bagian tahun
            String jenisBarang = String.format("|\t%-16s",masukan.nextToken()); // Bagian jenis barang
            String Merk = String.format("|     %-10s",masukan.nextToken()); // Bagian merk barang
            String Seri = String.format("|\t%-30s",masukan.nextToken()); // Bagian seri barang
            System.out.println(nomer + tahun + jenisBarang + Merk + Seri); // Mencetak data keseluruhan

            data = bufferInput.readLine(); // Akan emulai pembacaan file di baris selanjutnya
        }
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    private static void cariData() throws IOException{
        Scanner inputUser = new Scanner(System.in);

        // Mengecek database kita (inventory.txt) ada atau tidak
        try {
            File file = new File("inventory.txt");
        } catch (Exception ex){
            System.err.println("Database Tidak ditemukan!!!");
            System.err.println("Silahkan tambah data terlebih dahulu");
            tambahData();
            return;
        }

        // Kita ambil inputan keyword dari user
        System.out.print("Masukan kata kunci untuk mencari barang : ");
        String cariString = inputUser.nextLine();
        String[] kataKunci = cariString.split("\\s+"); // Kita ubah menjadi Array  dengan tipe data String

        // Kita cek keyword di database
        cekBarangDiDatabase(kataKunci, true);
    }

    private static boolean cekBarangDiDatabase(String[] kataKunci,boolean isDisplay) throws IOException{
        FileReader fileInput = new FileReader("inventory.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String data = bufferInput.readLine(); // Akan memulai pembacaan file di baris pertama
        boolean isExist = false; // isExist berfungsi sebagai status apakah keywords kita ada atau tidak
        int nomorData = 0;

        if (isDisplay) {
            System.out.print("____________________________________________________________________________________________");
            System.out.println("\n| No |\tTahun |\tJenis Barang\t|      Merk     |\tSeri Barang");
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
                StringTokenizer masukan = new StringTokenizer(data, ",");

                masukan.nextToken(); // Kita skip bagian Primary Keys nya
                String nomer = String.format("| %2d ",nomorData); // Kita tambahkan nomor secara manual
                String tahun = String.format("|\t%4s  ",masukan.nextToken()); // Bagian tahun
                String jenisBarang = String.format("|\t%-16s",masukan.nextToken()); // Bagian jenis barang
                String Merk = String.format("|     %-10s",masukan.nextToken()); // Bagian merk barang
                String Seri = String.format("|\t%-30s",masukan.nextToken()); // Bagian seri barang

                System.out.println(nomer + tahun + jenisBarang + Merk + Seri); // Mencetak data keseluruhan
            }
            data = bufferInput.readLine(); // Akan memulai pembacaan file di baris selanjutnya
        }
        if (isDisplay) {
            System.out.println("--------------------------------------------------------------------------------------------");
        }
        return isExist;
    }

    private static void tambahData() throws IOException{
        FileWriter fileOutput = new FileWriter("inventory.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // Mengambil input dari user untuk menambah data
        Scanner inputUser = new Scanner(System.in);
        String jenis, merk, seri, tahun;

        System.out.print("Masukkan jenis barang : ");
        jenis = inputUser.nextLine();
        System.out.print("Masukan merk barang : ");
        merk = inputUser.nextLine();
        System.out.print("Masukan seri barang : ");
        seri = inputUser.nextLine();
        System.out.print("Masukan tahun barang (YYYY) : ");
        tahun = ambilTahun();

        // Cek barang di database (inventory.txt)
        String[] keywords = {tahun + "," + jenis + "," + merk + "," + seri}; // Kita ubah menjadi array
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekBarangDiDatabase(keywords,false);

        // Menulis barang di database (inventory.txt)
        if (!isExist){
            long nomorEntry = ambilEntry(merk, tahun) + 1; // Menciptakan nomorEntry

            String merkTanpaSpasi = merk.replaceAll("\\s+",""); // Kita hapus semua spasi
            String primaryKey = merkTanpaSpasi + "_" + tahun + "_" + nomorEntry;
            System.out.println("\n---- Data yang akan anda masukkan : ----");
            System.out.println("----------------------------------------");
            System.out.println("Primary key  : " + primaryKey);
            System.out.println("Tahun        : " + tahun);
            System.out.println("Jenis Barang : " + jenis);
            System.out.println("Merk Barang  : " + merk);
            System.out.println("Seri Barang  : " + seri);

            boolean isTambah = GET_YES_OR_NO("Apakah anda ingin menambahkan data tersebut? "); // Sebagai konfirmasi
            if(isTambah){
                bufferOutput.write(primaryKey + "," + tahun + "," + jenis + "," + merk + "," + seri);
                bufferOutput.newLine(); // Menciptakan baris baru (enter)
                bufferOutput.flush(); // Menuliskan di database (inventory.txt)
            }
        } else {
            System.out.println("Barang yang anda akan masukan sudah tersedia di database dengan data berikut : ");
            cekBarangDiDatabase(keywords,true);
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
                Year.parse(tahunInput); // Untuk mengecek apakah inputan tahun kita berupa 4 digit angka
                tahunValid = true;
            } catch (Exception ex) {
                System.out.println("Format tahun yang anda masukan salah (format = YYYY)");
                System.out.print("Silahkan masukkan tahun barang lagi : ");
                tahunValid = false;
                tahunInput = inputUser.nextLine();
            }
        }
        return tahunInput;
    }

    private static long ambilEntry(String merk,String tahun) throws IOException{
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

    private static void updateData() throws IOException{
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
        listData();

        // Kita ambil input dari user
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\nMasukan nomor barang yang akan diupdate : ");
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
                System.out.println("Tahun Barang   : " + masukan.nextToken()); // Bagian tahun barang
                System.out.println("Jenis Barang   : " + masukan.nextToken()); // Bagian jenis barang
                System.out.println("Merk Barang    : " + masukan.nextToken()); // Bagian merk barang
                System.out.println("Seri Barang    : " + masukan.nextToken()); // Bagian seri barang

                // Update data dengan cara mengambil input dari user
                String[] fieldData = {"tahun","jenis","merk","seri"};
                String[] tempData = new String[4];

                masukan = new StringTokenizer(data,","); // Kita refresh data
                String originalData;
                for(int i=0; i < fieldData.length ; i++) {
                    boolean isUpdate = GET_YES_OR_NO("Apakah anda ingin mengubah " + fieldData[i]);
                    originalData = masukan.nextToken();
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
                System.out.println("Tahun Barang  : " + masukan.nextToken() + " --> " + tempData[0]);
                System.out.println("Jenis Barang  : " + masukan.nextToken() + " --> " + tempData[1]);
                System.out.println("Merk Barang   : " + masukan.nextToken() + " --> " + tempData[2]);
                System.out.println("Seri Barang   : " + masukan.nextToken() + " --> " + tempData[3]);

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
                        String tahun = tempData[0];
                        String jenis = tempData[1];
                        String merk = tempData[2];
                        String seri = tempData[3];

                        // Kita bikin primary key lagi
                        long nomorEntry = ambilEntry(merk, tahun) + 1;
                        String merkTanpaSpasi = merk.replaceAll("\\s+","");
                        String primaryKey = merkTanpaSpasi+"_"+tahun+"_"+nomorEntry;

                        // Tulis data kedalam database sementara (temporary.txt)
                        bufferedOutput.write(primaryKey + "," + tahun + "," + jenis + "," + merk + "," + seri);
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

    private static void hapusData() throws IOException{
        // Kita ambil database original (inventory.txt)
        File database = new File("inventory.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // Kita buat temporary database (temporary.txt)
        File temporary = new File("temporary.txt");
        FileWriter fileOutput = new FileWriter(temporary);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        // Tampilkan data
        System.out.println("-_-_-_-_- LIST BARANG -_-_-_-_-");
        listData();

        // Kita ambil input dari user untuk menghapus data
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\nMasukkan nomor barang yang akan dihapus : ");
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
                System.out.println("Tahun Barang  : " + masukan.nextToken()); // Bagian tahun barang
                System.out.println("Jenis Barang  : " + masukan.nextToken()); // Bagian jenis barang
                System.out.println("Merk Barang   : " + masukan.nextToken()); // Bagian merk barang
                System.out.println("Seri Barang   : " + masukan.nextToken()); // Bagian seri barang

                isDelete = GET_YES_OR_NO("Apakah anda yakin untuk menghapus?");
                isFound = true;
            }
            if(isDelete){
                /* Data yang akan kita hapus tetap berada di database original (inventory.txt),
                 * sedangkan data yang lainnya kita pindahkan ke database sementara (temporary.txt) */
                System.out.println("Data barang berhasil dihapus");
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

    private static boolean GET_YES_OR_NO(String message){
        Scanner inputUser = new Scanner(System.in);
        System.out.print("\n" + message + " (Y/N) ");
        String konfirmasi = inputUser.nextLine();

        // equalsIgnoreCase tidak mempedulikan huruf kecil maupun huruf besar
        while (!konfirmasi.equalsIgnoreCase("Y") && !konfirmasi.equalsIgnoreCase("N")) {
            System.err.println("Pilihan kamu salah");
            System.out.print("\n" + message + " (Y/N) ");
            konfirmasi = inputUser.nextLine();
        }
        return konfirmasi.equalsIgnoreCase("Y");
    }

    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")) { // Jika sistem operasi yang kita gunakan adalah windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.println("\033\143"); // Jika sistem operasi yang kita gunakan adalah Linux/Unix
            }
        } catch (Exception ex) {
            System.out.println("Wah engga bisa clear screen gais awokwokwowk!!!"); // Selain Windows dan Linux/Unix
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
