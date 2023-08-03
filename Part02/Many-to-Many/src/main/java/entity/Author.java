package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author{
    @Id
    private String author_id;
    private String author_name;

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Author(String author_id, String author_name, List<Book> books) {
        this.author_id = author_id;
        this.author_name = author_name;
        this.books = books;
    }

    @ManyToMany
    private List<Book> books;

    public Author() {
    }

}
