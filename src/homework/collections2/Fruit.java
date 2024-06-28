package homework.collections2;

import java.util.Objects;

public class Fruits {

    private String name;
    private int weight;

    public Fruits(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fruits fruits = (Fruits) obj;
        return weight == fruits.weight && Objects.equals(name, fruits.name);
    }

    @Override
    public String toString() {
        return "Fruit {" +
                "name " + name +
                ", weight " + weight +
                '}';
    }
}
