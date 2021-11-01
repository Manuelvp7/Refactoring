package com.example.demo.extractfield;

public class ExtractField {

    AnotherFieldClass anotherClass;
    public void method() {
        int a = 1;

        int b = a + anotherClass.intValue();
        int c = b + anotherClass.intValue();
    }
}
