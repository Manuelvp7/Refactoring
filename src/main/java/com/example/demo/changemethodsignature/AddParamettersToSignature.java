package com.example.demo.changemethodsignature;

public class AddParamettersToSignature {
    public void myMethod(int value, double price) {

    }

    public class MyOtherClass {
        public void myMethodCall(AddParamettersToSignature myClass, double price) {
            double d = 0.5;

            myClass.myMethod(1, price);
        }
    }
}
