package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrSync {
    // ArrayList
    // HashMap
    // TreeSet
    public static void main(String[] args) {
        // List<String> list = Collections.synchronizedList(new ArrayList<String>());
        List<String> list = new CopyOnWriteArrayList<>();
        
        list.add("Celso");
        list.add("Antero");
        list.add("Pires");

        // synchronized (list) {
            Iterator<String> iterator = list.iterator();

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        // }
    }
    
}
