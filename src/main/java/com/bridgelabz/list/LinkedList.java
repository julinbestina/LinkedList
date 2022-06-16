package com.bridgelabz.list;

public class LinkedList<E> implements IList<E> {
    public Node head;
    int count = 0;

    public LinkedList() {
    }

    @Override
    public void add(E num) {

        Node newNode = new Node(num);

        if (head == null) {
            head = newNode;
            count++;
            return;
        }

        newNode.next = head;
        head = newNode;
        count++;
    }

    @Override
    public void append(E num) {

        Node newNode = new Node(num);

        if (head == null) {
            head = newNode;
            count++;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        count++;
    }

    @Override
    public void insert(E node, E num) {

        Node newNode = new Node(num);
        Node temp = head;
        Node nextNode = temp.next;

        while (!temp.data.equals(node)) {
            temp = temp.next;
            nextNode = temp.next;
        }

        temp.next = newNode;
        newNode.next = nextNode;
        count++;
    }

    @Override
    public int pop() {

        Node temp = head;
        head = head.next;
        count--;
        return (int) temp.data;
    }

    @Override
    public int popLast() {

        if (head.next == null) {
            head = null;
            count--;
            return Integer.parseInt(null);
        }

        Node lastNode = head.next;
        Node previousNode = head;

        while (lastNode.next != null) {
            previousNode = lastNode;
            lastNode = lastNode.next;
        }

        previousNode.next = null;
        count--;
        return (int) lastNode.data;

    }

    @Override
    public boolean search(E data) {

        Node temp = head;

        while (temp != null) {
            if (temp.data.equals(data))
                return true;
            else
                temp = temp.next;
        }

        return false;
    }

    @Override
    public int index(E data) {
        int i = 0;

        Node temp = head;
        while (temp != null && !temp.data.equals(data)) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    @Override
    public boolean remove(E data) {
        if (head.data.equals(data)) {
            head = head.next;
            count--;
            return true;
        }
        Node previousNode = head;
        Node requiredNode = null;
        while (previousNode.next != null && !previousNode.next.data.equals(data)) {
            previousNode = previousNode.next;
        }
        requiredNode = previousNode.next;
        previousNode.next = requiredNode.next;
        count--;
        return true;
    }

    @Override
    public int size() {
        return count;
//        int i = 0;
//
//        Node temp = head;
//        while (temp != null) {
//            i++;
//            temp = temp.next;
//        }
//        return i;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}