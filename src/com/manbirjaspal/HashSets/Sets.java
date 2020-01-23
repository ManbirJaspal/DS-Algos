package com.manbirjaspal.HashSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> hs1 = new HashSet<>();
        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        hs1.add(50);
        hs1.add(60);
        hs1.add(null);
        hs1.add(null);

        System.out.println(hs1);
        System.out.println(hs1.contains(null));
        System.out.println(hs1.remove(20));

        Iterator<Integer> itr = hs1.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        hs1.forEach((n) -> System.out.println(n));

        }
    }


