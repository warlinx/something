package com.company.diff;

public class ReFind {
    public static void main(String[] args) {
        int a = 5;
        int[] array = new int[]{1, 2, 4, 5, 2, 5, 7, 5, 2, 8, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                System.out.println(i);
            }
        }
    }
}