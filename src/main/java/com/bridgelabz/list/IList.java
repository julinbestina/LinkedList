package com.bridgelabz.list;

public interface IList<E> {
    void add(E num);
    void append(E num);
    void insert(E previous, E next, E num);

}
