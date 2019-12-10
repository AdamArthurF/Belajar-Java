package praktikum;

import java.util.*;

public class Praktikum03TipeDataVariabel {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");
        System.out.println("\n");

        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int umur; double tinggi; String nama; char jenisKelamin; boolean aktif;

        System.out.print("Masukkan nama kamu: ");
            nama = inputUser.nextLine();
        System.out.print(("Masukkan umur kamu: "));
            umur = inputUser.nextInt(); inputUser.nextLine();
        System.out.print("Masukkan tinggi badan(dalam cm): ");
            tinggi = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan jenis kelamin(L/P): ");
            jenisKelamin = inputUser.next().charAt(0); inputUser.nextLine();
        System.out.print("Aktif? ");
            aktif = inputUser.nextBoolean(); inputUser.nextLine();

        System.out.println(nama + " sekarang berumur " + umur + " tahun, tinggi " + tinggi + " dan jenis kelamin " + jenisKelamin);
        System.out.println("Aktif " + aktif);

        // Operator Aritmetika
        System.out.println("\n");
        int x,y,jumlah,kurang,kali,modulo;
        double bagi;

        System.out.print("Masukkan nilai x = ");
            x = inputUser.nextInt();
        System.out.print("Masukkan nilai y = ");
            y = inputUser.nextInt();

        jumlah = x + y;
        kurang = x - y;
        kali = x * y;
        bagi = (double) x / y;
        modulo = x % y;

        System.out.println(x + " + " + y + " = " + jumlah);
        System.out.println(x + " - " + y + " = " + kurang);
        System.out.println(x + " * " + y + " = " + kali);
        System.out.println(x + " / " + y + " = " + bagi);
        System.out.println(x + " % " + y + " = " + modulo);

        // Operator Unary
        System.out.println("\n");
        System.out.println("Nilai x adalah = " + x);
        System.out.println("Nilai x adalah = " + (x++)); // x = x + 1
        System.out.println("Nilai x adalah = " + (++x)); // x = x + 1
        System.out.println("Nilai x adalah = " + x);
        x++;
        System.out.println("Nilai x adalah = " + x);
        ++x;

        // Operator Assignments
        System.out.println("\n");
        System.out.println("Nilai x adalah = " + x);
        System.out.println("Nilai x adalah = " + (x += 1)); // x = x + 1
        System.out.println("Nilai x adalah = " + (x -= 2)); // x = x - 2
        System.out.println("Nilai x adalah = " + (x *= 3)); // x = x * 3
        System.out.println("Nilai x adalah = " + (x /= 4)); // x = x / 4
        System.out.println("Nilai x adalah = " + (x %= 5)); // x = x % 5













    }
}
