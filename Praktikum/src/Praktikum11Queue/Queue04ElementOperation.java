/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum11Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue04ElementOperation {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        System.out.println(queue.element());
        System.out.println(queue);
        queue.clear();
        try {
            System.out.println(queue.element());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
