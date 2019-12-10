package tugaspakbayu;

import java.util.*;
import java.lang.Math;

public class Tugas33Absolut {

    public static void main(String[] args) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int n;

        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();
        System.out.printf("Maka nilai absolutnya adalah = %d \n",Absolut(n));

        System.out.print("Masukkan nilai n = ");
        n = inputUser.nextInt(); inputUser.nextLine();
        System.out.printf("Maka nilai absolutnya adalah = %d \n",Absolut2(n));

    }

    private static int Absolut(int n) {
        int nilai;
        nilai = Math.abs(n);

        return nilai;
    }

    private static int Absolut2(int n){
        int nilai;

        if (n < 0){
            nilai = (n * (-1));
        } else if (n > 0) {
            nilai = n;
        } else {
            nilai = 0;
        }

        return nilai;
    }
}