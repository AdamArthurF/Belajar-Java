/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri07HitungBMI;

import java.util.*;

public class Mandiri07HitungBMI {
    protected static Scanner inputUser = new Scanner(System.in);
    public static void main(String[] MbahPutih) {
        double berat,tinggi,beratDalamKg,tinggiDalamMeter,bmi;

        System.out.print("Masukkan berat badan kamu (dalam pound) = ");
        berat = inputUser.nextDouble(); inputUser.nextLine();
        System.out.print("Masukkan tinggi badan kamy (dalam inci) = ");
        tinggi = inputUser.nextDouble(); inputUser.nextLine();

        final double KILOGRAM_PER_POUND = 0.453559237;
        final double METER_PER_INCI = 0.0254;

        beratDalamKg = berat * KILOGRAM_PER_POUND;
        tinggiDalamMeter = tinggi * METER_PER_INCI;
        bmi = beratDalamKg / Math.pow(tinggiDalamMeter,2);

        System.out.printf("BMI kamu adalah %5.2f \n",bmi);
        if (bmi < 16){
            System.out.println("Kamu sangat kurus");
        } else if (bmi < 18){
            System.out.println("Kamu kurus");
        } else if (bmi < 24) {
            System.out.println("Kamu normal");
        } else if (bmi < 29) {
            System.out.println("Kamu gemuk");
        } else if (bmi < 35) {
            System.out.println("Kamu sangat gemuk");
        } else {
            System.out.println("Kamu terlalu gemuk");
        }
    }
}