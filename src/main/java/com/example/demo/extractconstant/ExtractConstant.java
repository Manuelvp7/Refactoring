package com.example.demo.extractconstant;

import java.util.ArrayList;

public class ExtractConstant {
    public void method() {
        ArrayList list = new ArrayList();
        list.add("string");
        anotherMethod("string");
    }

    private void anotherMethod(String string) {
    }
}
