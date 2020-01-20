package com.manbirjaspal.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class GetSet {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>(5);

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        System.out.println(al);

        al.set(2, "F");

        System.out.println(al);

        System.out.println(al.get(3));
    }
}
