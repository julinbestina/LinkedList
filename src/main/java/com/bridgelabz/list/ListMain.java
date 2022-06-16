package com.bridgelabz.list;


public class ListMain {
    public static void main(String[] args) {

        System.out.println("Welcome to LinkedList Program");
        IList<Integer> list = new LinkedList<Integer>();
        list.add(70);
        list.add(56);

        System.out.println(list);

        list.insert(56, 70, 30);

        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);
        System.out.println(list.popLast());
        System.out.println(list);
    }
}