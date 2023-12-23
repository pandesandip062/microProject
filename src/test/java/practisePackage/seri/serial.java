package practisePackage.seri;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serial {

    public static void main(String[] args) throws IOException {
        emp e1 = new emp(1,"Sandip Pande");
        FileOutputStream fio = new FileOutputStream("C:\\Users\\pande\\OneDrive\\Documents\\demo.txt");
        ObjectOutputStream obj = new ObjectOutputStream(fio);
        obj.writeObject(e1);
        System.out.println("file write succesfully");
    }
}
