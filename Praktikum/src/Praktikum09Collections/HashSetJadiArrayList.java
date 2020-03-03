/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetJadiArrayList {

    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("Ovide");
        hset.add("Yudha");
        hset.add("Fendi");
        hset.add("Harry");
        hset.add("Taufiq");
        System.out.println("HashSet berisi : " + hset);
        List<String> list = new ArrayList<>(hset);
        System.out.println("ArrayList berisi : " + list);
    }
}
