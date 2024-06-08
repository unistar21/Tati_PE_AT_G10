package BaseTask;

public class TrainMethodsString {
    public static void main(String[] args) {
        TrainMethodsString Demo = new TrainMethodsString();
        Demo.printMama();
        Demo.printPapa();
        Demo.printString();
        Demo.printMamaString();
    }

    public void printMama() {
        System.out.println("мама мыла раму");
    }


    public void printPapa() {
        System.out.println("папа мыла раму");
    }
    public void printString() {
        String color="green";
        System.out.println(color);
    }
    public void printMamaString() {
        String color="green";

        System.out.println("мама мыла "+color);
    }
}