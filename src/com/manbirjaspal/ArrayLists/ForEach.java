package com.manbirjaspal.ArrayLists;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);


        arrayList.forEach((n) -> System.out.println(n));
    }

}
