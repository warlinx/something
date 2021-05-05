package com.company.diff;



import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/*
Свойства URL
*/

public class Urlreader {
    public static void main(String[] args) throws IOException {
        //decodeURLString("https://www.amrood.com/index.htm?language=en#j2se");
        decodeURLString("https://www.southparkstudios.com/episodes/13y790/south-park-gnomes-season-2-ep-17");
    }

    public static void decodeURLString(String s) {
        try {
            URL url = new URL(s);
            System.out.println("URL is " + url.toString());
            System.out.println("protocol is " + url.getProtocol());
            System.out.println("authority is " + url.getAuthority());
            System.out.println("file name is " + url.getFile());
            System.out.println("host is " + url.getHost());
            System.out.println("path is " + url.getPath());
            System.out.println("port is " + url.getPort());
            System.out.println("default port is " + url.getDefaultPort());
            System.out.println("query is " + url.getQuery());
            System.out.println("ref is " + url.getRef());
        } catch (MalformedURLException e) {
            System.out.println("Parameter " + s + " is not a valid URL.");
        }
    }
}