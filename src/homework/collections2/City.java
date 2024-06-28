package homework.collections2;

import homework.collections.Bubble;

import java.util.Objects;

public class Cities {

    private String name;
    private int population;

    public Cities(String name, int population) {
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
        Cities cities = (Cities) obj;
        return population == cities.population && Objects.equals(name, cities.name);

    }

    @Override
    public String toString() {
        return "Cities{" +
                "name " + name +
                ", population " + population +
                '}';
    }
}