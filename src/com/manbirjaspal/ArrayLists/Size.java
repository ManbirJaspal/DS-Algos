package com.manbirjaspal.ArrayLists;

import java.util.ArrayList;

public class Size {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(10);

        al.add("A");
        al.add("b");
        al.add("c");
        al.add("f");
        al.add("f");
        al.add("h");

        System.out.println(al);
    }
}
