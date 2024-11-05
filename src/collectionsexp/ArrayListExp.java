package collectionsexp;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExp {
    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>();
        list.add(10);
        list.add(25);
        list.add(30);
        list.add(40);
        int element_1=list.get(1);
        System.out.println("element_1="+element_1);
        list.add(0,20);
        System.out.println(list);




    }
}
