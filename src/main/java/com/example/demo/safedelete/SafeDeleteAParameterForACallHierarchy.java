package com.example.demo.safedelete;

public class SafeDeleteAParameterForACallHierarchy {
    private void foo() { bar();}
    private void bar() { baz();}
    private void baz() { }
}
