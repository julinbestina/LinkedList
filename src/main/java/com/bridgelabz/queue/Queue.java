package com.bridgelabz.queue;

import com.bridgelabz.list.LinkedList;

public class Queue<E> implements IQueue<E> {

    LinkedList<E> list = new LinkedList();

    @Override
    public void enqueue(E data) {
        list.append(data);
    }

    @Override
    public String toString() {
        return "Queue{" +
                "list=" + list +
                '}';
    }
}
