package collectionsexp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Customer>set=new HashSet<>();
        set.add(new Customer(2,"ramesh"));
        set.add(new Customer(3,"lokesh"));
        set.add(new Customer(1,"suresh"));
        System.out.println("size before add="+set.size());
        set.add(new Customer(3,"lokesh"));
        System.out.println("size after add duplicate="+set.size());
        for (Customer customer:set){
            System.out.println(customer.getId()+"-"+customer.getName());
        }
    }
}
