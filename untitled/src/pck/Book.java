package pck;

public class Book {
    private String isbn;
    private String title;
    private Library library;

    public Book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    public void setLibrary(Library library){
        if (this.library != library){
            this.library = library;
            library.addBook(this);
        }
    }

    public String getIsbn(){
        return this.isbn;
    }
}
