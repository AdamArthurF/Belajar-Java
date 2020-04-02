/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum11Queue;

import java.util.NoSuchElementException;

interface BQueue<T> extends Queue<T>{
    abstract boolean full();
}

public class Percobaan4<T> implements BQueue<T>{
    private T Arr[] ;
    private int qfront = 0 ;
    private int qback = 0 ;
    private int qcapacity = 0 ;
    public Percobaan4() {
        Arr = (T[]) new Object[50];
        qcapacity = 50;
    }
    public Percobaan4(int size) {
        Arr = (T[]) new Object[size];
        qcapacity = size;
    }
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public T peek() {
        throw new UnsupportedOperationException("Not supported yet.");
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
    @Override
    public boolean full() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class Main {
    public static void main(String[] args) {
        try {
            Percobaan4<Integer> arr = new Percobaan4<Integer>(5);
            arr.push(1);
            arr.push(4);
            arr.push(10);
            arr.push(2);
            arr.push(7);
            arr.pop();
            arr.pop();
            arr.push(17);
            arr.push(3);
            arr.push(27);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}