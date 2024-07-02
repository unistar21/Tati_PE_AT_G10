package classwork.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class class1 {

    public static void main(String[] args) {
        List<String> moms = Arrays.asList("мама", "папа", "мама");


        boolean ismom = moms.stream().anyMatch(mom -> mom.equals("мама"));
        System.out.println(ismom);

        System.out.println(moms.stream().allMatch(m -> m.contains("м")));

        List<String> newMoms = moms.stream().map(m -> m.concat("м")).toList();
        newMoms.forEach(mom -> System.out.print(mom + " "));

        System.out.println();

        List<String> neww = moms.stream().flatMap(mom -> Arrays.stream(mom.split("а"))).filter(mom -> !mom.isEmpty()).toList();
        neww.forEach(mom -> System.out.print(mom + " "));
    }
}
