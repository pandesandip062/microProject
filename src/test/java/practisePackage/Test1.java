package practisePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Test1 {
    private static final long serialVersionUID = -8316380005289388388L;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fs = new FileInputStream("C:\\Users\\pande\\OneDrive\\Documents\\demo.txt");
        ObjectInputStream obj = new ObjectInputStream(fs);
        Object ob =obj.readObject();
        System.out.println(obj.readObject());
    }
}

