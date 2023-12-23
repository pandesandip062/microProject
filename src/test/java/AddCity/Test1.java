package AddCity;

import java.util.ArrayList;
import java.util.HashMap;

public class Test1 {

    public static void main(String[] args) {
        ArrayList<String> Mh = new ArrayList<>();
        Mh.add("mumbai");
        Mh.add("Pune");

        ArrayList<String> Kr = new ArrayList<>();
        Kr.add("Bangolore");
        Kr.add("Mysore");

        ArrayList<String> Mp = new ArrayList<>();
        Mp.add("Bhopal");
        Mp.add("Indore");

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        map.put("Maharstra",Mh);
        map.put("Karanatka",Kr);
        map.put("Madhay Pardesh",Mp);

        System.out.println(map);

        HashMap<String , HashMap<String ,ArrayList<String>>> map1 = new HashMap<>();
        map1.put("India",map);

        System.out.println(map1);
    }

}
