package classwork;

import java.util.ArrayList;
import java.util.List;

public class Class2 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String str = "мама мыла раму";
        String[] str2 = str.split(" ");
        System.out.println(str2);

        for (String s : str2) {
            myList.add(s);

        }
        for (String word : myList) {
            System.out.println(word);
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

    }
}