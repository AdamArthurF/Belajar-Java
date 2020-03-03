/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.ArrayList;

public class RemoveArrayList {

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Adam");
        alist.add("Nuh");
        alist.add("Ibrahim");
        alist.add("Musa");
        alist.add("Isa");
        alist.add("Muhammad");

        System.out.println(alist);
        alist.remove("Adam");
        alist.remove("Isa");
        System.out.println(alist);
        alist.remove(2);
        System.out.println(alist);
    }
}
