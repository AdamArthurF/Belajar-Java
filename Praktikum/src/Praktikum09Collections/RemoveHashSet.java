/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.HashSet;

public class RemoveHashSet {

    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("1 - Ovide");
        hset.add("2 - Yudha");
        hset.add("3 - Fendi");
        hset.add("4 - Harry");
        hset.add("5 - Taufiq");

        System.out.println("Sebelum: HashSet berisi: " + hset);
        hset.clear();
        System.out.println("Setelah: HashSet berisi: " + hset);
    }
}
