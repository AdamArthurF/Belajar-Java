package tugaspakbayu;

import java.util.*;

public class Tugas15CetakKarakter {
    static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        //Mencetak karakter menggunakan perulangan while
        PerulanganWhile();
    }

    private static void PerulanganWhile(){
        char karakter;
        boolean kondisi;
        kondisi = true;
        while (kondisi){
            System.out.print("Masukkan karakter kamu = ");
            karakter = inputUser.next().charAt(0); inputUser.nextLine();
            System.out.println("Karakter yang tercetak adalah " + karakter);

            if (karakter == 'x' || karakter == 'X'){
                kondisi = false;
                System.out.println("Program selesai");
            }
        }
    }

}
