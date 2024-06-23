package classwork;

import java.util.ArrayList;
import java.util.List;

public class Class9 {

    public static void main(String[] args) {

        List<String> vegetables = new ArrayList<>();

        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
        System.out.println();

        int counter = 0;

        for (String vegetable : vegetables) {
            if (vegetable.contains("а")) {
                counter++;
            }
        }
        System.out.println(counter);

        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }


    }
}
