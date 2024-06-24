package homework.collectionsLists;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiguresList {

    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        try (FileWriter writer = new FileWriter("figures.txt")) {
            for (String figure : figures) {
                writer.write(figure + " - ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int counter = figures.size();

        for (String figure : figures) {
            if (figure.contains("и")) {
                counter--;
            }
        }
        System.out.println(counter);

        figures = new ArrayList<>(figures);
        figures.add(3, "треугольник");

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}