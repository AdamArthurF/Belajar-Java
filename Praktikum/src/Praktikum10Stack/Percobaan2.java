/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum10Stack;

import java.util.Iterator;
import java.util.Stack;

public class Percobaan2 {

    public static void main(String[] args) {
        Stack<String> sk= new Stack<>();
        sk.push("a");
        sk.push("c");
        sk.push("e");
        sk.push("d");
        Iterator it=sk.iterator();
        System.out.println("Size before pop() :"+sk.size());
        while(it.hasNext())
        {
            String iValue=(String)it.next();
            System.out.println("Iterator value :"+iValue);
        }
    // get and remove last element from stack
        String value = sk.pop();
        System.out.println("value :"+value);
        System.out.println("Size After pop() :"+sk.size());
    }
}
