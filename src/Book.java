import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String title;
    private final String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isBorrowed() { return borrowed; }

    public boolean borrow() {
        if (borrowed) return false;
        borrowed = true;
        return true;
    }

    public boolean returnBook() {
        if (!borrowed) return false;
        borrowed = false;
        return true;
    }

    @Override
    public String toString() {
        return "\"" + title + "\" — " + author + (borrowed ? " (olingan)" : " (mavjud)");
    }
}
