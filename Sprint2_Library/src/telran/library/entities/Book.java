package telran.library.entities;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {

    private long isbn;
    private String title;
    private String author;
    private int amount;
    private int amountInUse;
    private int pickPeriod;

    public Book(){

    }

    public Book(int amount, String author, String title, long isbn, int pickPeriod) {
        if(isbn>0)
            this.isbn = isbn;
        this.author = author;
        this.title = title;
        if(amount>=0)
        this.amount = amount;
        if(pickPeriod>0)
        this.pickPeriod = pickPeriod;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountInUse() {
        return amountInUse;
    }

    public void setAmountInUse(int amountInUse) {
        this.amountInUse = amountInUse;
    }

    public int getPickPeriod() {
        return pickPeriod;
    }

    public void setPickPeriod(int pickPeriod) {
        if(pickPeriod>0);
        this.pickPeriod = pickPeriod;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", amount=" + amount +
                ", amountInUse=" + amountInUse +
                ", pickPeriod=" + pickPeriod +
                '}';
    }
}
