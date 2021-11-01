package com.example.demo.changemethodsignature;

public class AddParamettersToSignature {
    public void myMethod(int value, double x) {

    }

    public class MyOtherClass {
        public void myMethodCall(AddParamettersToSignature myClass) {
            double d = 0.5;
            myClass.myMethod(1, d);
        }
    }
}
