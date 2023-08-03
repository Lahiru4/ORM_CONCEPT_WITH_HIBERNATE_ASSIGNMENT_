package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {
    @Id
    private String booK_id;
    private String title;

    private String isbm;
    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    public String getBooK_id() {
        return booK_id;
    }

    public void setBooK_id(String booK_id) {
        this.booK_id = booK_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Book(String booK_id, String title, String isbm, List<Author> authors) {
        this.booK_id = booK_id;
        this.title = title;
        this.isbm = isbm;
        this.authors = authors;
    }

    public Book() {
    }

}
