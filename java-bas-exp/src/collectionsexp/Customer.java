package collectionsexp;

public class Customer implements Comparable<Customer>{
    private int id;
    private String name;

    public Customer() {
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Customer customer = (Customer) obj;
        return id == customer.id;
    }

    @Override
    public int compareTo(Customer o) {
        return id-o.id;
    }

    @Override
    public String toString() {
        return id+"-"+name;
    }
}
