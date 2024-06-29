package homework.collections2;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;

    public Car(String brand, String model) {
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
        Car car = (Car) obj;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public String toString() {
        return "Car {" +
                "brand " + brand +
                ", model " + model +
                '}';
    }
}
