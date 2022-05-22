package ManagementBook.business;

import ManagementBook.model.Book;
import ManagementBook.model.ReferenceBook;
import ManagementBook.model.TextBook;

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
        List<Book> listTexBook = this.listBook.stream().filter(book -> book instanceof TextBook).collect(Collectors.toList());
        List<Book> listReferenceBook = this.listBook.stream().filter(book -> book instanceof ReferenceBook).collect(Collectors.toList());
        if (listTexBook.size() == 0) {
            System.out.println("The list book do not have a text book");
        } else {
            for (Book book : listTexBook) {
                sumPriceTextBook += book.caculate();
            }
            System.out.println("the total price of text book : "
                + sumPriceTextBook);
        }
        if (listReferenceBook.size() == 0) {
            System.out.println("The list book do not have a reference book");
        } else {
            for (Book book : listReferenceBook) {
                sumPriceReferenceBook += book.caculate();
            }
            System.out.println("the total price of reference book : "
                    + sumPriceReferenceBook);
        }

    }

    public void findBook(String name) {
        List<Book> listTextBookFind = this.listBook.stream().filter(book -> book instanceof TextBook
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
