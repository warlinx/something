package com.company.collect;

import java.util.ArrayList;

public class arlist {

        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("one");
            list.add("two");
            list.add("three");
            list.add("four");
            list.add("five");

            //System.out.println(list.size());
            for (String string : list) {
                System.out.println(string);
            }
        }
    }

