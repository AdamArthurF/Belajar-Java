/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(100,"Adam");
        hashMap2.put(101,"Arthur");
        hashMap2.put(102,"Faizal");
        System.out.println("Initial list of elements : ");
        for (Map.Entry elemen : hashMap2.entrySet()) {
            System.out.println(elemen.getKey() + " " + elemen.getValue());
        }
        System.out.println("Updated list of elements : ");
        hashMap2.replace(102, "Putih");
        for (Map.Entry elemen : hashMap2.entrySet()) {
            System.out.println(elemen.getKey() + " " + elemen.getValue());
        }
        System.out.println("Updated list of elements : ");
        hashMap2.replace(101, "Arthur", "Mbah");
        for (Map.Entry elemen : hashMap2.entrySet()) {
            System.out.println(elemen.getKey() + " " + elemen.getValue());
        }
        System.out.println("Updated list of elements : ");
        hashMap2.replaceAll((a,b) -> "Mulyosugito");
        for (Map.Entry elemen : hashMap2.entrySet()) {
            System.out.println(elemen.getKey() + " " + elemen.getValue());
        }
    }
}
