/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum11Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queue09QueueToArray {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.add("five");
        String[] stringArray = queue.toArray(new String[queue.size()]);
        System.out.println(Arrays.toString(stringArray));
    }
}
