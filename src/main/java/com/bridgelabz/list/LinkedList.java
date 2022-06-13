package com.bridgelabz.list;

public class LinkedList<E> implements IList<E> {
    Node head;

    @Override
    public void add(E num) {
        Node newNode = new Node(num);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
