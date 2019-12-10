package tugaspakbayu;

import java.util.*;

public class Tugas21JumlahDeretKeN2 {

    public static void main(String[] args) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int n,total,nilaiAwal,rataRata;
        boolean kondisi;
        char pilih;
        kondisi = true;
        total = 0;
        nilaiAwal = 0;

        while (kondisi){
            System.out.print("Masukkan nilai n = ");
            n = inputUser.nextInt(); inputUser.nextLine();

            total = total + n;
            System.out.println("Total = " + total);

            nilaiAwal++;
            rataRata = total / nilaiAwal;
            System.out.println("Rata-rata " + rataRata);

            System.out.print("Mau input lagi? (Y/N) ");
            pilih = inputUser.next().charAt(0); inputUser.nextLine();

            if (pilih == 'N' || pilih == 'n'){
                kondisi = false;
                System.out.println("Program selesai");
            }
        }









    }
}
