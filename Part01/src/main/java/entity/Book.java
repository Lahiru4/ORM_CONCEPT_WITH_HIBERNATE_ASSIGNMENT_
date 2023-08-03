package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Book {
    @Id
    private String booK_id;
    private String title;

    private String isbm;
    private String author;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
    }

    public Book(String booK_id, String title, String isbm, String author) {
        this.booK_id = booK_id;
        this.title = title;
        this.isbm = isbm;
        this.author = author;
    }
}
