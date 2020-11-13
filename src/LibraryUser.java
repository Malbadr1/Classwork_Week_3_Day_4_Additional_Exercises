import java.util.ArrayList;

public class LibraryUser {

    private String name;

    private ArrayList<Book> booksRented = new ArrayList<>();

    public LibraryUser() {
        this.name = name;
        this.booksRented = booksRented;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooksRented() {

        return booksRented;
    }

    public void attachBook(Book book) {

        this.booksRented.add(book);
    }
    public void  disPlaybooksRented(){
        for (Book element :booksRented){
            System.out.println(element);
        }
    }
}
