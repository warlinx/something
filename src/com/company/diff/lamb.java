package com.company.diff;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class lamb {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Привет", "как", "дела?");
        list.forEach( (s) -> System.out.println(s) );
    }
}
