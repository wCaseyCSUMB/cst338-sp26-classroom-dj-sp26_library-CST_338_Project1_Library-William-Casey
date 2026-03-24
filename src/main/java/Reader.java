import Utilities.Code;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static final int CARD_NUMBER_;
    public static final int NAME_;
    public static final int PHONE_;
    public static final int BOOK_COUNT_;
    public static final int BOOK_START_ = 4;
    private int cardNumber;
    private String name;
    private String phone;
    private List<Book> books;

    public Reader(int cardNumber, String name, String phone) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.phone = phone;
        this.books = new ArrayList<Book>();
    }

    public Code addBook(Book bookIn) {

    }

    public Code removeBook(Book bookIn) {

    }

    public boolean hasBook(Book bookIn) {

    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getBookCount() {
        return books.size();
    }

    public boolean equals(Object object) {

    }

    public int hashCode() {

    }

    public String toString() {
        return name + " (#" + cardNumber + ") has checked out {";
    }
}
