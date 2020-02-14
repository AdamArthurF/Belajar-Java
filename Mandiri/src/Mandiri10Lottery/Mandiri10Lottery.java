/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri10Lottery;

import java.util.*;

public class Mandiri10Lottery {
    protected static Scanner inputUser = new Scanner (System.in);
    public static void main(String[] MbahPutih) {
        int lottery,tebak,lotteryDigit1,lotteryDigit2,tebakDigit1,tebakDigit2;
        lottery = (int)(Math.random() * 100);

        System.out.print("Masukkan tebakan kamu (dua digit) = ");
        tebak = inputUser.nextInt(); inputUser.nextLine();

        lotteryDigit1 = lottery / 10;
        lotteryDigit2 = lottery % 10;
        tebakDigit1 = tebak / 10;
        tebakDigit2 = tebak % 10;

        System.out.printf("Angka lottery adalah %d \n",lottery);

        if (tebak == lottery) {
            System.out.println("Tebakan kamu cocok dan tepat, kamu dapet Rp10 juta");
        } else if ((tebakDigit1 == lotteryDigit1) && (tebakDigit2 == lotteryDigit2)) {
            System.out.println("Tebakan kamu cocok dengan semua digit, kamu dapet Rp3 juta");
        } else if (tebakDigit1 == lotteryDigit1 || tebakDigit2 == lotteryDigit2 || tebakDigit1 == lotteryDigit2 || tebakDigit2 == lotteryDigit1) {
            System.out.println("Tebakan kamu cocok satu digit, kamu dapet Rp1 juta");
        } else {
            System.out.println("Maaf, tebakan kamu engga cocok sama sekali, jadi kamu engga dapet apa-apa");
        }
    }
}
