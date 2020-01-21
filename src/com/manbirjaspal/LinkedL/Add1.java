package com.manbirjaspal.LinkedL;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Add1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        ll.forEach((n) -> System.out.println(n));

        ll.add(2, 9);

        System.out.println(ll);

        add_All(ll);

        ll.addFirst(222);

        System.out.println(ll);

        ll.addLast(444);
        System.out.println(ll);

        LinkedList<Integer> cloneList = new LinkedList<>();
        cloneList = (LinkedList) ll.clone();

        System.out.println("clone list is : " + cloneList);

        System.out.println(ll.contains(222));
        System.out.println(ll.element());
        System.out.println(ll);

        System.out.println(ll.get(3));

        System.out.println("getFirst: " + ll.getFirst());
        System.out.println("getLast: " + ll.getLast());

        System.out.println(ll.indexOf(222));
        System.out.println(ll.indexOf(2222));

        System.out.println(ll.lastIndexOf(4));

        ListIterator<Integer> itr = ll.listIterator(4);

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Peek: " + ll.peek());
        System.out.println("PeekFirst: " + ll.peekFirst());
        System.out.println("PeekLast: " + ll.peekLast());

        System.out.println("pollFirst: " + ll.pollFirst());
        System.out.println("pollFirst: " + ll.pollLast());
        System.out.println(ll);

        ll.pop();
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);
        ll.push(404);
        System.out.println(ll);

        System.out.println(ll.remove());
        System.out.println(ll);
        System.out.println(ll.removeFirst());
        System.out.println(ll);
        Object[] arr = ll.toArray();
        System.out.println(Arrays.toString(arr));

    }

    public static void add_All(LinkedList<Integer> ll1){
        LinkedList<Integer> ll2 = new LinkedList<>();

        ll2.add(10);
        ll2.add(20);
        ll2.add(30);
        ll2.add(40);
        ll2.add(50);

        ll2.addAll(ll1);
        System.out.println(ll2);
        ll2.addAll(3, ll1);
        System.out.println(ll2);


    }
}

