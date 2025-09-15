package telran.library.model;

import telran.library.entities.Book;
import telran.library.entities.PickRecord;
import telran.library.entities.Reader;
import telran.library.entities.enums.BooksReturnCode;

import java.time.LocalDate;
import java.util.List;

public interface ILibrary {

    BooksReturnCode addBookItem(Book book);

    BooksReturnCode addReader(Reader reader);

    BooksReturnCode addBookExemplars(long isbn, int amount);

    Reader getReader(int readerId);

    Book getBookItem(long isbn);


    //sprint 2
    BooksReturnCode pickBook(long isbn, int readerId, LocalDate pickDate);

    List<Book> getBooksPickedByReader(int readerId);

    List<Reader> getReadersPickedBook(long isbn);

    List<Book> getBooksAuthor(String authorName);

    List<PickRecord> getPickedRecordsAtDates(LocalDate from, LocalDate to);

}
