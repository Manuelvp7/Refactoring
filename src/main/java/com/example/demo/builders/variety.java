package com.example.demo.builders;

// variety class
public class variety {
    private String string;
    private String string2;
    private String string3;

// constructor
private variety(String name, String name2, String name3) {
        string = name;
        string2 = name2;
        string3 = name3;
    }

    public static variety createvariety(String name, String name2, String name3) {
        return new variety(name, name2, name3);
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
