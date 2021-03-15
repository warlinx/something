package com.company.diff;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class files {


    public static class Main {

        public static void main(String[] args) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Users\\user\\test.txt"));
            System.out.println(inputStreamReader);
        }
    }
}
