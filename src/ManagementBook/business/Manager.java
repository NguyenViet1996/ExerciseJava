package ManagementBook.business;

import ManagementBook.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager {

    private final List<Book> listBook;

    public Manager() {
        this.listBook = new ArrayList<>();
    }

    public void insert(Book book) {
        this.listBook.add(book);
    }

    public void viewInforBook() {
        if (this.listBook.size() == 0 ) {
            System.out.println("The list has not book");
        } else {
            for (Book book : this.listBook) {
                System.out.println(book);
            }
        }
    }

    public void viewSumPriceBook() {
        double sumPriceReferenceBook = 0;
        double sumPriceTextBook = 0;
        String referenceBook = "reference book";
        String textBook = "text book";
        for (Book book : this.listBook) {
            if (book.getTypeOfBook().equalsIgnoreCase(textBook)) {
                sumPriceTextBook += book.caculate();
            } else if (book.getTypeOfBook().equalsIgnoreCase(referenceBook)) {
                sumPriceReferenceBook += book.caculate();
            }
        }
        System.out.println(sumPriceReferenceBook != 0 ? "the total price of reference book : "
                + sumPriceReferenceBook : "The list book do not have a reference book" );
        System.out.println(sumPriceTextBook != 0 ? "the total price of text book : "
                + sumPriceTextBook : "The list book do not have a text book" );
    }

    public void findBook(String name) {
        List<Book> listTextBookFind = this.listBook.stream().filter(book -> book.getTypeOfBook().equalsIgnoreCase("text book")
                && book.getAuthor().equalsIgnoreCase(name)).collect(Collectors.toList());
        if (listTextBookFind.size() != 0) {
            for (Book book : listTextBookFind) {
                System.out.println(book);
            }
        } else {
            System.out.println("Do not find the text book");
        }
    }

}
