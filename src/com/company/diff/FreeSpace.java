package com.company.diff;


import java.io.*;

public class FreeSpace{
    public static void main(String args[])
    {

        // Create an abstract pathname (File object)
        File f = new File("C:\\program.txt");

        // Display the free size of the partition
        // using the getFreeSpace() function
        System.out.println("Free Space: "
                + f.getFreeSpace());

        System.out.println(f.getParent());
    }
}