package com.example.demo.inlinemethod;

import java.util.ArrayList;

public class InlineMethod {
    public ArrayList method() {
        String[] strings = {"a","b","c"};
        ArrayList list1 = new ArrayList();
        for (int i = 0; i< strings.length; i++)
        {
            list1.add(strings[i]);}
        ArrayList list= list1;
        return list;
    }

}
