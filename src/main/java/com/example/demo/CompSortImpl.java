package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompSortImpl {
    public static void main(String[] args) {
        List<Person> arr = new ArrayList<Person>();

        arr.add(new Person("Celso", 23));
        arr.add(new Person("Inês", 26));
        arr.add(new Person("Antero", 24));
        arr.add(new Person("Pires", 25));

        for (Person p : arr) {
            System.out.println(p.getName() + " " + p.getAge());
        }

        // Collections.sort((List) arr);
        Collections.sort((List) arr, new Person());

        for (Person p : arr) {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
