package telran.library.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class PickRecord implements Serializable {

    private long isbn;
    private int readerId;
    private LocalDate pickDate;
    private LocalDate returnDate;
    private int delayDays;

    public PickRecord(long isbn, int readerId, LocalDate pickDate) {
        this.isbn = isbn;
        this.readerId = readerId;
        this.pickDate = pickDate;
    }

    public long getIsbn() {
        return isbn;
    }

    public int getReaderId() {
        return readerId;
    }

    public LocalDate getPickDate() {
        return pickDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public int getDelayDays() {
        return delayDays;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setDelayDays(int delayDays) {
        this.delayDays = delayDays;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PickRecord that = (PickRecord) object;
        return isbn == that.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "PickRecord{" +
                "isbn=" + isbn +
                ", readerId=" + readerId +
                ", pickDate=" + pickDate +
                ", returnDate=" + returnDate +
                ", delayDays=" + delayDays +
                '}';
    }
}
