package tugaspakbayu;

import java.util.*;

public class Tugas20PersamaanKuadrat {

    public static void main(String[] MbahPutih) {
        Scanner inputUser;
        inputUser = new Scanner(System.in);
        int a,b,c;

        System.out.print("Masukkan nilai a = ");
        a = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai b = ");
        b = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan nilai c = ");
        c = inputUser.nextInt(); inputUser.nextLine();

        BentukPK(a,b,c);
        Diskriminan(a,b,c);
        Definit(a,b,c);
    }

    private static void BentukPK(int x,int y,int z){
        System.out.print("Persamaan yang terbentuk = ");
        System.out.printf("%dx^2 \n",x);
        if (y < 0){
            System.out.printf(" %dx \n",y);
        } else if (y > 0){
            System.out.printf("+ %dx \n",y);
        }

        if (z < 0){
            System.out.println("- " + (-z) + " = 0");
        } else if (z > 0){
            System.out.println("+ " + z + " = 0");
        } else {
            System.out.println(" = 0");
        }
    }

    private static void Diskriminan(int x,int y,int z){
        double D,x1,x2;
        D = y * y - (4 * x * z);
        System.out.println("Nilai Diskriminan = " + D);

        if (D < 0){
            System.out.println("Akar-akar persamaan tidak real/bilangan imajiner");
        } else if (D > 0){
            x1 = ((-y) + Math.sqrt(D)) / (2 * x);
            x2 = ((-y) - Math.sqrt(D)) / (2 * x);
            System.out.println("Akar-akar persamaan real dan berbeda");
            System.out.println("Nilai x1 = " + x1);
            System.out.println("Nilai x2 = " + x2);
        } else if (D == 0) {
            x1 = -y / (2 * x);
            System.out.println("Akar-akar persamaan real dan sama/kembar");
            System.out.println("Nilai x1 = x2 = " + x1);
        }
    }

    private static void Definit(int x,int y,int z){
        double D;
        D = y * y - (4 * x * z);

        if ((x > 0) && (D < 0)){
            System.out.println("Bentuk persamaan ini disebut definit positif");
        } else if ((x < 0) && (D < 0)){
            System.out.println("Bentuk persamaan ini disebut definit negatif");
        }



    }






}

