package homework.collections;

import java.util.Objects;

public class Bubble {
    private int volume;
    private String name;

    public Bubble(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bubble bubble = (Bubble) obj;
        return volume == bubble.volume && Objects.equals(name, bubble.name);
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "volume " + volume +
                ", name " + name +
                 '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, name);
    }

}
