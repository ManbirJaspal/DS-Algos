package com.manbirjaspal.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class AddAll1 {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> al1 = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);

        al1.add(7);
        al1.add(8);
        al1.add(9);
        al1.add(10);
        al1.add(11);

        al.addAll(al1);
        System.out.println(al);

        al.addAll(3, al1);
        System.out.println(al);


    }
}
