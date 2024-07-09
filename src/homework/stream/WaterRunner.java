package homework.stream;

import homework.collections.Water;

import java.util.List;
import java.util.stream.Stream;

public class WaterRunner {

    public static void main(String[] args) {

        List<Water> waterL = Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный")
        ).toList();

        waterL.stream().filter(x -> !x.getColor().equals("Прозрачная")).sorted((x, y) -> x.getSmell().compareTo(y.getSmell())).peek(System.out::println).toList();

    }
}
