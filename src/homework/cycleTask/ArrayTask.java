package cycleTask;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask {

    public void printArray() {
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("исходный массив  " + Arrays.toString(array));
        //обратный массив
        System.out.print("обратный массив  ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        //*5
        System.out.println();
        for (int i = 0; i < 7; i++) {
            array[i] = array[i] * 5;
        }
        System.out.println("массив*5   " + Arrays.toString(array));
        //^2
        for (int i = 0; i < 7; i++) {
            array[i] = array[i] * array[i];
        }
        System.out.println("массив^2   " + Arrays.toString(array));

    }
}
