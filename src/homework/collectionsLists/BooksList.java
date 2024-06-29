package homework.collectionsLists;

import homework.collections2.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BooksList {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Война и мир", "Толстой"));
        books.add(new Book("Преступление и наказание", "Достоевский"));
        books.add(new Book("Мастер и Маргарита", "Булгаков"));

        for (Book book : books) {
            System.out.print(book.getName() + " ");
        }
        System.out.println();

        Map<String, String> bookMap = new HashMap<>();

        for (Book book : books) {
            bookMap.put(book.getName(), book.getAuthor());
        }

        for (String key : bookMap.keySet()) {
            System.out.println(key + " ");
            ;
        }

        for (String value : bookMap.values()) {
            System.out.println(value + " ");
            ;
        }

        for (Map.Entry<String, String> entry : bookMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
            ;
        }

    }
}
