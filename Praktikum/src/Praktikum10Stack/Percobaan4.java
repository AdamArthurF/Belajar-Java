/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum10Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
public class Percobaan4<T> implements Stack<T> {
    private ArrayList<T> stackList = null;

    public Percobaan4() {
        stackList = new ArrayList<T>();
    }

    @Override
    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.remove(stackList.size() - 1);
    }

    @Override
    public void push(T item) {
        stackList.add(item);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.get(stackList.size() - 1);
    }

    @Override
    public int size() {
        return stackList.size();
    }

    public Iterator<T> iterator() {
        return stackList.iterator();
    }
}

class TestALStack {
    public static void main(String[] args) {
        Percobaan4<String> sa = new Percobaan4<>();
        sa.push("Pink");
        sa.push("Purple");
        sa.push("Red");
        System.out.println("Size Stack : " + sa.size());
        sa.pop();
        System.out.println("Peek Stack : " + sa.peek());
        System.out.println("Size Stack : " + sa.size());
        Iterator it = sa.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator Value : " + it.next());
        }
    }
}