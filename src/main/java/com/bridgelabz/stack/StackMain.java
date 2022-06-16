package com.bridgelabz.stack;


public class StackMain {
    public static void main(String[] args) {

        IStack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Removed item:" + stack.pop());
        System.out.println(stack);
        System.out.println("Removed item:" + stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
