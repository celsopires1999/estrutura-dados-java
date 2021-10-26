package com.example.demo;

import java.util.Vector;

public class VectorImpl {
    public static void main(String[] args) {

        // sem especificar o tamanho
        Vector v1 = new Vector<>();

        v1.addElement(1);
        v1.addElement("a");

        System.out.println(v1.size());
        v1.remove(0);
        System.out.println(v1.size());

        // while(v1.iterator().hasNext()) {
        //     System.out.println(v1.iterator().next());
        // }

        Vector v2 = new Vector<>(2, 3);
        System.out.println("capacidade: " + v2.capacity());

        v2.addElement(1);
        v2.addElement("a");

        System.out.println("size:" + v2.size());

        v2.addElement("b");

        System.out.println("size:" + v2.size());
        System.out.println("capacidade: " + v2.capacity());
    }
}
