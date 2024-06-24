package homework.collections;

import java.util.Objects;

public class Chair {
    private int height;
    private int width;

    public Chair(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Chair chair = (Chair) obj;
        return height == chair.height && width == chair.width;
    }

    @Override
    public String toString() {
        return "Sand{" +
                "height=" + height +
                ", width='" + width + '\'' +
                '}';
    }
}
