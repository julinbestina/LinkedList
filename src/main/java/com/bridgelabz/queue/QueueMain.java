package com.bridgelabz.queue;

public class QueueMain {
    public static void main(String[] args) {

        IQueue<Integer> queue = new Queue();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println(queue.dequeue());
        System.out.println(queue);

    }
}
