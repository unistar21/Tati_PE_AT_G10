package homework.collectionsLists;

import java.util.Arrays;
import java.util.List;

public class DoublesList {

    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (Double number : doubles) {
            System.out.print(number + " ");
        }

        System.out.println();

        double multipl = 1;
        for (Double number : doubles) {
            multipl *= number;
        }
        System.out.println(multipl);

        double sum = 0;
        for (Double number : doubles) {
            sum += number - number.intValue();
        }
        System.out.println(sum);

        for (int i = 0; i < doubles.size(); i++) {
            System.out.print(doubles.get(i).intValue() + " ");
        }
    }
}
