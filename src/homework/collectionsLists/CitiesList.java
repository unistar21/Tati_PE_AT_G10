package homework.collectionsLists;

import java.util.ArrayList;
import java.util.List;

public class CitiesList {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String city : cities) {
            System.out.println(city);
        }

        int sum = 0;

        for (String city : cities) {
            sum += city.length();
        }
        System.out.println(sum);


        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }


}

