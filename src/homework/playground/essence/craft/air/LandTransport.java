package homework.playground.essence.craft.air;

import homework.playground.essence.Matter;
import homework.playground.essence.craft.Rideable;
import homework.playground.essence.craft.Transportable;

public abstract class LandTransport extends Matter implements Transportable, Rideable {
    protected String name;

    public LandTransport(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
