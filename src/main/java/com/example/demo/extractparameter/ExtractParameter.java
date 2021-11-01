package com.example.demo.extractparameter;

public class ExtractParameter {
    public static void print() {
        System.out.println(generateText());
    }

    private static String generateText() {
        return generateText("Hello, World!");
    }

    private static String generateText(String text) {
        return text.toUpperCase();
    }
}
