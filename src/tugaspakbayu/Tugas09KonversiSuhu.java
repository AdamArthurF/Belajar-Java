package tugaspakbayu;

import java.util.*;

public class Tugas09KonversiSuhu {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("====== PROGRAM KONVERSI SUHU ======");
        System.out.println("===================================");
        System.out.println("\n");

        Scanner inputUser;
        inputUser = new Scanner(System.in);

        double celcius,reamur,fahrenheit,kelvin;
        char konversi;

        System.out.print("Masukkan suhu(dalam Celcius) = ");
            celcius = inputUser.nextDouble();
        System.out.print("Masukkan jenis konversi(R/F/K) = ");
            konversi = inputUser.next().charAt(0);

        if (konversi == 'R'){
            reamur = (0.8 * celcius);
                System.out.println("Jika dikonversi ke Reamur menjadi = " + reamur + " derajat Reamur");
        } else if (konversi == 'F'){
            fahrenheit = (1.8 * celcius) + 32;
                System.out.println("Jika dikonversi ke Fahrenheit menjadi = " +fahrenheit + " derajat Fahrenheit");
        } else if (konversi == 'K'){
            kelvin = celcius + 273;
                System.out.println("Jika dikonversi ke Kelvin menjadi = " + kelvin + " derajat Kelvin");
        } else {
                System.out.println("Salah input cuk!");
        }

        System.out.println("\n");

        System.out.print("Masukkan suhu(dalam Celcius) = ");
            celcius = inputUser.nextDouble();
        System.out.print("Masukkan jenis konversi(R/F/K) = ");
            konversi = inputUser.next().charAt(0);

        switch (konversi){
            case 'R': reamur = (0.8 * celcius);
                System.out.println("Jika dikonversi ke Reamur menjadi = " + reamur + " derajat Reamur");
                break;
            case 'F': fahrenheit = (1.8 * celcius) + 32;
                System.out.println("Jika dikonversi ke Fahrenheit menjadi = " +fahrenheit + " derajat Fahrenheit");
                break;
            case 'K' : kelvin = celcius + 273;
                System.out.println("Jika dikonversi ke Kelvin menjadi = " + kelvin + " derajat Kelvin");
                break;
            default:
                System.out.println("Salah input cuk!");
                break;
        }


    }
}
