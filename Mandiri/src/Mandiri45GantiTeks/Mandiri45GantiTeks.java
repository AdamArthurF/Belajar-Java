/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Mandiri45GantiTeks;

import java.util.*;
import java.io.*;

public class Mandiri45GantiTeks {

    public static void main(String[] args) throws Exception{
        if (args.length != 4) {
            System.out.println("Usage: java GantiTeks fileSumber fileTarget stringLama stringBaru");
            System.exit(0);
        }

        File fileSumber = new File(args[0]);
        if (fileSumber.exists()) {
            System.out.println("File sumber " + args[0] + " belum ada");
            System.exit(0);
        }

        File fileTarget = new File(args[1]);
        if (fileTarget.exists()) {
            System.out.println("File target " + args[1] + " belum ada");
            System.exit(0);
        }

        Scanner masukan = new Scanner(fileSumber);
        PrintWriter keluaran = new PrintWriter(fileTarget);

        while (masukan.hasNext()) {
            String s1 = masukan.nextLine();
            String s2 = s1.replaceAll(args[2],args[3]);
            keluaran.println(s2);
        }

        masukan.close();
        keluaran.close();
    }
}
