package homework.output;

import java.io.*;

public class Task3 {

    private String removeVowels(String text) {
        return text.replaceAll("[AEIOUaeiou]", "");
    }


    public void read() {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newtext = removeVowels(content.toString());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            writer.write(newtext);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.read();

    }
}
