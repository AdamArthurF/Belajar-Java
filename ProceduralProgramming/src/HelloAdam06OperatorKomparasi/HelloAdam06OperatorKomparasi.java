/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package HelloAdam06OperatorKomparasi;

public class HelloAdam06OperatorKomparasi {

    public static void main(String[] MbahPutih){

        /* Operator Komparasi adalah operator yang akan menghasilkan nilai dalam
            bentuk boolean
        */

        int a,b;
        boolean hasilKomparasi;

        // Operator equal atau persamaan
        System.out.println("===== PERSAMAAN =====");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);
        System.out.println("'==' artinya 'sama dengan'");

        // Operator not equal atau pertidaksamaan
        System.out.println("===== PERTIDAKSAMAAN =====");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);
        System.out.println("'!=' artinya 'tidak sama dengan' ");

        // Operator less than atau kurang dari
        System.out.println("===== KURANG DARI =====");
        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);
        a = 8;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);
        System.out.println("'<' artinya 'kurang dari'");

        // Operator greater than atau lebih dari
        System.out.println("===== LEBIH DARI =====");
        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);
        a = 8;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);
        System.out.println("'>' artinya 'lebih dari'");

        // Operator less than equal atau kurang dari sama dengan
        System.out.println("===== KURANG DARI SAMA DENGAN =====");
        a = 8;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);
        a = 10;
        b = 12;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);
        System.out.println("'<=' artinya 'kurang dari sama dengan'");

        //Operator greater than equal atau lebih dari sama dengan
        System.out.println("=====LEBIH DARI SAMA DENGAN=====");
        a = 8;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);
        a = 10;
        b = 12;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);
        System.out.println("'>=' artinya 'lebih dari sama dengan'");
    }
}