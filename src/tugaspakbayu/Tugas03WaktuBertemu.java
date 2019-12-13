package tugaspakbayu;

import java.util.*;

public class Tugas03WaktuBertemu {

public static void main(String[] MbahPutih){

    Scanner inputUser;
    inputUser = new Scanner(System.in);

    double kecepatanA,kecepatanB,kecepatanTotal,jarakAB,jarakA,jarakB,waktu;

    System.out.print("Kecepatan si A (dalam kilometer) = ");
        kecepatanA = inputUser.nextDouble();
    System.out.print("Kecepatan si B (dalam kilometer) = ");
        kecepatanB = inputUser.nextDouble();
    System.out.print("Jarak si A dan si B (dalam kilometer) = ");
        jarakAB = inputUser.nextDouble();

    kecepatanTotal = kecepatanA + kecepatanB;
    waktu = jarakAB / kecepatanTotal;
    jarakA = waktu + kecepatanA;
    jarakB = waktu + kecepatanB;

    System.out.println("Waktu bertemu si A dan si B adalah = " + waktu + "jam");
    System.out.println("Jarak tempuh mobil A = " + jarakA + " Kilometer");
    System.out.println("Jarak tempuh mobil B = " + jarakB + " Kilometer");

}
}
