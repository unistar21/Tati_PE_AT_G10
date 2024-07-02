package classwork.streams;

import java.util.Arrays;
import java.util.List;

public class Class2 {

    public static void main(String[] args) {

        List<String> moms = Arrays.asList("мама", "яма", "раму");

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println(moms.stream().sorted().toList());

        System.out.println(moms.stream().sorted((x, y) -> -x.compareTo(y)).toList());

        List<Person> newPeople = people.stream().sorted((x, y) -> {
            if (x.getSex().compareTo(y.getSex()) == 0) {
                return x.getAge() - y.getAge();
            } else {
                return x.getSex().compareTo(y.getSex());
            }
        }).peek(System.out::println).toList();



    }
}
