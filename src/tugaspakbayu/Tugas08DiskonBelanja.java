package tugaspakbayu;

import java.util.*;

public class Tugas08DiskonBelanja {

    public static void main(String[] args) {

        Scanner inputUser;
        inputUser = new Scanner(System.in);

        double diskon,belanja,bayar;

        System.out.print("Belanja nya habis berapa? ");
            belanja = inputUser.nextDouble();

        if (belanja >= 100000){
            diskon = 0.10;
                System.out.println("Wah kamu dapet diskon 10%");
            bayar = (belanja) - (belanja * diskon);
                System.out.println("Jadi total pembayaran = " + bayar + " rupiah" );
        } else if ((belanja >= 50000) && (belanja < 100000)){
            diskon = 0.05;
                System.out.println("Wah kamu dapet diskon 5%");
            bayar = (belanja) - (belanja * diskon);
                System.out.println("Jadi total pembayaran = " + bayar + " rupiah");
        } else {
            System.out.println("Wah kamu engga dapet diskon");
        }


    }
}
