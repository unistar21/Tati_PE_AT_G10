package baseTask;

public class TrainMethodsString {

    public static void main(String[] args) {
        TrainMethodsString demo = new TrainMethodsString();
        demo.printMama();
        demo.printPapa();
        demo.printString();
        demo.printMamaString();
    }

    public void printMama() {
        System.out.println("мама мыла раму");
    }


    public void printPapa() {
        System.out.println("папа мыла раму");
    }

    public void printString() {
        String color = "green";
        System.out.println(color);
    }

    public void printMamaString() {
        String color = "green";

        System.out.println("мама мыла " + color);
    }
}