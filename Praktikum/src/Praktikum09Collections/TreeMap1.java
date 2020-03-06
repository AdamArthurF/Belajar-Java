/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum09Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Data1");
        treeMap.put(23, "Data2");
        treeMap.put(70, "Data3");
        treeMap.put(4, "Data4");
        treeMap.put(2, "Data5");

        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.print("key is " + entry.getKey() + " & Value is : ");
            System.out.println(entry.getValue());
        }
    }
}
