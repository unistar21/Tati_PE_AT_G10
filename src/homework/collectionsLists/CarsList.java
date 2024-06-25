package homework.collectionsLists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarsList {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        for (String car : cars) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("cars.txt", true))) {
                writer.write("\"" + car + "\"" + "\n");
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            if (car.length() > 4) {
                iterator.remove();
            }
        }

        for (String car : cars) {
            System.out.print(car + " ");
        }


    }
}
