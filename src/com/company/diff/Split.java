package com.company.diff;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String s = "Good news everyone!";
        String[] ss = s.split("n");
        System.out.println(Arrays.toString(ss));
    }
}
