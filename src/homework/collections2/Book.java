package homework.collections2;

import java.util.Objects;

public class Book {

    private String name;
    private String author;

    public Book(String name, String autor) {
        this.name = name;
        this.author = autor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }


    @Override
    public String toString() {
        return "Book {" +
                "name " + name +
                ", author " + author +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        author = author;
    }
}
