import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test_Library {
    public static void main(String[] args) {

        Book  book1=new Book(1,"With Math","maxi");
        Book  book2=new Book(2,"Coder","joe");
        Book  book3=new Book(3,"The Story of code","Mary");
        Book book4= new Book(4,"just learn coding","josef");
        Book  book5=new Book(5,"how  to pass Ex","maia");




        HashMap<Integer,Book> books=new HashMap<>();
        books.put(book1.getId(),book1);
        books.put(book2.getId(),book2);
        books.put(book3.getId(),book3);
        books.put(book4.getId(),book4);
        books.put(book5.getId(),book5);



        LibraryUser libraryUser=new LibraryUser();
        libraryUser.setName("ali");


        Library library=new Library(books);
        library.setName("city book");

        System.out.println("\n"+"Books in library");
        library.printBooksInTheLibrary();



        System.out.println("\n"+"a book rented by"+"\t"+libraryUser.getName());


        Date date1=new Date(2020,8,12);
        Date date2= new Date(2020,9,20);

        library.rentBook(libraryUser,book1,new Rent(date1,date2));

        libraryUser.disPlaybooksRented();

        System.out.println("the name of library"+library.getName());






    }
}
