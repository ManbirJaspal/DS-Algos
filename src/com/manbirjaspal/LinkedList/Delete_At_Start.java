package com.manbirjaspal.LinkedList;

import java.util.LinkedList;

public class Delete_At_Start {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("G");

        System.out.println(ll);

        ll.addFirst("Z");

        System.out.println(ll);

        ll.addLast("LAST");

        System.out.println(ll);

        ll.add(1, "Second");

        System.out.println(ll);

        ll.removeFirst();

        System.out.println(ll);
    }
}
