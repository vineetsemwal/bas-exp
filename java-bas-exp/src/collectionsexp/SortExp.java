package collectionsexp;

import java.util.*;

/**
 * natural ordering of elements
 */
public class SortExp {
    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(25);
        list.add(9);
        list.sort(new DescendingIntegerComparison());
        System.out.println(list);

        Set<Customer> customers=new TreeSet<>(new CustomerByNameDescComparator());
        customers.add(new Customer(2,"ramesh"));
        customers.add(new Customer(3,"lokesh"));
        customers.add(new Customer(1,"suresh"));
        System.out.println(customers);


    }
}
