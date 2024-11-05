package collectionsexp;

public class Product {
    private ProductKey id;
    private String name;
    private double price;

    public Product(final ProductKey productKey, final String name, final double price) {
        this.id = productKey;
        this.name = name;
        this.price = price;
    }

    public ProductKey getId() {
        return id;
    }

    public void setId(ProductKey id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
