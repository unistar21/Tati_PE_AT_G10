package homework.collections2;

import java.util.Objects;

public class Cars {

    private String brand;
    private String model;

    public Cars(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cars cars = (Cars) obj;
        return Objects.equals(brand, cars.brand) && Objects.equals(model, cars.model);
    }

    @Override
    public String toString() {
        return "Car {" +
                "brand " + brand +
                ", model " + model +
                '}';
    }
}
