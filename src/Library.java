
import java.util.Date;
import java.util.HashMap;

public class Library {

    private String name;
    private HashMap<Integer,Book> books;

    private Rent rent;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Integer, Book> getBooks() {
        return books;
    }

    public void setBooks(HashMap<Integer, Book> books) {
        this.books = books;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Library(HashMap<Integer,Book> books){
        this.books=books;
    }

    public boolean rentBook(LibraryUser libraryUser,Book book,Rent rent){
        Date rentStart=rent.getRentStart();
        Date rentEnd= rent.getRentEnd();
        libraryUser.attachBook(book);
        books.remove(book.getId());
        System.out.println("the book has  rented by"+"\t"+libraryUser.getName()+"\t"+"until"+"\t"+rent.getRentEnd());
        return true;

    }

    public void printBooksInTheLibrary(){
        for (Book i:books.values()) {
            System.out.println(i);

        }
    }
}
