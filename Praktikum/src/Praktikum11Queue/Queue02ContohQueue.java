/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum11Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue02ContohQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("satu");
        queue.add("dua");
        queue.add("tiga");
        queue.add("empat");
        queue.add("lima");
        System.out.println(queue);

        queue.remove("tiga");
        System.out.println(queue);
        System.out.println("Queue size : " + queue.size());
        System.out.println("Queue contains element 'two' or not? " + queue.contains("two"));
        queue.clear();
        System.out.println(queue);
    }
}
