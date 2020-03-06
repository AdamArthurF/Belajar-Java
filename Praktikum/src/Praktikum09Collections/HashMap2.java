/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.HashMap;

public class HashMap2 {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(100, "Amit");
        hashMap.put(101, "Vijay");
        hashMap.put(102, "Rahul");
        hashMap.put(103, "Gaurav");
        System.out.println("Initial list of elements : " + hashMap);
        hashMap.remove(100);
        System.out.println("Updated list of elements : " + hashMap);
        hashMap.remove(101);
        System.out.println("Updated list of elements : " + hashMap);
        hashMap.remove(102, "Rahul");
        System.out.println("Updated list of elements : " + hashMap);
    }
}
