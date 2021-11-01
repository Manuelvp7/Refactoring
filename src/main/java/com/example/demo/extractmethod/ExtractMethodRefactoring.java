package com.example.demo.extractmethod;

public class ExtractMethodRefactoring {

    public void method() {
        int a=1;
        int b=2;
        int c= getC(a, b);
        int d= getC(a, c);
    }

    public int getC(int a, int b) {
        return a + b;
    }

}
