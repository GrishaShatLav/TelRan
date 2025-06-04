package telran.book.controller;

import telran.book.dao.Library;
import telran.book.model.Book;

public class LibraryAppl {
    public static void main(String[] args) {
//        Book book1 = new Book(2000000000001L, "Book1", 1965);
//        Library library = new Library(7);
//        library.addBook(book1);
//        library.addBook(book1);
//        library.addBook(book1);
//        library.addBook(book1);
//        library.addBook(book1);
//        library.addBook(book1);
//        library.addBook(book1);
//        library.addBook(book1);
//        library.printBooks();
//        System.out.println("Size: "+library.getSize());
    Library library = new Library(8);
        System.out.println(library.addBook(new Book(2000000000001l, "Book1",  1984)));
        System.out.println(library.addBook(new Book(2000023200001l, "Book2", "Bob", 1999)));
        System.out.println(library.addBook(new Book(2000469400001l, "Book3", "Chungus", 2001)));
        library.printBooks();
        System.out.println(library.findBookByTitle("Book3"));
        System.out.println(library.removeBookByTitle("Book3"));
        System.out.println("===================");
        System.out.println(library.updateBook("Chungus","Steve"));
        System.out.println("===================");
        library.printBooksYear(1984);
        System.out.println("===================");
        library.printBooksYear2Year(1984,1989);
        System.out.println("===================");
        System.out.println(library.findBookByTitle("Book11"));

    }
}
