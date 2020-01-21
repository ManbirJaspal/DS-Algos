package com.manbirjaspal.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(5);
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        System.out.println(al.get(0));

        List<String> al1 = al.subList(0, 4);

        System.out.println(al1);


    }
}
