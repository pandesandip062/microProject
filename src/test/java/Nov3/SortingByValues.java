package Nov3;

import java.nio.DoubleBuffer;
import java.util.Comparator;
import java.util.Map;

public class SortingByValues implements Comparator<String> {
    Map<String, Double> map;

    public SortingByValues(Map<String, Double> map) {
        this.map = map;
    }

    @Override
    public int compare(String o1, String o2) {
        if(map.get(o1)>map.get(o2)){
            return 1;
        } else if (map.get(o1)<map.get(o2)) {
            return -1;
        }
        return 0;
    }
}
