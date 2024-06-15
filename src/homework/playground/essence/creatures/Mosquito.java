package homework.playground.essence.creatures;

import homework.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {

    public Mosquito(int mass, String name) {
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
    public int getMass() {
        return super.getMass();
    }

    @Override
    public void setMass(int mass) {
        super.setMass(mass);
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I am flying to %s", this.getClass().getSimpleName(), this.getName(), direction);
    }
}

