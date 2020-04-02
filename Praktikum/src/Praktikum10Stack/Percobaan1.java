/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum10Stack;

import java.util.Stack;

public class Percobaan1 {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("Java");
        s.push("Source");
        s.push("and");
        System.out.println("Next: " + s.peek());
        s.push("Support");
        System.out.println(s.pop());
        s.push(".");
        int count = s.search("Java");
        while (count != -1 && count > 1) {
            s.pop();
            count--;
        }
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}
