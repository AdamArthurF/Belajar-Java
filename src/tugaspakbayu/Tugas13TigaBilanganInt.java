package tugaspakbayu;

import java.util.*;

public class Tugas13TigaBilanganInt {

    public static void main(String[] args) {

        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int a,b,c;

        System.out.print("Masukkan nilai pertama = ");
        a = inputUser.nextInt();
        System.out.print("Masukkan nilai kedua = ");
        b = inputUser.nextInt();
        System.out.print("Masukkan nilai ketiga = ");
        c = inputUser.nextInt();

        if ((a >= b) && (a >= c)){
            System.out.println("\nMaka nilai terbesar adalah = " + a);
        } else if ((b >= a) && (b >= c)){
            System.out.println("\nMaka nilai terbesar adalah = " + b);
        } else if ((c >= a) && (c >= b)){
            System.out.println("\nMaka nilai terbesar adalah = " + c);
        }







    }
}
