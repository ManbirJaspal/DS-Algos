package com.manbirjaspal.ArrayLists;

import java.util.ArrayList;

public class RemoveAll {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(5);
        ArrayList<Integer> al1 = new ArrayList<>(5);

        al.add(1);
        al.add(2);
        al.add(3);


        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);
        al1.add(5);

        al1.removeAll(al);

        System.out.println(al1);

    }
}
