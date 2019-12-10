package tugaspakbayu;

import javax.naming.NameNotFoundException;
import java.util.*;
import java.lang.Math;

public class Tugas35JenisSegitiga {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        double a,b,c,x,y,z,alas1,alas2,alas3,Luas,Keliling,tinggi1,tinggi2,tinggi3,s,ls,nol,taktentu,tentu;

        System.out.print("Masukkan bilangan a = ");
        a = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan bilangan b = ");
        b = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan bilangan c = ");
        c = inputUser.nextDouble(); inputUser.nextLine();

        /* SEGITIGA SIKU-SIKU */
        x = Math.sqrt(Math.pow(b,2) + Math.pow(c,2)); // Sisi miring --> a
        y = Math.sqrt(Math.pow(a,2) + Math.pow(c,2)); // Sisi miring --> b
        z = Math.sqrt(Math.pow(a,2) + Math.pow(b,2)); // Sisi miring --> c

        /* SEGITIGA SAMA KAKI */
        tinggi1 = Math.sqrt(Math.pow(a,2) - Math.pow(0.5 * c,2)); // Sisi miting --> a == b
        alas1 = Math.sqrt(Math.pow(a,2) - Math.pow(tinggi1,2)) + Math.sqrt(Math.pow(b,2) - Math.pow(tinggi1,2));

        tinggi2 = Math.sqrt(Math.pow(b,2) - Math.pow(0.5 * a,2)); // Sisi miring --> b == c
        alas2 = Math.sqrt(Math.pow(b,2) - Math.pow(tinggi2,2)) + Math.sqrt(Math.pow(c,2) - Math.pow(tinggi2,2));

        tinggi3 = Math.sqrt(Math.pow(c,2) - Math.pow(0.5 * b,2)); // Sisi miring --> c == a
        alas3 = Math.sqrt(Math.pow(c,2) - Math.pow(tinggi3,2)) + Math.sqrt(Math.pow(a,2) - Math.pow(tinggi3,3));

        /* SEGITIGA SEMBARANG */
        s = (a + b + c)/2;
        ls = Math.sqrt((s - a) * (s - b) * (s - c));
        nol = Math.sqrt(0);
        taktentu = Double.NaN;
        tentu = (Double.NaN);

        if (a == x || b == y || c == z) {
            System.out.println("Ini adalah segitiga siku-siku");
            if (a == x){
                Keliling = a + b + c;
                Luas = 0.5 * b * c;
                System.out.printf("Keliling = %.1f \n",Keliling);
                System.out.printf("Luas = %.1f \n",Luas);
            } else if (b == y) {
                Keliling = a + b + c;
                Luas = 0.5 * a * c;
                System.out.printf("Keliling = %.1f \n",Keliling);
                System.out.printf("Luas = %.1f \n",Luas);
            } else if (c == z) {
                Keliling = a + b + c;
                Luas = 0.5 * a * b;
                System.out.printf("Keliling = %.1f \n",Keliling);
                System.out.printf("Luas = %.1f \n",Luas);
            }
        } else if (a == b && b == c && a == c){
            System.out.println("Ini adalah segitiga sama sisi");
            Keliling = a + b + c;
            Luas = 0.5 * a * (Math.sqrt(Math.pow(a,2) - Math.pow(0.5 * a,2)));
            System.out.printf("Keliling = %.1f \n",Keliling);
            System.out.printf("Luas = %.1f \n",Luas);
        } else if ((a == b) || (b == c) || (c == a)){
            if (c == alas1 && (a == b)) {
                System.out.println("Ini adalah segitiga sama kaki");
                Keliling = a + b + c;
                Luas = 0.5 * alas1 * tinggi1;
                System.out.printf("Keliling = %.1f \n",Keliling);
                System.out.printf("Luas = %.1f \n",Luas);
            } else if (a == alas2 && (b == c)) {
                System.out.println("Ini adalah segitiga sama kaki");
                Keliling = a + b + c;
                Luas = 0.5 * alas2 * tinggi2;
                System.out.printf("Keliling = %.1f \n",Keliling);
                System.out.printf("Luas = %.1f \n",Luas);
            } else if (b == alas3 && (c == a)) {
                System.out.println("Ini adalah segitiga sama kaki");
                Keliling = a + b + c;
                Luas = 0.5 * alas3 * tinggi3;
                System.out.printf("Keliling = %.1f \n",Keliling);
                System.out.printf("Luas = %.1f \n",Luas);
            } else {
                System.out.println("Ini bukan segitiga");
            }
        } else if (ls != nol || ls != taktentu){
            System.out.println("Ini adalah segitiga sembarang");
            System.out.printf("Luas = %.1f \n",ls);
        } else {
            System.out.println("Ini bukanlah segitiga");
        }

        System.out.println("\nNol = " + nol);
        System.out.printf("Tak tentu = %f \n",taktentu);
    }
}