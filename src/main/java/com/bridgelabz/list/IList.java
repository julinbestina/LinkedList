package com.bridgelabz.list;

public interface IList<E> {
    void add(E num);

    void append(E num);

    void insert(E node, E num);

    int pop();

    int popLast();

    boolean search(E data);

    int index(E data);

    boolean remove(E data);

    int size();
}
