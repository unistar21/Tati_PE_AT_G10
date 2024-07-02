package classwork.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        int count = 0;

        for (Person person : people) {
            if ((person.getSex() == Person.Sex.WOMEN && person.getAge() < 55 && person.getAge() > 18)
                    || (person.getSex() == Person.Sex.MAN && person.getAge() < 60) && person.getAge() > 18) {
                count++;
            }

        }
        System.out.println(count);

       long sum =people.stream().filter(person -> {
           return (person.getSex() == Person.Sex.WOMEN && person.getAge() < 55 && person.getAge() > 18)
                   || (person.getSex() == Person.Sex.MAN && person.getAge() < 60 && person.getAge() > 18);
       }).count();

        System.out.println(sum);

    }
}
