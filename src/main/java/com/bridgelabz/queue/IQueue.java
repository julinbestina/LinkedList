package com.bridgelabz.queue;

public interface IQueue<E> {
    public void enqueue(E data);

    public int dequeue();
}
