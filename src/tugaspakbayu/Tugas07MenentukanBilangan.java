package tugaspakbayu;

import java.util.*;

public class Tugas07MenentukanBilangan {

    public static void main(String[] args) {

        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int nilai;
        String hasil;

        System.out.print("Masukkan nilai = ");
            nilai = inputUser.nextInt();

        if (nilai == 0){
            hasil = "Ini adalah bilangan Nol";
                System.out.println(hasil);
        } else if (nilai > 0){
            hasil = "Ini adalah bilangan positif";
                System.out.println(hasil);
        } else{
            hasil = "Ini adalah bilangan negatif";
                System.out.println(hasil);
        }


    }
}
