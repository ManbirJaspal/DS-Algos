package com.manbirjaspal.LinkedHashSets;

import com.manbirjaspal.ArrayLists.ForEach;

import java.util.*;
import java.util.stream.Collectors;

public class LHS {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();

        lhs1.add("A");
        lhs1.add("B");
        lhs1.add("C");
        lhs1.add("Z");
        lhs1.add("D");
        lhs1.add("E");
        lhs1.add("F");

        System.out.println(lhs1);

        lhs1.forEach((n) -> System.out.println(n));

        Iterator<String> itr = lhs1.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        String[] vals = new String[lhs1.size()];

        lhs1.toArray(vals);
        System.out.println("toArray");

        for (String s: vals) {
            System.out.println(s);
        }

        System.out.println(Arrays.toString(vals));

        List<String> als = lhs1.stream().collect(Collectors.toList());

        System.out.println(als);

        List<String> arrlist = new ArrayList<>();

        arrlist.addAll(lhs1);

        System.out.println(arrlist);
    }
}
