package classwork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Class6 {

    public static void main(String[] args) {

        Map<Integer, String> words = new HashMap<>();

        String str = "мама мыла раму";
        String[] str2 = str.split(" ");

        for (int i = 0; i < str2.length; i++) {
            words.put(i, str2[i]);
            //System.out.println(words.get(i));
        }
        Set<Integer> keys = words.keySet();

        for (Integer key : keys) {
            System.out.println(key);
        }

        Collection<String> values = words.values();

        for (String value : values) {
            System.out.println(value);
        }

    }
}
