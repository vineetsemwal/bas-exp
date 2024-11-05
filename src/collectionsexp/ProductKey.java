package collectionsexp;

public class ProductKey {
    private final String model;
    private final String brand;
    private final int year;

    public ProductKey(final String model,final String brand,final int year){
        this.model=model;
        this.brand=brand;
        this.year=year;
    }

    public String getModel() {
        return model;
    }


    public String getBrand() {
        return brand;
    }


    public int getYear() {
        return year;
    }

    @Override
    public int hashCode() {
        return (model+"-"+brand).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this){
           return true;
        }
        if(obj==null || obj.getClass()!=this.getClass()){
            return false;
        }
        ProductKey key = (ProductKey) obj;
        return (model.equals(key.getModel()) && brand.equals(key.getBrand()));
    }

    @Override
    public String toString() {
        return model+"-"+brand+"-"+year;
    }
}
