package ManagementBook.model;

public abstract class Book {

    private final int id;
    private final String dateImport;
    private final double price;
    private final double quantity;
    private final String author;

    public Book(int id, String dateImport, double price, double quantity, String author) {
        this.id = id;
        this.dateImport = dateImport;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
    }


    public int getId() {
        return id;
    }

    public String getDateImport() {
        return dateImport;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getAuthor() {
        return author;
    }

    public abstract double caculate();

}
