/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum11Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue06QueuePeekOperation {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");

        System.out.println(queue.peek());
        System.out.println(queue);
        queue.clear();
        System.out.println(queue.peek());
    }
}
