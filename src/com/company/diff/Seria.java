package com.company.diff;

import java.io.*;

public class Seria {
    public static void main(String[] args) throws Exception
    {
          class Cat implements Serializable {
              public String name;
              public int age;
              public int weight;
        }
        Cat cat = new Cat();

        //save cat to file
        FileOutputStream fileOutput = new FileOutputStream("cat.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(cat);
        fileOutput.close();
        outputStream.close();

        //load cat from file
        FileInputStream fiStream = new FileInputStream("cat.dat");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        Object object = objectStream.readObject();
        fiStream.close();
        objectStream.close();

        Cat newCat = (Cat)object;
    }


}
