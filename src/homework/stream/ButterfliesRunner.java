package homework.stream;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesRunner {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");


        List<String> butterflies1 = butterflies.stream().map(butterfly -> "\"" + butterfly + "\"").toList();

        List<String> butterflies2 = butterflies1.stream().filter(butterfly -> butterfly.contains("a") && butterfly.contains("o")).peek(System.out::println).toList();

    }
}
