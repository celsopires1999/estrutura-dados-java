package com.example.demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {
        Queue queue = new LinkedList<>();

        System.out.println("put a: " + queue.add("a"));
        System.out.println("put b: " + queue.add("b"));

        System.out.println("current: " + queue.element());

        System.out.println("get: " + queue.poll());

        System.out.println("current: " + queue.element());
        System.out.println("get: " + queue.poll());

        System.out.println("current: " + queue.peek());

    }
}
