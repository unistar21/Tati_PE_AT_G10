package homework.playground.essence.creatures;

public class Beetle extends Insect {
    public Beetle(int mass, String name) {
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

    public void nest(Carrot home) {
        if (this.getMass() < home.getMass()) {
            System.out.println("I am " + this.name + " and I will nest there with " + home.getMass() / this.mass + " my family members");
        } else {
            System.out.println("This carrot is too small for nesting");

        }
    }
}

