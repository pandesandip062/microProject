package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo extends Employee1 {

    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream("C:\\Users\\pande\\OneDrive\\Documents\\demo.txt");
        ObjectOutputStream ob = new ObjectOutputStream(file);
        Employee1 e1= new SerializationDemo();
        e1.setEmpName("Sandeep");
        e1.setSalary(6000);
        e1.setEmpId(54622);
        ob.writeObject(e1);

        System.out.println("File Writing succsful");
    }
}
