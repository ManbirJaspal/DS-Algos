package com.manbirjaspal.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();

        System.out.println("Adding to map using key and value \n" );
        hm1.put(1, "A");
        hm1.put(2, "B");
        hm1.put(3, "C");
        hm1.put(4, "D");
        hm1.put(5, "E");

        System.out.println(hm1);

        System.out.println("getting value by key \n");

        String value = hm1.get(2);

        System.out.println(value + "\n");

        System.out.println("Removing with key \n");

        System.out.println(hm1.remove(4) + "\n" + hm1);

        System.out.println("Contains Key() \n");

        boolean containkeyval = hm1.containsKey(2);

        System.out.println(containkeyval);

        System.out.println("\n Containsvalue() \n");

        System.out.println(hm1.containsValue("C"));

        System.out.println("\n .entrySet() \n");

        System.out.println(hm1.entrySet());

        System.out.println("\n .keySet() \n");

        System.out.println(hm1.keySet());

        System.out.println("\n .values() \n");

        System.out.println(hm1.values());

        HashMap<Integer, String> hm2 = new HashMap<>();
        System.out.println("\n .putAll() \n");

        hm2.putAll(hm1);

        System.out.println(hm2);

        System.out.println("\n .compute(Key, BiFunction) \n");

        hm2.compute(3, (key,val)
                                    -> val.concat(" Updated"));

        System.out.println(hm2.entrySet());

        System.out.println("compute if absent \n");

        hm2.computeIfAbsent(7, k -> "compute if absent val");

        System.out.println(hm2.entrySet());

        HashMap<String, Integer> hash_map = new HashMap<>();

        hash_map.put("Hello", 200);
        hash_map.put("World", 300);
        hash_map.put("yolo", 400);
        hash_map.put("jam", 500);

        System.out.println(hash_map.toString());

        hash_map.forEach((k,v) -> System.out.println(" key is : " + k + " value is : " + v));

        hash_map.replace("Hello", 200, 1000);
        System.out.println(hash_map);

        System.out.println("\n iterating \n");



        Iterator<Integer> itr = hm1.keySet().iterator();

        while(itr.hasNext()) {
            Integer key = itr.next();
            String val = hm1.get(key);
            System.out.println("key: " + key + " val: " + val);
        }

        Iterator<Map.Entry<Integer, String>> entryIterator = hm1.entrySet().iterator();

        while(entryIterator.hasNext()){
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.println("Key is : " + entry.getKey() + ", and value is : " + entry.getValue());
        }


    }
}
