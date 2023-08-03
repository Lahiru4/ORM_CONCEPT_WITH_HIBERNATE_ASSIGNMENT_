import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Session session = FactoryConfiguration.getInstance().getSession();
    public static Transaction transaction = session.beginTransaction();

    public static void main(String[] args) {
        home_page();
    }

    private static void home_page() {
        System.out.println("-------------------------------------------");
        System.out.println("|        [1] Book and Author Save         |");
        System.out.println("\n|        [2] Book and Author Update       |");
        System.out.println("\n|        [3] Book and Author Delete       |");
        System.out.println("\n|        [4] Book and Author Search       |");
        System.out.println("-------------------------------------------");

        h001:
        while (true) {
            System.out.print("\nSelect Option :");
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
        Book book = new Book("001", "sergfesrg", "00551", "kumarasiri");

        try {
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
        try {
            session.update(new Book("001","jivitha ","8664646se","ashok"));
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        System.out.println("updateBookAndAuthor okay .... 😊😊 ...");

    }

    private static void deleteBookAndAuthor() {
        try {
            session.detach(new Book("001","jivitha kathawa","8664646se","ashok"));
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        System.out.println("deleteBookAndAuthor okay .... 😊😊 ...");
    }

    private static void searchBookAndAuthor() {
        try {
            Book book = session.get(Book.class, "001");
            System.out.println(book.getBooK_id()+"/"+book.getTitle()+"/"+book.getIsbm()+"/"+book.getAuthor());
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        System.out.println("searchBookAndAuthor okay .... 😊😊 ...");
    }
}
