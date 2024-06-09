package homework.baseTask;

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
        return age;
    }

    public void printMouseDetails() {
        System.out.println("Я мышь,меня зовут " + name + " и мне " + age + " лет");

    }

    public static void main(String[] args) {
        Mouse demo = new Mouse("Leo", 77);
        demo.printMouseDetails();

    }


}
