package com.example.demo.safedelete;

public class SafeDeleteAParameterForACallHierarchy {

    private void foo(int i) { bar(i);}
    private void bar(int i) { baz(i);}
    private void baz(int i) { }

}
