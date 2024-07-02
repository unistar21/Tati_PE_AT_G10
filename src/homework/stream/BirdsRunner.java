package homework.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {

    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        List<String> newww = Arrays.stream(birds.stream().map(bird -> bird.replace("о", "а")).map(String::toLowerCase).map(bird -> bird.replace("ь", "")).collect(Collectors.joining()).split("б")).toList();

        for (String line : newww) System.out.println("--" + line + "--");

    }

}

