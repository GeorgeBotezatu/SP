package services;
import models.Book;

public class DocumentManager {
    private Book book;
    private static DocumentManager instance;


    public DocumentManager() {

    }

    public Book getBook() {
        return book;
    }
    public static DocumentManager getInstance() {
        if (instance == null)
            instance = new DocumentManager();

        return instance;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
