package com.bridgelabz.list;


public class ListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList Program");
        IList<Integer> list = new LinkedList<Integer>();
        list.add(70);
        list.add(30);
        list.add(56);
        list.append(56);
        list.append(30);
        list.append(70);
        System.out.println(list);
    }
}