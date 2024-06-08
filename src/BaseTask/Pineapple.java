package BaseTask;

public class Pineapple {
    private String grade;
    private float heatCapacity;

    public Pineapple(String grade, float heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    // public void setGrade(String grade) {
    //    this.grade = grade;
    //}

    //public void setHeatCapacity(float heatCapacity) {
    //    this.heatCapacity = heatCapacity;
    // }

    public void printPineappleDetails() {
        if (heatCapacity > 2140) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
            System.out.println("В ветчине тепла запасется больше :(");
        }
    }

    public static void main(String[] args) {
        Pineapple demo = new Pineapple("yellow", 20);
        // demo.setHeatCapacity(200);
        //demo.setGrade("yellow");
        demo.printPineappleDetails();
    }
}