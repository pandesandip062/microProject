package Nov3;

import java.util.HashMap;
import java.util.TreeMap;

public class sortedDemo {
    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<>();
        map.put("Sandip", 10.11);
        map.put("Ankush", 19.77);
        map.put("Akshay", 9.99);

        SortingByValues s = new SortingByValues(map);
        TreeMap <String, Double> tr = new TreeMap<>(s);
        tr.putAll(map);
        System.out.println(tr);



    }

}
