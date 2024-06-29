package classwork.Lambda;

public class Runner {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        //mc.justMethod(() -> 3.14);

       // mc.justMethod((x)->System.out.println(x));
      //  mc.justMethod(System.out::println);

        MyClass class1 =new MyClass();
        class1.justMethod(ClassX::new);


    }
}
