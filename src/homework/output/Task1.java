package homework.output;

import java.util.Scanner;

public class Task1 {

    public void frase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, I just got '" + scanner.nextLine() + "' from you!");
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.frase();
    }
}
