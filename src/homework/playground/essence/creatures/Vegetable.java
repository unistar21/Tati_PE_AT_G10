package homework.playground.essence.creatures;

public abstract class Vegetable extends Plant{

    public Vegetable(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void setMass(int mass) {
        super.setMass(mass);
    }

    @Override
    public int getMass() {
        return super.getMass();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
