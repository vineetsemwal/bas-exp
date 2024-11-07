package collectionsexp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExp {
    public static void main(String[] args) {

        Map<ProductKey,Product>map=new LinkedHashMap<>();
        ProductKey key1=new ProductKey("m1","galaxy",2021);
        Product product1=new Product(key1,"samsung galaxy",40000);
        ProductKey key2=new ProductKey("i14","iphone",2023);
        Product product2=new Product(key2,"iphone 14",140000);
        map.put(key1,product1);
        map.put(key2,product2);
        Set<ProductKey>keys=map.keySet();
        for (ProductKey key:keys){
            Product product=map.get(key);
            System.out.println("key="+product.getId()+"- product="+product.getName()+"-"+product.getPrice());
        }
    }
}
