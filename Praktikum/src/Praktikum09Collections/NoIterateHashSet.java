/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.HashSet;
import java.util.Set;

public class NoIterateHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ovide");
        set.add("Yudha");
        set.add("Fendi");
        set.add("Harry");
        set.add("Taufiq");
        for (String temp : set) {
            System.out.println(temp);
        }
    }
}
