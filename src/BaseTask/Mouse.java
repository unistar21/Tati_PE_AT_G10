package BaseTask;

public class Mouse {
    private String name;
    private int age;


    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age = age;
    }

    public void printMouseDetails() {
        System.out.println("Я мышь,меня зовут " + name + " и мне " + age + " лет");

    }

    public static void main(String[] args) {
        Mouse Demo = new Mouse("Leo", 77);
        Demo.printMouseDetails();

    }


}
