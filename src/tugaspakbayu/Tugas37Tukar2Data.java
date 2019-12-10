package tugaspakbayu;

import java.util.*;

public class Tugas37Tukar2Data {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        int a,b;

        System.out.print("Masukkan nilai a = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai b = ");
        b = inputUser.nextInt(); inputUser.nextLine();

        tukarData(a,b);
    }

    private static void tukarData(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Nilai a sekarang = " + a);
        System.out.println("Nilai b sekarang = " + b);
    }
}
