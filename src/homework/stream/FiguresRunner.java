package homework.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FiguresRunner {

    public static void main(String[] args) {

        List<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс").peek(System.out::println).toList();

        figures.stream().map(figure -> figure.length()).filter(figure -> figure > 4).peek(System.out::println).toList();
    }
}
