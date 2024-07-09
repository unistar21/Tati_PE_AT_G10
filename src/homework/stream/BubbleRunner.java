package homework.stream;

import homework.collections.Bubble;

import java.util.Arrays;
import java.util.List;

public class BubbleRunner {

    public static void main(String[] args) {

        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        List<Bubble> bub1 = bubbles.stream().filter(x -> x.getVolume() > 3).sorted((x, y) -> x.getName().compareTo(y.getName())).peek(System.out::println).toList();

        System.out.println();

        bub1.stream().map(x -> x.getVolume() * 3).peek(System.out::println).toList();


        int sum = bub1.stream().mapToInt(Bubble::getVolume).sum();

        System.out.println(sum);

        for (Bubble bub : bub1) {
            sum += bub.getVolume();
        }
        System.out.println(sum);


    }

}
