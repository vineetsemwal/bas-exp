package collectionsexp;

import java.util.Map;
import java.util.TreeMap;

public class MapSortEx {
    public static void main(String[] args) {
        Map<Integer,Customer>map=new TreeMap<>(new IntgerKeyComparator());
        map.put(2,new Customer(2,"ramesh"));
        map.put(1,new Customer(1,"suresh"));
        map.put(3,new Customer(3,"lokesh"));
        System.out.println(map);
    }
}
