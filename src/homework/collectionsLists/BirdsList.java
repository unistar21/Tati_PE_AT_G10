package homework.collectionsLists;

import java.util.Arrays;
import java.util.List;

public class BirdsList {

    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        int counter = 0;

        for (String bird : birds) {
            int counterV = 0;
            String[] signs = bird.split("");

            for (String sign : signs) {
                if (sign.matches("[аоуеия]")) {
                    counterV++;
                }
            }
            if (counterV > 1) {
                counter++;
            }
        }

        System.out.println(counter);

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        birds.set(3, "Синица");
        System.out.println();

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}
