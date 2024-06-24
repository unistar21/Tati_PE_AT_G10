package classwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Class3 {

    public static void main(String[] args) {

        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();
        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            myList1.add("hii" + i);

        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            myList2.add("hii" + i);

        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            myList1.get(i);
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            myList2.get(i);
        }
        System.out.println(System.currentTimeMillis() - t0);

    }

}
