/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum10Stack;

import java.util.EmptyStackException;

interface Stack<T>{
    abstract boolean isEmpty();
    abstract T peek();
    abstract T pop();
    abstract void push(T item);
    abstract int size();
}

public class Percobaan3<T> implements Stack<T> {
    T[] value;
    int topOfStack;

    public Percobaan3(int size) {
        value = (T[]) new Object[size];
    }

    @Override
    public boolean isEmpty() {
        return topOfStack == 0;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        topOfStack--;
        return value[topOfStack];
    }

    @Override
    public void push(T item) {
        value[topOfStack] = item;
        topOfStack++;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        topOfStack--;
        T temp = value[topOfStack];
        topOfStack++;
        return temp;
    }

    @Override
    public int size() {
        return topOfStack;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < topOfStack; i++) {
            str.append(value[i]).append(" ");
        }
        return str.toString();
    }

}

class TestStackArr {
    public static void main(String[] args) {
        Percobaan3<String> sa = new Percobaan3<>(10);
        sa.push("Pink");
        sa.push("Purple");
        sa.push("Red");
        System.out.println("Push Stack : " + sa.toString());
        System.out.println("Size Stack : " + sa.size());
        sa.pop();
        System.out.println("Pop Stack : " + sa.toString());
        System.out.println("Peek Stack : " + sa.peek());
        System.out.println("Size Stack : " + sa.size());
    }
}