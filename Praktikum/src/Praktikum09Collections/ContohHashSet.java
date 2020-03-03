/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.HashSet;

public class ContohHashSet {

    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("Apel");
        hset.add("Durian");
        hset.add("Jeruk");
        hset.add("Mangga");
        hset.add("Rambutan");

        hset.add("Apel");
        hset.add("Mangga");

        hset.add(null);
        hset.add(null);

        System.out.println(hset);
    }
}
