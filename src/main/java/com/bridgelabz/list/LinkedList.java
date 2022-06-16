package com.bridgelabz.list;

public class LinkedList<E> implements IList<E> {
    public Node head;

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

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    @Override
    public void insert(E previous, E next, E num) {

        Node newNode = new Node(num);
        Node temp = head;
        Node nextNode = temp.next;

        while (!temp.data.equals(previous) && !(nextNode.data.equals(next))) {
            temp = temp.next;
            nextNode = temp.next;
        }

        temp.next = newNode;
        newNode.next = nextNode;
    }

    @Override
    public int pop() {

        Node temp = head;
        head = head.next;
        return (int) temp.data;
    }

    @Override
    public int popLast() {

        if (head.next == null) {
            head = null;
            return Integer.parseInt(null);
        }

        Node lastNode = head.next;
        Node previousNode = head;

        while (lastNode.next != null) {
            previousNode = lastNode;
            lastNode = lastNode.next;
        }

        previousNode.next = null;
        return (int) lastNode.data;

    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}