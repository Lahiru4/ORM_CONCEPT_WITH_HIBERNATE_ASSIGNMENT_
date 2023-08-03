import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        home_page();
    }

    private static void home_page() {
        System.out.println("|        [1] Book and Author Save         |");
        System.out.println("\n|        [2] Book and Author Update       |");
        System.out.println("\n|        [3] Book and Author Delete       |");
        System.out.println("\n|        [4] Book and Author Search       |");

        h001:
        while (true) {
            System.out.print("\nSelect Option : ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    saveBookAndAuthor();
                    break;
                case 2:
                    updateBookAndAuthor();
                    break;
                case 3:
                    deleteBookAndAuthor();
                    break;
                case 4:
                    searchBookAndAuthor();
                    break;
                default:
                    System.out.println("Invalid Input, Try Again!!");
                    continue h001;
            }
        }
    }

    private static void saveBookAndAuthor() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Author kumar = new Author("001", "kumar", null);
        Book hansaSandeshaya = new Book("001", "Hansa Sandeshaya", "8485485eeefyj", null);
        List<Author> authors=new ArrayList<Author>();
        authors.add(kumar);

        List<Book> books=new ArrayList<Book>();
        books.add(hansaSandeshaya);


        hansaSandeshaya.setAuthors(authors);
        kumar.setBooks(books);


        try {
            session.persist(kumar);
            session.persist(hansaSandeshaya);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        System.out.println("saveBookAndAuthor okay .... 😊😊 ...");
    }

    private static void updateBookAndAuthor() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        Author kumar = new Author("001", "kumar", null);
        Book hansaSandeshaya = new Book("001", "Hansa Sandeshaya", "8485485eeefyj", null);
        List<Author> authors=new ArrayList<Author>();
        authors.add(kumar);

        List<Book> books=new ArrayList<Book>();
        books.add(hansaSandeshaya);


        hansaSandeshaya.setAuthors(authors);
        kumar.setBooks(books);

        try {
            session.update(kumar);
            session.update(hansaSandeshaya);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        System.out.println("updateBookAndAuthor okay .... 😊😊 ...");

    }

    private static void deleteBookAndAuthor() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        Author kumar = new Author("001", "kumar", null);
        Book hansaSandeshaya = new Book("001", "Hansa Sandeshaya", "8485485eeefyj", null);
        List<Author> authors=new ArrayList<Author>();
        authors.add(kumar);

        List<Book> books=new ArrayList<Book>();
        books.add(hansaSandeshaya);


        hansaSandeshaya.setAuthors(authors);
        kumar.setBooks(books);

        try {
            session.delete(kumar);
            session.delete(hansaSandeshaya);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        System.out.println("deleteBookAndAuthor okay .... 😊😊 ...");
    }

    private static void searchBookAndAuthor() {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        try {
            Author author = session.get(Author.class, "001");
            Book book = session.get(Book.class, "001");
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        System.out.println("searchBookAndAuthor okay .... 😊😊 ...");
    }


}
