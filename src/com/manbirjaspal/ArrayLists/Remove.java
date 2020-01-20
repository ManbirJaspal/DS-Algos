package com.manbirjaspal.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Remove {

    public static void main(String[] args) {
        List<String> arrlist = new ArrayList<>(3);
        arrlist.add("hello");
        arrlist.add("world");
        arrlist.add("lol");
        arrlist.add("hello");

        arrlist.remove("hello");
        System.out.println(arrlist);
        arrlist.remove("lol");
        System.out.println(arrlist);
        arrlist.remove(1);
        System.out.println(arrlist);


    }
}
