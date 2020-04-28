/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum12LinkedList1;

import java.util.Iterator;

public interface List<T> {
    void addFirst(T item);
    void addLast(T item);
    boolean add(T e);
    int size();
    void add(int index, T element);
    boolean isEmpty();
    T get(int index);
    T set(int index, T element);
    String toString();
    Object[] toArray();
    boolean contains(Object o);
    boolean remove(Object o);
    T removeFirst();
    T removeLast();
    T remove(int index);
    int indexOf(Object o);
    int lastIndexOf(Object o);
    Iterator<T> iterator();
}
