package com.manbirjaspal.ArrayLists;

import java.util.ArrayList;

public class RetainAll {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("AB");
        arrayList.add("ABC");
        arrayList.add("ABCD");
        arrayList.add("ABCDEF");

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("A");
        arrayList1.add("ABC");
        arrayList1.add("ABCDEF");
        arrayList1.add("g");
        arrayList1.add("t");
        arrayList1.add("s");

        System.out.println(arrayList);
        System.out.println(arrayList1);

        arrayList1.retainAll(arrayList);

        System.out.println("arraylist: "+ arrayList);
        System.out.println("arrayList1" + arrayList1);
    }
}
