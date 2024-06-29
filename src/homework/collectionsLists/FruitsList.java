package homework.collectionsLists;

import homework.collections2.Fruit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitsList {

    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("Яблоко", 120));
        fruits.add(new Fruit("Банан", 80));
        fruits.add(new Fruit("Груша", 150));
        fruits.add(new Fruit("Апельсин", 200));

        for (Fruit fruit : fruits) {
            System.out.print(fruit.getName() + " ");
        }

        System.out.println();

        for (Fruit fruit : fruits) {
            System.out.print(fruit.getWeight() + " ");
        }

        Map<Integer, Fruit> fruitMap = new HashMap<>();

        fruitMap.put(1, fruits.get(0));
        fruitMap.put(2, fruits.get(1));
        fruitMap.put(3, fruits.get(2));
        fruitMap.put(4, fruits.get(3));

        fruitMap.keySet().stream().map(key -> key + " ").forEach(System.out::print);

        System.out.println();

        for (Fruit fruit : fruitMap.values()) {
            System.out.print(fruit + " ");
        }

        System.out.println();

        for (Map.Entry<Integer, Fruit> entry : fruitMap.entrySet())
            System.out.println(entry.getKey() + "--" + entry.getValue());


    }


}
