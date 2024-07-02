package homework.stream;

import java.util.ArrayList;
import java.util.List;

public class CitiesRunner {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        System.out.println(cities.stream().mapToInt(city -> city.length()).sum());

    }
}
