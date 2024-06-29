package homework.collections2;

import java.util.Objects;

public class City {

    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        City city = (City) obj;
        return population == city.population && Objects.equals(name, city.name);

    }

    @Override
    public String toString() {
        return "Cities{" +
                "name " + name +
                ", population " + population +
                '}';
    }
}