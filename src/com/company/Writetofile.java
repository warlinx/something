package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writetofile {
    public static void main(String[] args) throws FileNotFoundException {
        //Object test;
        File file = new File("test.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("test");
        pw.println("test");
        pw.close();
    }
}



