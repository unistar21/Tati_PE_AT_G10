package homework.stream;

import java.util.List;
import java.util.stream.Stream;

public class CarsRunner {

    public static void main(String[] args) {

        List<String> cars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди").toList();

        cars.stream().distinct().filter(car->car.contains("и")).skip(1).map(String::toUpperCase).peek(System.out::println).toList();
    }
}
