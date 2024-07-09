package homework.thread;

import java.util.ArrayList;
import java.util.List;

public class Thread1 {

    public static void main(String[] args) {

        List<Mouse> mouseList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            mouseList.add(new Mouse(i));
        }

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                for (Mouse mouse : mouseList) {
                    mouse.peep();
                }
            }).start();
        }
    }
}
