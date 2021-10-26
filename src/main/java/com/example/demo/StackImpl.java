package com.example.demo;

import java.util.Random;
import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        Stack stack = new Stack<>();

        Random randon = new Random();

        int i = 5;

        while (i != 0) {
            System.out.println("Push: " + stack.push(randon.nextInt(20)));
            i--;
        }

        // for (int c = 0; c < 5; c++ ) {
        while (!stack.empty()) {
            System.out.println("Pop: " + stack.pop());
        }
    }
}
