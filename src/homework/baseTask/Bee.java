package homework.baseTask;

public class Bee {

    private String gender;
    private long weight;

    public Bee(String gender, float weight) {
        this.gender = gender;
        this.weight = (long) weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(float weight) {
        this.weight = (long) weight;
    }

    public String getGender() {
        return gender;
    }

    public long getWeight() {
        return weight;
    }

    public void printBeeDetails() {
        System.out.println("Я легче лося в " + 500 / weight + " раз");
    }

    public static void main(String[] args) {
        Bee demo = new Bee("белая", 250);
        demo.printBeeDetails();

    }
}
