package com.company.diff;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {
    public static void main(String[] args) throws IOException {


        FileOutputStream zipFile = new FileOutputStream("c:/archive.zip");
        ZipOutputStream zip = new ZipOutputStream(zipFile);

//кладем в него ZipEntry – «архивный объект»
        zip.putNextEntry(new ZipEntry("document.txt"));

        //копируем файл «document-for-archive.txt» в архив под именем «document.txt»
        File file = new File("c:/document-for-archive.txt");


        Files.copy(file.toPath(), zip);

// закрываем архив
        zip.close();
    }
}
