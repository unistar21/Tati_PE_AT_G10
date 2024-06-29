package homework.collections2;

import homework.collections.Bubble;

import java.util.Objects;

public class Books {

    private String name;
    private String author;

    public Books(String name, String autor) {
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
        Books books = (Books) obj;
        return Objects.equals(name, books.name) && Objects.equals(author, books.author);
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
