/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.ArrayList;

public class HapusArrayList{

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("AB");
        arrayList.add("CD");
        arrayList.add("EF");
        arrayList.add("GH");
        arrayList.add("AB");
        arrayList.add("YZ");
        System.out.println("ArrayList sebelum dihapus");
        for (String var : arrayList) {
            System.out.println(var);
        }
        arrayList.remove(0);
        arrayList.remove(2);
        arrayList.remove(2);
        System.out.println("ArrayList setelah dihapus");
        for (String var2 : arrayList) {
            System.out.println(var2);
        }
    }
}
