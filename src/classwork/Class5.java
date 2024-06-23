package classwork;

import java.util.*;

public class Class5 {

    public static void main(String[] args) {

        Set<String> mySet1 = new HashSet<>();
        Set<String> mySet2 = new HashSet<>();
        long t0 = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            mySet1.add("hii" + i);

        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            mySet2.add("hii" + i);

        }

        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();
        for (String s : mySet1) {
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();
        for (String str : mySet2) {
        }
        System.out.println(System.currentTimeMillis() - t0);

    }

}


