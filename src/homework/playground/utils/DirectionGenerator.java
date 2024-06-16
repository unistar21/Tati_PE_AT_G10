package homework.playground.utils;

import java.util.Random;

public class DirectionGenerator {

    public static String generateDirection() {
        Random random = new Random();
        int n = random.nextInt(1, 39);

        if (n < 9) {
            return "NORTH";
        } else if (10 <= n && n <= 20) {
            return "SOUTH";
        } else if (20 < n && n <= 29) {
            return "WEST";
        } else if (30 <= n && n <= 39) {
            return "EAST";
        } else  {
            return "UNKNOWN";
        }

    }


}
