package classwork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            System.out.printf("Just got '%s' text !", incoming);
            if("все".equalsIgnoreCase(incoming)){
                return;

            }
        }
        scanner.close();
    }
}