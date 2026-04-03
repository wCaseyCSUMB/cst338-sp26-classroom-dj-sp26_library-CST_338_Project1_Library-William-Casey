import Utilities.Code;

import java.util.HashMap;

public class Shelf {
    public final int SHELF_NUMBER_ = 0;
    public final int SUBJECT_ = 1;
    private HashMap<Book, Integer> books;
    private int shelfNumber;
    private String subject;

    public Shelf(int shelfNumber, String subject) {
        this.shelfNumber = shelfNumber;
        this.subject = subject;
        books = new HashMap<>();
    }

    public HashMap<Book, Integer> getBooks() {
        return books;
    }

    public void setBooks(HashMap<Book, Integer> books) {
        this.books = books;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Code addBook(Book book) {

    }

    public Code removeBook(Book book) {

    }

    public int getBookCount(Book book) {

    }

    public String listBooks() {

    }

    public boolean equals(Object compare) {

    }

    public int hashCode() {
        int hash = Integer.hashCode(shelfNumber);
        hash = 31 * hash + subject.hashCode();
        return hash;
    }

    public String toString() {
        return shelfNumber + " : " + subject;
    }
}
