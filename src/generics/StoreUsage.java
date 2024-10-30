package generics;

public class StoreUsage {
    public static void main(String[] args) {
        Store<Integer> store = new Store();
        store.add(10);
        Integer value=store.getValue();
        System.out.println(value);
    }
}
