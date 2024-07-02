package homework.stream;

import java.util.List;
import java.util.stream.Stream;

public class NumbersRunner {

    public static void main(String[] args) {

        List<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699).toList();

        numbers.stream().peek(System.out::println).toList();

        System.out.println();

        numbers.stream().sorted().peek(System.out::println).toList();

        int sum = numbers.stream().mapToInt(number -> number).sum();
        System.out.println("sum: " + sum);

        int sum2 = 0;
        for (Integer number : numbers) {
            sum2 += number;
        }
        System.out.println("sum: " + sum2);
    }
}

