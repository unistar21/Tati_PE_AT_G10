package homework.collectionsLists;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MetalsList {

    public static void main(String[] args) {
        Map<Integer, String> elements = new HashMap<>();

        elements.put(1, "Silicon");
        elements.put(2, "Sulfur");
        elements.put(3, "Argon");
        elements.put(4, "Calcium");
        elements.put(5, "Chromium");
        elements.put(6, "Iron");
        elements.put(7, "Zinc");

        for (String element : elements.values()) {
            System.out.print(element + " ");
        }
        System.out.println();

        int counter = 0;

        for (String element : elements.values()) {
            if (element.contains("u")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (String element : elements.values()) {
            System.out.print(element + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, String> element : elements.entrySet()) {
            System.out.println(element.getKey() + "-" + element.getValue());
        }

        elements.put(4, "Selenium");
        elements.remove(2);

        for (Map.Entry<Integer, String> element : elements.entrySet()) {
            System.out.println(element.getKey() + "-" + element.getValue());
        }

    }
}
