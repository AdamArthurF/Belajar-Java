/*
 * Copyright (c) 2020. Adam Arthur Faizal
 */

package Praktikum10Stack;

public class KelasStack {
    int ar[] = new int[10];
    int top = -1;

    public void push(int angka) {
        if (!isFull()) {
            top++;
            ar[top] = angka;
            System.out.println("Angka " + angka + " berhasil di push");
        } else {
            System.out.println("Stack penuh");
        }
    }

    public void pop(){
        if (!isEmpty()) {
            int indexPop = top;
            top--;
            System.out.println("Stack indeks " + indexPop + " berhasil di pop");
        } else {
            System.out.println("Stack kosong");
        }
    }

    public void view(){
        if (!isEmpty()) {
            System.out.print("Isi stack sekarang : ");
            for (int i = 0; i <= top; i++) {
                System.out.print(ar[i] + " ");
            }
            System.out.println("");
        } else {
            System.out.println("Stack kosong");
        }
    }

    boolean isFull(){
        if (top == ar.length) {
            return true;
        } else {return false;}
    }

    boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        KelasStack ks = new KelasStack();
        ks.push(3);
        ks.view();
        ks.push(5);
        ks.push(6);
        ks.view();
        ks.pop();
    }
}
