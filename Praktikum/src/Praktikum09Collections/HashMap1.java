/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        System.out.println("Initial list of elements : " + hashMap);
        hashMap.put(100, "Amit");
        hashMap.put(101, "Vijay");
        hashMap.put(102, "Rahul");

        System.out.println("After invoking put() method ");
        for (Map.Entry elemen : hashMap.entrySet()) {
            System.out.println(elemen.getKey() + " " + elemen.getValue());
        }
        hashMap.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for (Map.Entry elemen : hashMap.entrySet()) {
            System.out.println(elemen.getKey() + " " + elemen.getValue());
        }
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(104, "Ravi");
        hashMap1.putAll(hashMap);
        System.out.println("After invoking putAll() method ");
        for (Map.Entry elemen : hashMap1.entrySet()) {
            System.out.println(elemen.getKey() + " " + elemen.getValue());
        }
    }
}
