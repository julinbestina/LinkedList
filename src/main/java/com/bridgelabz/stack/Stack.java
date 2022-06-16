package com.bridgelabz.stack;

import com.bridgelabz.list.LinkedList;


public class Stack<E> implements IStack<E> {
    LinkedList<E> list = new LinkedList<>();

    public void push(E data) {

        list.add(data);
    }

    public int pop() {

        return list.pop();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "list=" + list +
                '}';
    }
}
