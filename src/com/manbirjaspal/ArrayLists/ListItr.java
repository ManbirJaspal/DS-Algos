package com.manbirjaspal.ArrayLists;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItr {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>(10);

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        ListIterator<String> iterator = al.listIterator();

        while(iterator.hasNext()){
            System.out.println("value is : " + iterator.next());
        }

        System.out.println(" ");

        while(iterator.hasPrevious()){
            System.out.println("value is : " + iterator.previous());
        }
        System.out.println(" ");

        ListIterator<String> itr1 = al.listIterator(2);

        while(itr1.hasNext()){
            System.out.println("value is : " + itr1.next());
        }

    }
}
