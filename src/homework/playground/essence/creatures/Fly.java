package homework.playground.essence.creatures;

public class Fly extends Insect{
    public Fly(int mass, String name) {
        super(mass, name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setMass(int mass) {
        super.setMass(mass);
    }

    @Override
    public int getMass() {
        return super.getMass();
    }
}
