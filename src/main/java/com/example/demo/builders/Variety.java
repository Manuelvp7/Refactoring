package com.example.demo.builders;

public class Variety {
    private String string;

    public Variety(String name) {
        string = name;
    }

    public void setName(String name) {
        string = name;
    }

    public String getName() {
        return string;
    }

    public void saying() {
        System.out.printf("On sale today : %s\n", getName());
    }
}
