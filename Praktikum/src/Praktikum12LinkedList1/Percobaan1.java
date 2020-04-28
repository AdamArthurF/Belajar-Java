/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum12LinkedList1;

import java.util.Iterator;

public class Percobaan1<T> implements List<T> {
    private Node front = null;
    private int size;

    @Override
    public void addFirst(T item) {
        Node newNode = new Node<>(item);
        if (front != null) {
            newNode.next = front;
        }
        front = newNode;
        size++;
    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public boolean add(T e) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T get(int index) {
        Node<T> curr = front;
        T temp = null;
        int n = 0;
        if (index >= size) {
            return null;
        }
        while (curr != null) {
            if (n == index) {
                temp = curr.nodeValue;
                return temp;
            }
            curr = curr.next;
            n++;
        }
        return temp;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public T removeFirst() {
        Node<T> curr = front;
        front = curr.next;
        curr.next = null;
        T value = curr.nodeValue;
        curr = null;
        size--;
        return value;
    }

    @Override
    public T removeLast() {
        Node<T> curr = front, prev = null;
        while (curr.next != null) {
            prev = curr ;
            curr = curr.next;
        }
        T value = curr.nodeValue ;
        prev.next = null ;
        curr = null ;
        size--;
        return value;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        Node<T> curr = front;
        Node<T> o2 = (Node<T>) o ;
        int i = 0;
        while (curr != null) {
            if (o2.nodeValue.equals(curr.nodeValue))
            { return i;
            } else {
                curr = curr.next;
                i++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString() {
        Node<T> curr = front;
        String str = "[" + curr.nodeValue;
        while (curr.next != null) {
            curr = curr.next;
            str += ", " + curr.nodeValue;
        }
        str += "]";
        return str;
    }

    private class Node<T> {
        public Node<T> next;

        public T nodeValue;

        public Node(T item) {

        }
    }
}
