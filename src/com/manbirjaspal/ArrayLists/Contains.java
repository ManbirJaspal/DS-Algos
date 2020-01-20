package com.manbirjaspal.ArrayLists;

import java.util.ArrayList;

public class Contains {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>(4);

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        if(arr.contains(10)){
            System.out.println("element exists");
        }
        else {
            System.out.println("element doesnt exist");
        }
    }
}
