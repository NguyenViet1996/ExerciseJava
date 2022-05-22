package ManagementBook;

import ManagementBook.business.Manager;
import ManagementBook.model.ReferenceBook;
import ManagementBook.model.TextBook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please select :");
            System.out.println(" 1.Enter the information of book ");
            System.out.println(" 2.View the list of book ");
            System.out.println(" 3.Caculate the total price of each type of book and view the information ");
            System.out.println(" 4.View the text book has a name of author that you want to find");
            System.out.println(" 5.Exit");
            int selectUser  = Integer.parseInt(scanner.nextLine());
            if (selectUser == 1) {
                addNewBook(manager, scanner);
            } else if (selectUser == 2) {
                manager.viewInforBook();
            } else if (selectUser == 3) {
                manager.viewSumPriceBook();
            } else if (selectUser == 4) {
                findTextBook(manager, scanner);
            } else if (selectUser == 5) {
                break;
            }
        }

    }

    public static void addNewBook(Manager manager, Scanner scanner) {
        System.out.println("Enter id of book : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter date of importing book (day/month/year) :");
        String dateImport = scanner.nextLine();
        System.out.println("Enter price : ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter quantity : ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter author : ");
        String author = scanner.nextLine();
        System.out.println("Enter type of book : ");
        String typeOfBook = scanner.nextLine();
        if (typeOfBook.equalsIgnoreCase("text book")) {
            System.out.println("Enter status of book : ");
            String status  = scanner.nextLine();
            manager.insert(new TextBook(typeOfBook, id, dateImport, price, quantity, author, status));
        } else if (typeOfBook.equalsIgnoreCase("reference book")) {
            System.out.println("Enter tax : ");
            double tax = Double.parseDouble(scanner.nextLine());
            manager.insert(new ReferenceBook(typeOfBook, id, dateImport, price, quantity, author, tax));
        }

    }

    public static void findTextBook(Manager manager, Scanner scanner) {
        System.out.println("Enter the name of author of text book that you wan to find ");
        String name = scanner.nextLine();
        manager.findBook(name);
    }

}
