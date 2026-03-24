import Utilities.Code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author William Casey
 * Abstract: The reader class works in tandem with the previous Book class, storing
 * them in a list, allowing the adding and removing the books at will
 */
public class Reader {
    public static final int CARD_NUMBER_ = 3;
    public static final int NAME_ = 0;
    public static final int PHONE_ = 1;
    public static final int BOOK_COUNT_ = 2;
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
        if(hasBook(bookIn)) {
            return Code.BOOK_ALREADY_CHECKED_OUT_ERROR;
        }
        books.add(bookIn);
        return Code.SUCCESS;
    }

    public Code removeBook(Book bookIn) {
        if(! hasBook(bookIn)) {
            return Code.READER_DOESNT_HAVE_BOOK_ERROR;
        }
        books.remove(bookIn);
        return Code.SUCCESS;
    }

    public boolean hasBook(Book bookIn) {
        for(int i = 0; i < books.size(); i++) {
            if(bookIn.equals(books.get(i))) {
                return true;
            }
        }
        return false;
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
        if(this == object) {
            return true;
        }
        Reader compare = (Reader) object;
        return cardNumber == compare.getCardNumber() && name.equals(compare.getName()) && phone.equals(compare.getPhone());
    }

    public int hashCode() {
        int hash = Integer.hashCode(cardNumber);
        hash = 31 * hash + name.hashCode();
        hash = 31 * hash + phone.hashCode();
        return hash;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < books.size(); i++) {
            sb.append(books.get(i).toString());
            sb.append(", ");
        }
        return name + " (#" + cardNumber + ") has checked out {" + sb.toString() + "}";
    }
}
