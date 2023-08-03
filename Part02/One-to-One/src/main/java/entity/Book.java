package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Book {
    @Id
    private String booK_id;
    private String title;

    private String isbm;
    @OneToOne
    private Author author;

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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book() {
    }

    public Book(String booK_id, String title, String isbm, Author author) {
        this.booK_id = booK_id;
        this.title = title;
        this.isbm = isbm;
        this.author = author;
    }


}
