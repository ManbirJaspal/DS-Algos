package com.manbirjaspal.TreeSets;

import java.util.Iterator;
import java.util.TreeSet;

public class TS {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("A");
        ts.add("D");
        ts.add("B");
        ts.add("G");
        ts.add("F");
        ts.add("E");
        ts.add("C");


        System.out.println(ts);

        TreeSet<String> ts1 = new TreeSet<>();

        ts1.add("I");
        ts1.add("H");
        ts1.add("L");
        ts1.add("J");
        ts1.add("K");
        ts1.add("M");
        ts1.add("N");
        ts1.add(null);

        ts.addAll(ts1);

        System.out.println(ts);

        System.out.println(ts.first());
        System.out.println(ts.last());

        System.out.println(ts.headSet("F"));
        System.out.println(ts.tailSet("F"));

        System.out.println(ts.subSet("A", "J"));

        System.out.println(ts.isEmpty());

        System.out.println(ts.size());

        System.out.println(ts.remove(ts.last()));
        System.out.println(ts);

        Iterator<String> itr = ts.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("ceiling below");
        System.out.println(ts.ceiling("H"));
        System.out.println(ts.higher("H"));
        System.out.println(ts.descendingSet());

        ts.pollFirst();
        System.out.println(ts);
    }
}
