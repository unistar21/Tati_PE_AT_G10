package homework.collectionsLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CountriesList {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(List.of("Андора", "Португалия", "Англия", "Замбия"));

        for (String country : countries) {
            System.out.print(country + ", ");
        }
        System.out.println();

        int counter = 0;
        for (String figure : countries) {
            if (figure.length() < 7) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }


    }
}
