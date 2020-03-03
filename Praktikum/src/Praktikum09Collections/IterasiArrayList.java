/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.ArrayList;

public class IterasiArrayList {

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Ovide Decroly");
        alist.add("Yudho Yudhanto");
        alist.add("Fendi Aji");
        alist.add("Eko Harry");
        alist.add("Taufiqurrakhman");

        for (String iter : alist) {
            System.out.println(iter);
        }
    }
}
