import models.Box;
import models.Book;

public class Main {
    public static void main(String[] args) {

        // Testing solutions for Question 1 ~ 8
        // can be found in the "solutions" package

        // Testing model for Question 9
        Book myBook = new Book("To Kill a Mockingbird");
        myBook.setBookID(234234);
        myBook.setGenres("Southern Gothic");
        myBook.setPrice(30.69);
        System.out.println("My book is " + myBook.getName() +
                           ", which falls into the genres of " + myBook.getGenres() +
                           ". Its ID is " + myBook.getBookID() +
                           ", and its price is $" + myBook.getPrice() + ".");

        // Testing model for Question 10
        Box myBox = new Box(8.5,6.6,9);
        System.out.println("The volume is " + myBox.calculateVolume());
    }
}
