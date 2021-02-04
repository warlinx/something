package com.company.diff;

import java.util.ArrayList;

public class Arrlist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hater");
        names.add("Fucker");
        names.add("Dumper");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
            
        }
        System.out.println();

        for (String name: names) {
            System.out.println(name);
        }
    }
}
