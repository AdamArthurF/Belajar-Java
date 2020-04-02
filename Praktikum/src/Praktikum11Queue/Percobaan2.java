/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum11Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Percobaan2 {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("A");
        myQueue.add("B");
        myQueue.add("C");
        myQueue.add("D");
        List<String> myList = new ArrayList<>(myQueue);
        for (Object theFruit : myList)
            System.out.println(theFruit);
    }
}
