import java.time.LocalDate;

public class Book {
    public static final int AUTHOR_;
    public static final int DUE_DATE_;
    public static final int ISBN_;
    public static final int PAGE_COUNT_;
    public static final int SUBJECT_;
    public static final int TITLE_;
    private String author;
    private LocalDate dueDate;
    private String isbn;
    private int pageCount;
    private String subject;
    private String title;

    public Book(String author, String isbn, String subject, String title, int pageCount, LocalDate dueDate) {
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

    }

    public int hashCode() {

    }

    public String toString() {

    }

}
