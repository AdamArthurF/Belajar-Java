/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum12LinkedList1;

import java.util.Iterator;

public interface List<T> {
    abstract void addFirst(T item);
    abstract void addLast(T item);
    abstract boolean add(T e);
    abstract int size();
    abstract void add(int index, T element);
    abstract boolean isEmpty();
    abstract T get(int index);
    abstract T set(int index, T element);
    abstract String toString();
    abstract Object[] toArray();
    abstract boolean contains(Object o);
    abstract boolean remove(Object o);
    abstract T removeFirst();
    abstract T removeLast();
    abstract T remove(int index);
    abstract int indexOf(Object o);
    abstract int lastIndexOf(Object o);
    abstract Iterator<T> iterator();
}
