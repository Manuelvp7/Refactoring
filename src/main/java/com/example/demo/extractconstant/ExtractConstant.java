package com.example.demo.extractconstant;

import java.util.ArrayList;

public class ExtractConstant {
    private static final String STRING = "string";

    public void method() {
        ArrayList list = new ArrayList();
        list.add(STRING);
        anotherMethod(STRING);
    }

    private void anotherMethod(String string) {
    }
}
