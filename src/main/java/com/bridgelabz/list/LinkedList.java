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
    public void append(E num) {

        Node newNode = new Node(num);
        if(head == null) {
            head = newNode;
            return;
        }

        Node temp=head;
        while(temp.next != null) {
            temp= temp.next;
        }
        temp.next = newNode;


    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
