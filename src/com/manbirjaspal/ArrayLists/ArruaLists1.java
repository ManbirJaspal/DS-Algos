package com.manbirjaspal.ArrayLists;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArruaLists1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        for(int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        arrayList.remove(3);

        System.out.println(arrayList);

        for (int i = 0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }


}
