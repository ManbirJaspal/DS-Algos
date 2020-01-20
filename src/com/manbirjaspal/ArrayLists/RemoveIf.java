package com.manbirjaspal.ArrayLists;

import java.util.ArrayList;

public class RemoveIf {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(23);
        al.add(32);
        al.add(45);
        al.add(63);
        al.add(110);

        al.removeIf(n -> (n % 3 == 0));

        System.out.println(al);
    }
}
