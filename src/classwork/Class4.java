package classwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Class4 {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        String str = "мама мыла раму";
        String[] str2 = str.split(" ");
        System.out.println(str2);

        for (String s : str2) {
            mySet.add(s);

        }
        for (String word : mySet) {
            System.out.println(word);
        }
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
