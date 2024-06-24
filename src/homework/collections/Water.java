package homework.collections;

import java.util.Objects;

public class Water {
    private String color;
    private String smell;

    public Water(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, smell);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Water water = (Water) obj;
        return Objects.equals(color, water.color) && Objects.equals(smell, water.smell);
    }

    @Override
    public String toString() {
        return "Water{" +
                "color=" + color +
                ", smell='" + smell + '\'' +
                '}';
    }
}
