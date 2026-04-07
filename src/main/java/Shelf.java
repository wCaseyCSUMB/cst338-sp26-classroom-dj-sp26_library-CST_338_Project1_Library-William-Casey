import Utilities.Code;

import java.util.HashMap;

/**
 * @author William Casey
 * Abstract: The shelf class is representative of a shelf in a library,
 * where you are able to shelve books based on their respective genres,
 * works in tandem with the previous classes
 */
public class Shelf {
    public final int SHELF_NUMBER_ = 0;
    public final int SUBJECT_ = 1;
    private HashMap<Book, Integer> books;
    private int shelfNumber;
    private String subject;

    public Shelf() {
        this(0, "");
    }

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
        if (books.containsKey(book)) {
            books.put(book, books.get(book) + 1);
            System.out.println(book.toString() + " added to shelf " + this.toString());
            return Code.SUCCESS;
        }

        if (!book.getSubject().equals(this.subject)) {
            return Code.SHELF_SUBJECT_MISMATCH_ERROR;
        }
        //come back to this !!!!!
        books.put(book, 1);
        System.out.println(book.toString() + " added to shelf " + this.toString());
        return Code.SUCCESS;
    }

    public Code removeBook(Book book) {
        if (!books.containsKey(book)) {
            System.out.println(book.getTitle() + " is not on shelf " + subject);
            return Code.BOOK_NOT_IN_INVENTORY_ERROR;
        }

        int count = books.get(book);

        if (count <= 1) {
            books.remove(book);
        } else {
            books.put(book, count - 1);
        }

        System.out.println(book.getTitle() + " successfully removed from shelf " + subject);
        return Code.SUCCESS;
    }

    public int getBookCount(Book book) {
        //very useful method, trims a lot of code down to one line !!!!!
        return books.getOrDefault(book, 0);
    }

    public String listBooks() {
        StringBuilder sb = new StringBuilder();
        int totalBooks = 0;

        for (int count : books.values()) {
            totalBooks += count;
        }
        sb.append(totalBooks);
        if (totalBooks == 1) {
            sb.append(" book on shelf: ");
        } else {
            sb.append(" books on shelf: ");
        }
        sb.append(this.toString()).append("\n");

        for (Book book : books.keySet()) {
            sb.append(book.toString()).append(" ").append(books.get(book)).append("\n");
        }

        return sb.toString();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Shelf compare = (Shelf) object;
        return shelfNumber == compare.shelfNumber && subject.equals(compare.subject);
    }
//similar structure to the previous classes !!!!!
    public int hashCode() {
        int hash = Integer.hashCode(shelfNumber);
        hash = 31 * hash + subject.hashCode();
        return hash;
    }

    public String toString() {
        return shelfNumber + " : " + subject;
    }
}
