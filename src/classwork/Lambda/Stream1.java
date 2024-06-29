package classwork.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("мама","мыла","раму","мама","чисто");
        list.stream().filter(e->e.equals("мама")).count();

        System.out.println((list.stream().findFirst().orElse("0")));

        System.out.println((list.stream().filter(e->e.equals("мама")).findFirst().get()));

        System.out.println((list.stream().skip(4).findFirst().get()));

        System.out.println((list.stream().skip(2).limit(2).collect(Collectors.toList())));

        System.out.println(list.stream().filter(e->e.contains("м")).count());
    }
}
