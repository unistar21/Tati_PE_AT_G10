package homework.stream;

import java.util.List;
import java.util.stream.Stream;

public class NumbersModRunner {

    public static void main(String[] args) {

        List<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090).toList();

        numbersMod.stream().filter(num -> String.valueOf(num).contains("3")).peek(System.out::println).toList();

    }
}
