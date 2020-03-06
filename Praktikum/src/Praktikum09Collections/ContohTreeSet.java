/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.TreeSet;

public class ContohTreeSet {

    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>();
        tset.add("ABC");
        tset.add("Apel");
        tset.add("Durian");
        tset.add("Mangga");
        tset.add("Duku");
        tset.add("Jeruk");
        System.out.println(tset);

        TreeSet<Integer> tset2 = new TreeSet<>();
        tset2.add(88);
        tset2.add(7);
        tset2.add(101);
        tset2.add(0);
        tset2.add(3);
        tset2.add(222);
        System.out.println(tset2);
    }
}
