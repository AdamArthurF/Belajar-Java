/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package HelloAdam40ScannerStringTokenizer;

import java.util.*;
import java.io.*;

public class HelloAdam40ScannerStringToken {
    protected static Scanner inputUser = new Scanner (System.in);
    public static void main(String[] MbahPutih) throws IOException {
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        // ini untuk cek ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext()); // true

        // untuk membaca kata, dengan pemisah/delimeter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext()); // false

        // Menggunakan delimiter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }

        // menggunakan String tokenizer

        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(data,",");

        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }

        // baris kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        stringToken = new StringTokenizer(data,",");

        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }
    }
}
