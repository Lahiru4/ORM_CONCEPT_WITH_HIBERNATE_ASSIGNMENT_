import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

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
        Author author = new Author("002", "Kumara", "kumara@gmail.com");
        Book book = new Book("002", "Hansa Sandeshaya", "sdrfg055054wser", author);
        try {
            session.persist(author);
            session.persist(book);
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
        Author author = new Author("002", "Aanula", "Aanula@gmail.com");
        Book book = new Book("002", "Hansa Sandeshaya", "sdrfg055054wser", author);
        try {
            session.update(author);
            session.update(book);
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
        Author author = new Author("002", "Aanula", "Aanula@gmail.com");
        Book book = new Book("002", "Hansa Sandeshaya", "sdrfg055054wser", author);
        try {
            session.delete(author);
            session.delete(book);
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
            Author author = session.get(Author.class, "002");
            Book book = session.get(Book.class, "002");
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        System.out.println("deleteBookAndAuthor okay .... 😊😊 ...");
    }


}
