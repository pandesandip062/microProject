package Serialization;

import java.io.*;

public class deSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\pande\\OneDrive\\Documents\\demo.txt");
        ObjectInputStream obj = new ObjectInputStream(fis);
       // Employee1 d = new Employee1();
        System.out.println(obj.readObject());

    }

}
