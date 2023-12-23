package practisePackage.seri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

public class fileRead {

    public static void main(String[] args)  {
        String s = "This This is Sandip Sandip Pande";
        String [] str = s.split(" ");
        HashSet<String> set = new HashSet<>();
        for(String q:str){
            set.add(q);

        }

        System.out.println(set);





    }
}
