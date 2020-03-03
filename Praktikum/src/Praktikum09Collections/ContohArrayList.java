/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.*;

public class ContohArrayList {

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Adam");
        alist.add("Nuh");
        alist.add("Ibrahim");
        alist.add("Musa");
        alist.add("Isa");
        alist.add("Muhammad");
        System.out.println(alist);
        alist.add("Adam");
        System.out.println(alist);
    }
}
