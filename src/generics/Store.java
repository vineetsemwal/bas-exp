package generics;

public class Store <T> {
    private  T value;

   public T  getValue(){
        return value;
    }

  public void add(T value){
        this.value = value;
    }
}
