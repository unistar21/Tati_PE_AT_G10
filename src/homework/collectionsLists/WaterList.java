package homework.collectionsLists;

import homework.collections.Person;
import homework.collections.Water;

import java.util.Arrays;
import java.util.List;

public class WaterList {

    public static void main(String[] args) {
        List<Water> diffwater = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")
        );

        for (Water water : diffwater) {
            System.out.println(water.getColor() + " - " + water.getSmell());
        }


    }
}
