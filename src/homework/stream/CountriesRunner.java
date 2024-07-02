package homework.stream;

import java.util.List;
import java.util.stream.Stream;

public class CountriesRunner {

    public static void main(String[] args) {

        List<String> counties = Stream.of("Андора", "Португалия", "Англия", "Замбия").toList();

        counties.stream().filter(country -> country.contains("А") && country.length() < 7).map(String::toUpperCase).map(x -> "\"" + x + "\"").peek(System.out::println).toList();


    }
}
