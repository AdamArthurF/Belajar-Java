package tugaspakbayu;

import java.util.*;

public class Tugas02ProgramHitung {

    public static void main(String[] args) {

    Scanner inputUser = new Scanner(System.in);
    
    double hargabarangA,hargabarangB,jumlahbarangA,jumlahbarangB,totalbayar;
    System.out.print("Jumlah Barang A = ");
        jumlahbarangA = inputUser.nextDouble();
    System.out.print("Jumlah Barang B = ");
        jumlahbarangB = inputUser.nextDouble();

        hargabarangA = 1000;
        hargabarangB = 2000;
        
    double diskonbarangA,diskonbarangB;

        diskonbarangA = jumlahbarangA * hargabarangA * 0.1;
        diskonbarangB = jumlahbarangB * hargabarangB * 0.05;
        
    double totalbayarA,totalbayarB;

        totalbayarA = jumlahbarangA * hargabarangA - diskonbarangA;
        totalbayarB = jumlahbarangB * hargabarangB - diskonbarangB;
        totalbayar = totalbayarA + totalbayarB;
        
        System.out.println("Total bayar = " + totalbayar);;
        



    }

}
