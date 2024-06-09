package homework.baseTask;

public class Souse {

    private String name;
    private String color;

    public Souse(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void SetColor(String color) {
        this.color = color;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void printSouceDetails() {
        System.out.println("Это соус " + name + " "+color + " цвета");
    }

    public static void main(String[] args) {
        Souse demo=new Souse("Tfp", "black");
        demo.printSouceDetails();
    }

}
