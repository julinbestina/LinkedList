package com.bridgelabz.list;

public class Node<E> {
    public E data;
    public Node next;

    public Node(E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
