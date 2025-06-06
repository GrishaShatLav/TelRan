package telran.book.dao;

import telran.book.model.Book;

public class Library {
    Book[] books;
    int size;

    public Library(int capacity ){
        books = new Book[capacity];
    }



    public boolean addBook(Book book){
       //!
        if (books.length == size)
            return false;
        books[size] = book;
        size++;
        return true;
    }
    public Book removeBookByTitle(String title){
        for (int i = 0; i < size; i++) {
            if(books[i].getTitle().equals(title)){
                Book victim = books[i];
                books[size-1] = null;
                size --;
                books[i] = books[size-1];
                return victim;
            }

        }
        return null;
    }
    public Book findBookByTitle(String title){
        for (int i = 0; i < size; i++) {
            if(books[i].getTitle().equals(title)){
                return books[i];
            }

        }
        return null;
    }

    public Book updateBook(String author, String newAuthor){
        for (int i = 0; i < size; i++) {
            if(books[i].getAuthor().equals(author)){
                books[i].setAuthor(newAuthor);
                return books[i];
            }

        }
        return null;
    }

    public void printBooks(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }
    }

    public void printBooksYear(int year){
        for (int i = 0; i < size; i++) {
            if(year <= books[i].getYearOfPublishing()) {
                System.out.println(books[i]);
            }

        }
    }

    public void printBooksYear2Year(int fromYear, int toYear){
        for (int i = 0; i < size; i++) {
            if(fromYear <= books[i].getYearOfPublishing()&&books[i].getYearOfPublishing() <=toYear) {
                System.out.println(books[i]);
            }

        }
    }

    public int getSize(){
        return size;
    }
    public int printBooksTitle(String title){
        for (int i = 0; i < size; i++) {
            if(title.equals(books[i].getTitle())) {
                System.out.println(i);
                return i;
            }

        }
        System.out.println(-1);
        return -1;
    }
}
