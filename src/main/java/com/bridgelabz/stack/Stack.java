package com.bridgelabz.stack;

import com.bridgelabz.list.LinkedList;
import com.bridgelabz.list.Node;


public class Stack<E> implements IStack<E> {
    LinkedList<E> list = new LinkedList<>();
    Node top;

    public void push(E data) {

        list.add(data);
    }

    public int pop() {

        return list.pop();

    }

    @Override
    public int peek() {
       return (int) list.head.data;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "list=" + list +
                '}';
    }
}
