package telran.library.model;

import telran.library.entities.Book;
import telran.library.entities.PickRecord;
import telran.library.entities.Reader;
import telran.library.entities.enums.BooksReturnCode;
import telran.library.models.AbstractLibrary;
import telran.utils.Persistable;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.*;

import static telran.library.entities.enums.BooksReturnCode.*;

public class LibraryMaps extends AbstractLibrary implements ILibrary, Persistable {
    //sprint 2 — новые индексы выдач
    Map<Integer, List<PickRecord>> readersRecords = new HashMap<>();
    Map<Long, List<PickRecord>> bookRecords = new HashMap<>();
    Map<Long, List<PickRecord>> booksRecords = new HashMap<>();
    Map<LocalDate, List<PickRecord>> records = new HashMap<>();
    Map<Long, Book> books = new HashMap<>();
    Map<Integer, Reader> readers = new HashMap<>();
    Map<String, List<Book>> authorBooks = new HashMap<>();


    @Override
    public BooksReturnCode addBookItem(Book book) {
        if (book.getPickPeriod() < minPickPeriod)
            return PICK_PERIOD_LESS_MIN;
        if (book.getPickPeriod() > maxPickPeriod)
            return PICK_PERIOD_GREATER_MAX;
        BooksReturnCode res = books
                .putIfAbsent(book.getIsbn(), book) ==
                null ? OK : BOOK_ITEM_EXISTS;


        return res;
    }


    @Override
    public BooksReturnCode addReader(Reader reader) {
        return readers.putIfAbsent(reader.getReaderId(), reader) == null ? OK : READER_EXISTS;

    }


    @Override
    public BooksReturnCode addBookExemplars(long isbn, int amount) {
        Book book = books.get(isbn);
        if (book == null) {
            return NO_BOOK_ITEM;
        }
        book.setAmount(book.getAmount() + amount);
        return BooksReturnCode.OK;
    }



    @Override
    public Reader getReader(int readerId) {
        return readers.get(readerId);
    }


    @Override
    public Book getBookItem(long isbn) {
        return books.get(isbn);
    }

    // Sprint2 (новое поведение)
    @Override
    public BooksReturnCode pickBook(long isbn, int readerId, LocalDate pickDate) {
        Book book = getBookItem(isbn);
        if (book == null)
            return NO_BOOK_ITEM;
        if (!readers.containsKey(readerId))
            return NO_READER;
        PickRecord record = new PickRecord(isbn, readerId, pickDate);
        addToBookRecords(record);
        addToBooksRecords(record);
        addToReaderRecords(record);
        addToRecords(record);
        return OK;
    }

    private void addToRecords(PickRecord record) {
        records.computeIfAbsent(record.getReturnDate(),k->new ArrayList<>()).add(record);

    }

    private void addToReaderRecords(PickRecord record) {
        readersRecords.computeIfAbsent(record.getReaderId(),k->new ArrayList<>()).add(record);

    }

    private void addToBooksRecords(PickRecord record) {
        booksRecords.computeIfAbsent(record.getIsbn(),k->new ArrayList<>()).add(record);
    }

    private void addToBookRecords(PickRecord record) {
        bookRecords.computeIfAbsent(record.getIsbn(),k->new ArrayList<>()).add(record);
    }

    @Override
    public List<Book> getBooksPickedByReader(int readerId) {
        List<PickRecord> listRecords = readersRecords.getOrDefault(readerId, new ArrayList<>());
        return listRecords.stream().map(r -> getBookItem(r.getIsbn())).distinct().toList();
    }

    @Override
    public List<Reader> getReadersPickedBook(long isbn) {
        List<PickRecord> listRecords = bookRecords.getOrDefault(isbn, new ArrayList<>());
        return listRecords.stream().map(r -> getReader(r.getReaderId())).distinct().toList();
    }

    @Override
    public List<Book> getBooksAuthor(String authorName) {
        List<Book> res = authorBooks.getOrDefault(authorName, new ArrayList<>());
        return res.stream().toList();
    }

    @Override
    public List<PickRecord> getPickedRecordsAtDates(LocalDate from, LocalDate to) {
        Collection<List<PickRecord>> res = ((TreeMap<LocalDate, List<PickRecord>>) records).subMap(from, to).values();
        return res.stream().flatMap(l -> l.stream()).toList();
    }


    @Override
    public BooksReturnCode addReaderItem(Reader reader) {
        return readers.putIfAbsent(reader.getReaderId(), reader) == null ? OK : READER_EXISTS;
    }


    @Override
    public void save(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(this);
        } catch (IOException e) {
            System.out.println("Error in method save " + e.getMessage());
        }
    }


}
