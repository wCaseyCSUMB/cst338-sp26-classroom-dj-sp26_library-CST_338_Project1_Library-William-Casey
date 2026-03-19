import java.time.LocalDate;
import java.util.Objects;

/**
 * @author William Casey
 *
 * Abstract: The book class is used to store data relevant to a book in order to
 * later be implemented into the greater classes like shelf and library.
 */
public class Book {
    public static final int ISBN_ = 0;
    public static final int TITLE_ = 1;
    public static final int SUBJECT_ = 2;
    public static final int PAGE_COUNT_ = 3;
    public static final int AUTHOR_ = 4;
    public static final int DUE_DATE_ = 5;
    private String author;
    private LocalDate dueDate;
    private String isbn;
    private int pageCount;
    private String subject;
    private String title;

    public Book(String isbn, String title, String subject, int pageCount, String author, LocalDate dueDate) {
        this.author = author;
        this.isbn = isbn;
        this.subject = subject;
        this.title = title;
        this.pageCount = pageCount;
        this.dueDate = dueDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        Book book = (Book) object;
        return pageCount == book.pageCount && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn) && Objects.equals(subject, book.subject) && Objects.equals(title, book.title);

    }

    public int hashCode() {
        return Objects.hash(author, isbn, subject, title, pageCount);
    }

    public String toString() {
        return title + " by " + author + " ISBN: " + isbn;
    }

}
