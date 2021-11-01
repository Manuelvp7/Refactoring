package com.example.demo.extractfield;

public class ExtractField {

    AnotherFieldClass anotherClass;
    private int anInt;

    public void method() {
        int a = 1;

        anInt = anotherClass.intValue();
        int b = a + anInt;
        int c = b + anInt;
    }
}
