/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum11Queue;

import java.util.LinkedList;

interface Queue<T>{
    boolean isEmpty();
    T peek();
    T pop();
    void push(T item);
    int size();
}

public class Percobaan3<T> implements Queue<T> {
    private LinkedList<T> qlist = null;
    public Percobaan3 ()
    {
        qlist = new LinkedList<T>();
    }
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public T peek() {
        return qlist.getFirst();
    }
    @Override
    public T pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void push(T item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class TestQueue {
    public static void main(String[] args) {
        Percobaan3<String> queue = new Percobaan3<String>();
        System.out.println(queue.isEmpty());
        queue.push("Java");
        queue.push("DotNet");
        queue.push("PHP");
        queue.push("HTML");
        System.out.println("remove: " + queue.pop());
        System.out.println("peek: " + queue.peek());
        System.out.println("size: " + queue.size());
    }
}