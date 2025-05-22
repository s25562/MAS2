package pck;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book){
        if(!this.books.containsKey(book.getIsbn())){
            books.put(book.getIsbn(), book);
            book.setLibrary(this);
        }
    }

    public Book findBook(String isbn) throws Exception{
        if(!books.containsKey(isbn)){
            throw new Exception("There is no book with ISBN: " + isbn);
        }
        return books.get(isbn);
    }

}
