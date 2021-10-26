package com.example.demo;

import java.util.stream.Stream;

public class App {
    public static void main (String[] args) {
    //     Stream.iterate(2, number -> number * 2)
    //         .limit(40)
    //         .forEach(n -> System.out.println(n));

    //     System.out.println("Olá");
    // }

    // Multiline String (template string nas outras linguagens)

        String str = "Hello world from one line";
        System.out.println(str);

        // String multiLine = """
        //         Hello
        //         world
        //         from multi line
        // """;

        String multiLine = "SourceLevel 15 and above is required";
        System.out.println(multiLine);
    }
}
