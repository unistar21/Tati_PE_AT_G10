package homework.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {

    public void message() {
        Scanner scanner = new Scanner(System.in);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
            out.write("Hello, I just got '" + scanner.nextLine() + "' from you!");
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            scanner.close();
        }

    }

    public static void main(String[] args) {
        Task2 task2=new Task2();
        task2.message();
    }

}

