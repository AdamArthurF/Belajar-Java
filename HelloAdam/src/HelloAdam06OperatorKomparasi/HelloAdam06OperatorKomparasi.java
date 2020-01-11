/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
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