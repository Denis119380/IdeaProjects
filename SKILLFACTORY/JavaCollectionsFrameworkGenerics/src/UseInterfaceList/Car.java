package UseInterfaceList;

public class Car {

    private String Brand;

    private String name;

    private boolean onSale;

    public Car(String Brand, String name, boolean onSale) {
        this.Brand = Brand;
        this.name = name;
        this.onSale = onSale;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getName() {
        return name;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand: " + Brand + ", " +
                "name: " + name + ", " +
                "onSale: " + onSale + "}";
    }
}
