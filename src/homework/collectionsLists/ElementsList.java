package homework.collectionsLists;

import java.util.ArrayList;
import java.util.List;

public class ElementsList {

    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();

        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String element : elements) {
            System.out.print(element + " ");
        }

        int counter = 0;

        for (String element : elements) {
            if (element.contains(" ") || element.contains("-")) {
                counter++;
            }
        }

        System.out.println();
        System.out.println(counter);

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        for (String element : elements) {
            System.out.print(element + " ");
        }

    }
}
